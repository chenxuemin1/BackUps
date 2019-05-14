package ldxht.Controller.say;

import ldxht.Pojo.say.Phone_brand_table;
import ldxht.Pojo.say.Say_data_table;
import ldxht.Pojo.say.Say_table;
import ldxht.Service.say.Phone_brand_service;
import ldxht.Service.say.Say_data_service;
import ldxht.Service.say.Say_service;
import ldxht.Util.List2Json1;
import ldxht.Util.Time_Date;
import ldxht.Util.Say_data;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 22:20
 */
@Controller
public class Say {

    @Autowired
    private Phone_brand_service phone_brand_service;

    @Autowired
    private Say_data_service say_data_service;

    @Autowired
    private Say_service say_service;

    /**
     * @说说查询
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/say_c")
    public ModelAndView say_c(Model model, HttpServletRequest request, HttpServletResponse response){

        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("qz_cx");
        }

        List<Say_table> list = say_service.sel_findall();
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Say_table> list1 = JSONArray.toList(jsonArray1,new Say_table(),new JsonConfig());

        model.addAttribute("list",list1);

        return new ModelAndView("qz_cx");

    }

    /**
     * @根据昵称查询说说
     * @param nickname
     * @param model
     * @return
     */
    @RequestMapping("/say_c_n")
    @ResponseBody
    public JSONArray say_c_n(String nickname,Model model){

        List<Say_table> list = say_service.sel_n(nickname);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Say_table> list1 = JSONArray.toList(jsonArray1,new Say_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);

        return list2;

//        model.addAttribute("list",list1);
//
//        return new ModelAndView("qz_cx");

    }


    /**
     * @根据内容查询说说
     * @param message
     * @param model
     * @return
     */
    @RequestMapping("/say_c_m")
    @ResponseBody
    public JSONArray say_c_m(String message,Model model){

        List<Say_table> list = say_service.sel_m(message);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Say_table> list1 = JSONArray.toList(jsonArray1,new Say_table(),new JsonConfig());

        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        model.addAttribute("list",list1);
//
//        return new ModelAndView("qz_cx");

    }

    /**
     * @根据昵称和内容查询说说
     * @param nickname
     * @param message
     * @param model
     * @return
     */
    @RequestMapping("/say_c_n_m")
    @ResponseBody
    public JSONArray say_c_n_m(String nickname,String message,Model model){

        List<Say_table> list = say_service.sel_n_m(nickname, message);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Say_table> list1 = JSONArray.toList(jsonArray1,new Say_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;

//        model.addAttribute("list",list1);

//        return new ModelAndView("qz_cx");

    }

    /**
     * @说说拉黑
     * @param say_id
     */
    @RequestMapping("/say_lh")
    public void say_lh(int say_id){
        say_service.del_lh(say_id);
    }

    /**
     * @说说回复
     * @param say_id
     */
    @RequestMapping("/say_hf")
    public void say_hf(int say_id){
        say_service.edit_hf(say_id);
    }

    /**
     * @说说删除
     * @param say_id
     */
    @RequestMapping("/say_del")
    public void say_del(int say_id){
        say_service.del(say_id);
    }

    /**
     * @说说数据
     * @param model
     * @param request
     * @param response
     * @return
     * 应返回jsonarray数据，
     * 用户格式 [1,1,1,1,1,1,1,1,1,1,1,1]
     * 顾客停留时间  [1,1,1,1,1,1,1]
     * 顾客使用的终端统计 [
     *                 {value:30, name:'iphone6',itemStyle:{color:'#ff524e'}},
     *                 {value:30, name:'iphone6',itemStyle:{color:'#ff524e'}},
     *                 {value:30, name:'iphone6',itemStyle:{color:'#ff524e'}},
     *                 ]
     */
    @RequestMapping("/say_s")
    public ModelAndView say_s(Model model,HttpServletRequest request,HttpServletResponse response){

        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("qz_sj");
        }

        List<Say_data_table> list = say_data_service.sel_findall();
        List<Phone_brand_table> list1 = phone_brand_service.sel_findall();

        model.addAttribute("list",list);
        model.addAttribute("list1",list1);

        return new ModelAndView("qz_sj");
    }

    /**
     * @根据时间查询说说
     * @param start
     * @param end
     * @param model
     * @return
     * 应返回jsonarray数据，
     * 用户格式 [1,1,1,1,1,1,1,1,1,1,1,1]
     * 顾客停留时间  [1,1,1,1,1,1,1]
     * 顾客使用的终端统计 [
     *                 {value:30, name:'iphone6',itemStyle:{color:'#ff524e'}},
     *                 {value:30, name:'iphone6',itemStyle:{color:'#ff524e'}},
     *                 {value:30, name:'iphone6',itemStyle:{color:'#ff524e'}},
     *                 ]
     */
    @RequestMapping("/say_s_t")
    @ResponseBody
    public Map<String,Object> say_s_t(String start, String end, Model model){

        Map<String ,Object> map = new HashMap<>();
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start1 = null;
        Date end1 = null;
        try {
            start1 = time.parse(start);
            end1 = time.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Say_data_table> list = say_data_service.sel(start1,end1);
        List<Phone_brand_table> list1 = phone_brand_service.sel(start1,end1);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);
        //顾客停留时间
        ArrayList list_stop = Say_data.user_stop(jsonObject);
        //总发布用户数时间分布
        ArrayList list_public = Say_data.user_public(jsonObject);
        //总活跃数时间分布
        ArrayList list_active_z = Say_data.user_active_z(jsonObject);
        //日活跃数时间分布
        ArrayList list_active_r = Say_data.user_active_r(jsonObject);

        map.put("list_stop",list_stop);
        map.put("list_public",list_public);
        map.put("list_active_z",list_active_z);
        map.put("list_active_r",list_active_r);

        return map;
//        model.addAttribute("list",list);
//        model.addAttribute("list1",list1);
//
//        return new ModelAndView("qz_sj");
    }
}
