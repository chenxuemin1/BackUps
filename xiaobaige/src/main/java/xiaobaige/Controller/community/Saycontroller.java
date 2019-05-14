package xiaobaige.Controller.community;


import xiaobaige.Controller.Basectrl;
import xiaobaige.Pojo.community.Commenttable;
import xiaobaige.Pojo.community.Followtable;
import xiaobaige.Pojo.community.Saytable;
import xiaobaige.Pojo.community.Uptable;
import xiaobaige.Pojo.system.Usertable;
import xiaobaige.Service.community.Commentservice;
import xiaobaige.Service.community.Followservice;
import xiaobaige.Service.community.Sayservice;
import xiaobaige.Service.community.Upservice;
import xiaobaige.Service.image.Imageservice;
import xiaobaige.Service.system.Userservice;
import xiaobaige.Util.List2Json1;
import xiaobaige.Util.Time_Date;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import xiaobaige.Util.WechatUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;
import static xiaobaige.Controller.index.Indexcontroller.reurl;
import static xiaobaige.Util.MyTask.appid;
import static xiaobaige.Util.MyTask.secter;


/**
 * @author xm@c.com    Administrator
 * @date 2018/4/27 0027 上午 10:35
 */
@Controller
public class Saycontroller extends Basectrl {

    @Autowired
    private Imageservice imageservice;

    @Autowired
    private Upservice upservice;

    @Autowired
    private Sayservice sayservice;

    @Autowired
    private Followservice followservice;

    @Autowired
    private Commentservice commentservice;

    @Autowired
    private Userservice userservice;


    @RequestMapping("/image1")
    public ModelAndView add(Saytable say, MultipartFile file,MultipartFile file2,MultipartFile file3, HttpServletRequest request,Model model) throws Exception {
        if(file!=null){
            out.println(file+"====="+file.getSize());
        }
        if (file2!=null){
            out.println(file2+"====="+file2.getSize());
        }
        if(file3!=null){
            out.println(file3+"====="+file3.getSize());
        }



        String openid = (String)request.getSession().getAttribute("openid");
        say.setPublic_man_openid(openid);
        sayservice.add(say,file,file2,file3);
//        Map<String,Object> result = new HashMap<>();
//        result.put("code",200);
//        return result;
        List<Saytable> saylist = sayservice.sel(openid);
//        List<Saytable> saylist1 = sayservice.sel(openid);
//        List<Saytable> saylist2 = sayservice.sel(openid);
//        List<Saytable> saylist3 = sayservice.sel(openid);
//        List<Saytable> saylist4 = sayservice.sel(openid);
//        List<Saytable> saylist5 = sayservice.sel(openid);

        model.addAttribute("saylist",saylist);

        return new ModelAndView("my_fb");
//        return null;
    }

    @RequestMapping("/del_say")
    public void del_say(int id){
        sayservice.del(id);
//        Map<String,Object> result = new HashMap<>();
//        result.put("code",200);
//        return result;
    }

    /**
     * @动态
     * @param model
     * @return
     */
    @RequestMapping("/circle")
    public ModelAndView circle(Model model,HttpServletRequest request,HttpServletResponse response){
        String openid = (String)request.getSession().getAttribute("openid");

        if(openid==null||openid.isEmpty()){

            try {
                String codeurl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid+"&redirect_uri="+ URLEncoder.encode(reurl,"UTF-8")+"&response_type=code&scope=snsapi_userinfo#wechat_redirect";
                out.println(URLEncoder.encode(reurl,"UTF-8"));
                out.println(codeurl);
                response.sendRedirect(codeurl);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {

            List<Saytable> saylist = sayservice.findall();
            if(saylist==null||saylist.isEmpty()){
                int message = 1;
                model.addAttribute("number",message);
                return new ModelAndView("circle");
            }else {

                JSONArray jsonArray = List2Json1.List2Json(saylist);
                JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"public_time");

                List<Saytable> saytableList = JSONArray.toList(jsonArray1,new Saytable(),new JsonConfig());
//            out.println(saytableList.toString());

                int pl_number = commentservice.pl_number(openid);
                model.addAttribute("pl_number",pl_number);
                model.addAttribute("saylist", saytableList);

                return new ModelAndView("circle");
            }

        }
        model.addAttribute("error","授权失败");
        return new ModelAndView("error1");

    }

    /**
     * @我的关注
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/circle_gz")
    public ModelAndView circle_gz(Model model, HttpServletRequest request,HttpServletResponse response){
        String openid = (String)request.getSession().getAttribute("openid");

        if(openid==null||openid.isEmpty()){

            try {
                String codeurl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid+"&redirect_uri="+ URLEncoder.encode(reurl,"UTF-8")+"&response_type=code&scope=snsapi_userinfo#wechat_redirect";
                out.println(URLEncoder.encode(reurl,"UTF-8"));
                out.println(codeurl);
                response.sendRedirect(codeurl);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {

            List<Saytable> saylist = sayservice.my_gz(openid);
            if(saylist==null||saylist.isEmpty()){
                String message = "1";
                model.addAttribute("number",message);
                return new ModelAndView("circle_gz");
            }else {

                JSONArray jsonArray = List2Json1.List2Json(saylist);
                JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"public_time");

                List<Saytable> saytableList = JSONArray.toList(jsonArray1,new Saytable(),new JsonConfig());
//            out.println(saytableList.toString());

                int pl_number = commentservice.pl_number(openid);
                model.addAttribute("pl_number",pl_number);
                model.addAttribute("saylist", saytableList);
                return new ModelAndView("circle_gz");
            }

        }
        model.addAttribute("error","授权失败");
        return new ModelAndView("error1");
    }

    /**
     * @我的发布
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/my_fb")
    public ModelAndView my_fb(Model model,HttpServletRequest request,HttpServletResponse response) {
        String openid = (String)request.getSession().getAttribute("openid");

        if(openid==null||openid.isEmpty()){

            try {
                String codeurl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid+"&redirect_uri="+ URLEncoder.encode(reurl,"UTF-8")+"&response_type=code&scope=snsapi_userinfo#wechat_redirect";
                out.println(URLEncoder.encode(reurl,"UTF-8"));
                out.println(codeurl);
                response.sendRedirect(codeurl);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {

            //        String openid1 = (String) request.getAttribute("openid");
            List<Saytable> saylist = sayservice.my_fb(openid);
            if(saylist==null||saylist.isEmpty()){
                int message = 1;
                model.addAttribute("number",message);
                return new ModelAndView("my_fb");
            }else {

                JSONArray jsonArray = List2Json1.List2Json(saylist);
                JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"public_time");

                List<Saytable> saytableList = JSONArray.toList(jsonArray1,new Saytable(),new JsonConfig());
//            out.println(saytableList.toString());

                int pl_number = commentservice.pl_number(openid);
                model.addAttribute("pl_number",pl_number);
                model.addAttribute("saylist", saytableList);
                return new ModelAndView("my_fb");
            }

        }
        model.addAttribute("error","授权失败");
        return new ModelAndView("error1");
    }

    /**
     * @创建发布
     * @return
     */
    @RequestMapping("/circle_fb")
    public String circle_fb(HttpServletRequest request,HttpServletResponse response){
        String openid = (String)request.getSession().getAttribute("openid");
        if(openid==null){

            try {
                String codeurl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid+"&redirect_uri="+ URLEncoder.encode(reurl,"UTF-8")+"&response_type=code&scope=snsapi_userinfo#wechat_redirect";
                out.println(URLEncoder.encode(reurl,"UTF-8"));
                out.println(codeurl);
                response.sendRedirect(codeurl);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {

            return "circle_fb";
        }
        return "error1";
    }

    /**
     * @根据用户提供的信息查询说说(gz)
     * @param text
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/gz_fb_query")
    public ModelAndView gz_fb_query(String text ,Model model, HttpServletRequest request,HttpServletResponse response){

        String openid = (String)request.getSession().getAttribute("openid");
//        根据用户提供的信息查询说说
        List<Saytable> saylist = sayservice.gz_fb_query(text);

//        try {
//            response.getWriter().print(saylist);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        model.addAttribute("saylist",saylist);

        return new ModelAndView("circle_gz");

    }

    /**
     * @根据用户提供的信息查询说说(my)
     * @param text
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/my_fb_query")
    public ModelAndView my_fb_query(String text ,Model model, HttpServletRequest request,HttpServletResponse response){

        String openid = (String)request.getSession().getAttribute("openid");
//        根据用户提供的信息查询说说
        List<Saytable> saylist = sayservice.my_fb_query(text,openid);

        try {
            response.getWriter().print(saylist);
        } catch (IOException e) {
            e.printStackTrace();
        }

        model.addAttribute("saylist",saylist);

        return new ModelAndView("my_fb");

    }

    /**
     * @评论列表
     * @return
     */
    @RequestMapping("/pl_list")
    public ModelAndView pl_list(Model model, HttpServletRequest request, HttpServletResponse response){

        String openid = (String)request.getSession().getAttribute("openid");

        List<Commenttable> pl_list = commentservice.pl_list(openid);

        if(pl_list==null||pl_list.isEmpty()){
            int message = 0;
            model.addAttribute("number",message);
            return new ModelAndView("pl_list");
        }else {
            int message = 1;

            JSONArray jsonArray = List2Json1.List2Json(pl_list);
            JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"comment_time");

            List<Saytable> pltableList = JSONArray.toList(jsonArray1,new Commenttable(),new JsonConfig());
//            out.println(saytableList.toString());

            model.addAttribute("number",message);
            model.addAttribute("pl_list",pltableList);
            return new ModelAndView("pl_list");
        }


    }

    /**
     * @评论页
     * @param id
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/pl_page")
    public ModelAndView pl_page(int id,Model model,HttpServletRequest request){
        out.println(id);
        String openid = (String)request.getSession().getAttribute("openid");
//        根据说说id查说说
        List<Saytable> saylist = sayservice.sel_say(id);

        JSONArray saylist1 = List2Json1.List2Json(saylist);
        out.println(saylist1);

//        根据说说id查该说说的所有评论
        List<Commenttable> commentlist = commentservice.sel_comment(id);

        JSONArray jsonArray = List2Json1.List2Json(commentlist);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"comment_time");
        List<Saytable> commenttableList = JSONArray.toList(jsonArray1,new Commenttable(),new JsonConfig());

//        根据说说id获取点赞的头像
        List<Usertable> uplist = sayservice.up_touxiang(id);
        out.println(uplist);

        model.addAttribute("saylist",saylist);
        model.addAttribute("commentlist",commenttableList);
        model.addAttribute("uplist",uplist);
        model.addAttribute("openid",openid);

        return new ModelAndView("details");

    }

    /**
     * @删除评论
     * @param id
     * @return
     */
    @RequestMapping("/del_pl")
    public void del_pl(int id ){

        commentservice.del_pl(id);

    }

    /**
     * @点赞
     * @param say_id
     * @param request
     * @return
     */
    @RequestMapping("/up")
    @ResponseBody
    public void up(int say_id,HttpServletRequest request,HttpServletResponse response){
        String openid = (String)request.getSession().getAttribute("openid");
//        Map<String,Object> result = new HashMap<>();
        Uptable uptable = new Uptable();
        int number = upservice.sel_up_number(say_id,openid);
        out.println("说说id:"+say_id);
        out.println("点赞数量:"+number);
        if(number!=0){
            out.println("已经点赞过了");
            int up_number = sayservice.up_number(say_id);
//            result.put("code",1);
//            result.put("number",up_number);
//            return result;
            try {
                response.getWriter().println(up_number);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            out.println("没有点赞过");
            //        被点赞的说说id
            uptable.setBe_up_id(say_id);
            out.println("给说说id赋值");
            uptable.setUp_man_openid(openid);
            out.println("给点赞者的openid赋值");
            sayservice.up(say_id);
            out.println("点赞次数+1");
            upservice.add(uptable);
            out.println("添加点赞表");
//            int up_number = sayservice.up_number(say_id);
//            result.put("code", 0);
//            result.put("number", up_number);
//            return result;
            try {
                response.getWriter().println(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @评论详情页面--点赞
     * @param id
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/pl_page_up")
    public void pl_page_up(int id,HttpServletRequest request,HttpServletResponse response) throws Exception{

        String openid = (String)request.getSession().getAttribute("openid");

//        根据说说id和openid判断是否已经点赞过
        int upuser = upservice.sel_up_number(id,openid);

        if (upuser==0){
            out.println("没有点赞过");
            Uptable uptable = new Uptable();
            uptable.setBe_up_id(id);
            uptable.setUp_man_openid(openid);
            upservice.add(uptable);
            sayservice.up(id);

            //根据openid获取用户的头像
            String user_img = upservice.sel_up_img(openid);

            try {
                out.println("用户头像："+user_img);
                response.getWriter().write(user_img);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            int i =1;
            response.getWriter().write(i);
        }

    }


    /**
     * @关注
     * @param be_openid
     * @param request
     * @return
     */
    @RequestMapping("/gz")
//    @ResponseBody
    public void gz(String be_openid,HttpServletRequest request,HttpServletResponse response){
        Followtable follow = new Followtable();
        String openid = (String)request.getSession().getAttribute("openid");

        int gz_num = followservice.sel_gz_num(be_openid,openid);
        if(gz_num<=0){
            follow.setBe_follow_user_openid(be_openid);
            follow.setFollow_user_openid(openid);
            followservice.add(follow);
        }else {
            try {
                response.getWriter().println(1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        Map<String,Object> result = new HashMap<>();
//        result.put("result",200);
//        return  result;
    }

    /**
     * @取消关注
     * @param be_openid
     * @param request
     * @param response
     */
    @RequestMapping("/gz_qx")
    public void gz_qx(String be_openid,HttpServletRequest request,HttpServletResponse response){

        String openid = (String)request.getSession().getAttribute("openid");

        followservice.del(be_openid,openid);


    }

    /**
     * @发布评论
     * @param be_comment_id
     * @param comment_message
     * @param request
     * @param response
     */
    @RequestMapping("/fb_pl")
    @ResponseBody
    public Map<String,Object> fb_pl(int be_comment_id,String comment_message,HttpServletRequest request,HttpServletResponse response){
        Map<String ,Object> map = new HashMap<>();
        Commenttable commenttable = new Commenttable();
        String openid = (String)request.getSession().getAttribute("openid");
        commenttable.setBe_comment_id(be_comment_id);
        commenttable.setComment_message(comment_message);
        commenttable.setComment_man_openid(openid);
        commentservice.add(commenttable);
//        根据说说id和评论id查询指定评论(最新的一条)
        List<Commenttable> commentlist = commentservice.sel_my_comment(be_comment_id,openid);

        JSONArray commentjson = List2Json1.List2Json(commentlist);

        JSONObject jsonObject = commentjson.getJSONObject(0);

        //头像
        String img = (String) jsonObject.get("user_img");
        out.println(img);
        map.put("user_img",img);
        //昵称
        String nickname = (String) jsonObject.get("comment_nickname");
        out.println(nickname);
        map.put("comment_nickname",nickname);
        //内容
        String message = (String) jsonObject.get("comment_message");
        out.println(message);
        map.put("comment_message",message);
        //时间
        Date date = new Date();
        out.println(date.toString());
        map.put("comment_time","刚刚");
        //被评的id
        int becommentid = jsonObject.getInt("be_comment_id");
        out.println(becommentid);
        map.put("be_comment_id",becommentid);
        //评论者openid
        String commentman = (String) jsonObject.get("comment_man_openid");
        out.println(commentman);
        map.put("comment_man_openid",commentman);
        //状态
        int newstate =jsonObject.getInt("new_state");
        out.println(newstate);
        map.put("new_state",newstate);
        //评论id
        int comment_id = jsonObject.getInt("id");
        out.println(comment_id);
        map.put("id",comment_id);


//        try {
//            response.getWriter().println(commentjson);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        return map;

    }


    /**
     * @删除评论
     * @param id
     */
    @RequestMapping("/del_comment")
    public void del_comment(int id){

        commentservice.del_pl(id);

    }

}
