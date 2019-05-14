package xiaobaige.Controller.index;

import xiaobaige.Pojo.product.Backclothestable;
import xiaobaige.Pojo.record.Activitytable;
import xiaobaige.Pojo.record.Invitationtable;
import xiaobaige.Pojo.record.Recordtable;
import xiaobaige.Pojo.system.Usertable;
import xiaobaige.Service.product.Backclothseservice;
import xiaobaige.Service.record.Recordservice;
import xiaobaige.Service.system.Userservice;
import xiaobaige.Service.tell.Tellservice;
import xiaobaige.Util.Express_type;
import xiaobaige.Util.KdniaoTrackQueryAPI;
import xiaobaige.Util.List2Json1;
import xiaobaige.Util.WechatUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import static java.lang.System.out;
import static xiaobaige.Util.MyTask.appid;
import static xiaobaige.Util.MyTask.secter;


/**
 * 首页
 * @author xm@c.com    Administrator
 * @date 2018/4/18 0018 下午 4:12
 */
@Controller

public class Indexcontroller {

    protected Log log = LogFactory.getLog(Indexcontroller.class);

    @Autowired
    private Userservice userservice;

    @Autowired
    private Backclothseservice backclothseservice;

    @Autowired
    private Recordservice recordservice;

    @Autowired
    private Tellservice tellservice;

    public static final String reurl = "http://www.xiaomingtuan.com/xiaobaige/index";

    /**
     * @首页
     * @return
     */
    @RequestMapping("/index")

    public ModelAndView index(Model model,HttpServletRequest request,HttpServletResponse response){

//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        HttpSession session = request.getSession(true);
//        session.setAttribute("openid","66");

        String openid = (String)request.getSession().getAttribute("openid");
        out.println("openid===="+openid);
        String code = request.getParameter("code");
        out.println("code===="+code);

        if(openid!=null){
            out.println("openid不为空");

            if(userservice.sel_exist(openid)==0){
               out.println("没有该用户");
               out.println("该用户为"+openid);
            }else {
                List<Usertable> userlist = userservice.findall();
                model.addAttribute("userlist", userlist);
                return new ModelAndView("index");
            }
        }else {

            if (code == null || code.isEmpty()) {

                try {
                    String codeurl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + appid + "&redirect_uri=" + URLEncoder.encode(reurl, "UTF-8") + "&response_type=code&scope=snsapi_userinfo#wechat_redirect";
//                    String codeurl1 = "https://mp.weixin.qq.com/safe/bindcomponent?action=bindcomponent&auth_type=1&no_scan=1&component_appid="+ appid +"&pre_auth_code=xxxxx&redirect_uri=xxxx&auth_type=xxx&biz_appid=xxxx#wechat_redirect";
                    out.println(URLEncoder.encode(reurl, "UTF-8"));
                    out.println(codeurl);
                    response.sendRedirect(codeurl);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {

                String accessurl = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + appid + "&secret=" + secter + "&code=" + code + "&grant_type=authorization_code";
                JSONObject userinfojson = WechatUtil.httpRequest(accessurl, "GET", null);

                if (userinfojson.getString("access_token")!=null) {
                    out.println("code没问题");
//                获取wy_access_token
                    String wy_access_token = null;
                    String wy_expires_in = null;
                    String wy_refresh_token = null;
                    String wy_openid = null;
                    String wy_scope = null;

                     wy_access_token = userinfojson.getString("access_token");
                     wy_expires_in = userinfojson.getString("expires_in");
                     wy_refresh_token = userinfojson.getString("refresh_token");
                     wy_openid = userinfojson.getString("openid");
                     wy_scope = userinfojson.getString("scope");

                    out.println(wy_access_token + wy_expires_in + wy_refresh_token + wy_scope + wy_openid);

                    String access_stateurl = "https://api.weixin.qq.com/sns/auth?access_token=" + wy_access_token + "&openid=" + wy_openid;


                    String refreshurl = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid="+appid+"&grant_type=refresh_token&refresh_token="+wy_refresh_token;

//                    int i;
////                    验证wy_access_token是否有效
//                    for (i=0;WechatUtil.httpRequest(access_stateurl, "GET", null).getInt("errcode") != 0 && i<5;i++){
//                        log.info("access_token无效");
//                        log.info(WechatUtil.httpRequest(access_stateurl, "GET", null).getString("errmsg")+"\n"+WechatUtil.httpRequest(access_stateurl, "GET", null).getString("errcode"));
//                        log.info("i"+i);
////                        刷新wy_access_token
//                        JSONObject refresh = WechatUtil.httpRequest(refreshurl,"GET",null);
//                        wy_access_token = refresh.getString("access_token");
//                    }
//                    if(i==5){
//                        model.addAttribute("error","授权失败");
//                        return new ModelAndView("error1");
//                    }
//                access_token正常
                    String userinfourl = "https://api.weixin.qq.com/sns/userinfo?access_token=" + wy_access_token + "&openid=" + wy_openid + "&lang=zh_CN";
                    JSONObject userinfo = WechatUtil.httpRequest(userinfourl, "GET", null);

//                换取用户信息
                    String nickname = userinfo.getString("nickname");
                    int sex = userinfo.getInt("sex");
                    String province = userinfo.getString("province");
                    String city = userinfo.getString("city");
                    String country = userinfo.getString("country");
                    String headimgurl = userinfo.getString("headimgurl");
                    String privilege = userinfo.getString("privilege");

                    out.println(nickname + sex + province + city + country + headimgurl + privilege);

                    response.setCharacterEncoding("UTF-8");
                    response.setContentType("text/html;charset=UTF-8");

                    HttpSession session = request.getSession(true);
                    String name = wy_openid;
                    session.setAttribute("openid",name);

//                    Usertable user = new Usertable();
//                    user.setOpenid(wy_openid);
//                    user.setUser_nickname(nickname);
//                    user.setSex(sex);
//                    user.setLocation(country + province + city);
//                    user.setUser_img(headimgurl);
////                    user.setVip_grade("普会");
//                    userservice.add(user);

                    List<Usertable> userlist = userservice.sel_index();
                    model.addAttribute("userlist", userlist);
                    return new ModelAndView("index");

                } else {
                    out.println("code有问题");
                    out.println(userinfojson.getString("errcode"));
                    out.println(userinfojson.getString("errmsg"));
                    try {

                        if (userinfojson.getInt("errcode") == 40029) {

                            out.println("code无效");
//                        try {
//                            String codeurl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid+"&redirect_uri="+URLEncoder.encode(reurl,"UTF-8")+"&response_type=code&scope=snsapi_userinfo&state="+123+"#wechat_redirect";
//                            out.println(codeurl);
//                            response.sendRedirect(codeurl);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    model.addAttribute("error","授权失败");
                    return new ModelAndView("error1");

                }

            }
        }
        return null;
    }

    /**
     * @捐赠达人
     * @return
     */
    @RequestMapping("/jzdr")
    public ModelAndView getUserview(Model model, HttpServletRequest request){
//        String openid = (String)request.getSession().getAttribute("openid");
        List<Usertable> userlist = userservice.findall();
        model.addAttribute("userlist",userlist);
        return new ModelAndView("jzdr");
    }

    /**
     * @我的捐赠
     * @return
     */
    @RequestMapping("/my_jz")
    public ModelAndView my_jz(Model model,HttpServletRequest request,HttpServletResponse response){
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

            List<Backclothestable> userlist = userservice.my_jz(openid);

            if(userlist==null||openid.isEmpty()){
                int message = 1;
                model.addAttribute("number",message);
                return new ModelAndView("my_jz");
            }else {
                model.addAttribute("userlist", userlist);
                return new ModelAndView("my_jz");
            }
        }
        return null;
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    /**
     * @物流信息
     * @param express_number
     * @param model
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/logistics")
    public ModelAndView logistics(String express_number,Model model,HttpServletRequest request,HttpServletResponse response) throws Exception {
        String openid = (String)request.getSession().getAttribute("openid");

        String express_type = backclothseservice.express_type(express_number);

        KdniaoTrackQueryAPI kdniaoTrackQueryAPI = new KdniaoTrackQueryAPI();

        Express_type exp = new Express_type();

        String shippercode = exp.exp_type(express_type);

//        获取物流信息
        String result = kdniaoTrackQueryAPI.getOrderTracesByJson(shippercode,express_number);

        if(result==null||openid.isEmpty()){
            int message = 1;
            model.addAttribute("number",message);
        }else {
            JSONObject jsonObject = JSONObject.fromObject(result);

            String ShipperCode = jsonObject.getString("ShipperCode");
            String LogisticCode = jsonObject.getString("LogisticCode");
            int state = jsonObject.getInt("State");
            String statenow = exp.exp_state(state);
            out.print(statenow);
            JSONArray Traces = jsonObject.getJSONArray("Traces");
            out.print(result + "\n");
            out.println("快递名称" + ShipperCode);
            out.println("快递单号" + LogisticCode);
            for (int i = 0; i < Traces.size(); i++) {
                JSONObject object = (JSONObject) Traces.get(i);
                String AcceptTime = object.getString("AcceptTime");
                String AcceptStation = object.getString("AcceptStation");
                out.println("时间：" + AcceptTime + "\t" + AcceptStation);
            }

            model.addAttribute("express_name", express_type);
            model.addAttribute("statenow",statenow);
            model.addAttribute("express",jsonObject);
        }

//        response.getWriter().println("sss");
        return new ModelAndView("logistics");
//        return "logistics";

    }

    /**
     * @捐赠登记
     * @return
     */

    @RequestMapping("/yysy")
    public ModelAndView yysy(Model model,HttpServletRequest request,HttpServletResponse response){
        String openid = (String) request.getSession().getAttribute("openid");
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
            log.info("公告获取有问题");
            String message = tellservice.sel_tell();
            log.info("公告获取没问题");
            model.addAttribute("message",message);
        }


        return new ModelAndView("yysy");
    }

    /**
     * @我的页面
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/my")
    public ModelAndView my(Model model,HttpServletRequest request,HttpServletResponse response){
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

            List<Usertable> userlist = userservice.my1(openid);
            int news_num = recordservice.news_number(openid);
            model.addAttribute("news_num", news_num);
            model.addAttribute("userlist", userlist);
            return new ModelAndView("my");

        }
        return null;
    }

    /**
     * @我的号召力
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/my_call")
    public ModelAndView mycall(Model model, HttpServletRequest request,HttpServletResponse response){
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

            List<Usertable> userlist = userservice.my(openid);
            List<Usertable> yq_number = userservice.my2(openid);
            JSONArray jsonArray = List2Json1.List2Json(yq_number);
            JSONObject jsonObject = (JSONObject) jsonArray.get(0);
            String img = jsonObject.getString("user_img");
            String user_nickname = jsonObject.getString("user_nickname");
            int grade = jsonObject.getInt("grade");
            int number = jsonObject.getInt("invitation_number");
            log.info(img+"\n"+user_nickname+"\n"+grade+"\n"+number);
            log.info(jsonArray.toString());
            if (userlist == null || userlist.isEmpty()) {
                int message = 1;
                model.addAttribute("number", message);
                return new ModelAndView("my_call");
            } else {
                model.addAttribute("userlist", userlist);
//                model.addAttribute("list", yq_number);
                model.addAttribute("img",img);
                model.addAttribute("nickname",user_nickname);
                model.addAttribute("grade",grade);
                model.addAttribute("number",number);
                return new ModelAndView("my_call");
            }
        }
        return new ModelAndView("error1");
    }


    /**
     * @我的等级
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/my_grade")
    public ModelAndView getmygrade(Model model,HttpServletRequest request,HttpServletResponse response){
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

            List<Usertable> mygrade = userservice.my1(openid);
            String over_number = userservice.over_number(openid);
            model.addAttribute("mygrade", mygrade);
            model.addAttribute("over_number", over_number);
            return new ModelAndView("my_grade");
        }
        return new ModelAndView("error1");
    }

    /**
     * @我的系统消息
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/my_news")
    public ModelAndView mynews(Model model,HttpServletRequest request,HttpServletResponse response){
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

//        我的等级系统信息
            List<Recordtable> mynews = recordservice.news(openid);
//        我的邀请系统信息
            List<Invitationtable> mynews1 = recordservice.news1(openid);
//        我的活动系统信息
            List<Activitytable> mynews2 = recordservice.news2(openid);

            if (mynews == null && mynews1 == null && mynews2 == null || mynews.isEmpty() && mynews1.isEmpty() && mynews2.isEmpty()) {
                int message = 1;
                model.addAttribute("number", message);
                return new ModelAndView("my_news");
            } else {
                model.addAttribute("mynews", mynews);
                model.addAttribute("mynews1", mynews1);
                model.addAttribute("mynews2", mynews2);
                return new ModelAndView("my_news");
            }
        }
        return new ModelAndView("error1");

    }

    /**
     * @常见问题
     * @return
     */
    @RequestMapping("/my_help")
    public String myhelp(){
        return "my_help";
    }

    /**
     * @关于我们
     * @return
     */
    @RequestMapping("/about_us")
    public String aboutus(){
        return "about_us";
    }



}
