package ldxht.Controller.data;

import ldxht.Pojo.coupon.Off_table;
import ldxht.Pojo.data.Location_data_table;
import ldxht.Pojo.data.Logistics_data_table;
import ldxht.Pojo.data.User_data_table;
import ldxht.Pojo.data.User_info_table;
import ldxht.Service.data.Location_data_service;
import ldxht.Service.data.Logistics_data_service;
import ldxht.Service.data.User_data_service;
import ldxht.Service.data.User_info_service;
import ldxht.Util.List2Json1;
import ldxht.Util.Time_Date;
import ldxht.Util.User_data;
import net.sf.json.JSON;
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
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 22:19
 */
@Controller
public class Data {

    @Autowired
    Location_data_service location_data_service;

    @Autowired
    Logistics_data_service logistics_data_service;

    @Autowired
    User_data_service user_data_service;

    @Autowired
    User_info_service user_info_service;

    /**
     * @搜索所有数据
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("info")
    public ModelAndView info(Model model, HttpServletRequest request, HttpServletResponse response){

        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("yh_xx");
        }

        List<User_info_table> list = user_info_service.sel_findall();
//        JSONArray jsonArray = List2Json1.List2Json(list);
//        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
//        List<User_info_table> list1 = JSONArray.toList(jsonArray1,new User_info_table(),new JsonConfig());
        model.addAttribute("list",list);
        return new ModelAndView("yh_xx");

    }

    /**
     * @根据用户名查询用户信息
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/info_y")
    @ResponseBody
    public JSONArray info_y(String name, Model model, HttpServletResponse response){

        List<User_info_table> list = user_info_service.sel_y(name);
//        JSONArray jsonArray = List2Json1.List2Json(list);
//        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
//        List<User_info_table> list1 = JSONArray.toList(jsonArray1,new User_info_table(),new JsonConfig());

        JSONArray list2 = List2Json1.List2Json(list);
        return list2;
//        model.addAttribute("list",list1);
//        return new ModelAndView("yh_xx");
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    /**
     * @根据手机号码查询用户信息
     * @param phone_number
     * @param model
     * @return
     */
    @RequestMapping("/info_s")
    @ResponseBody
    public JSONArray info_s(long phone_number,Model model,HttpServletResponse response){

        List<User_info_table> list = user_info_service.sel_s(phone_number);
//        JSONArray jsonArray = List2Json1.List2Json(list);
//        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
//        List<User_info_table> list1 = JSONArray.toList(jsonArray1,new User_info_table(),new JsonConfig());

        JSONArray list2 = List2Json1.List2Json(list);
        return list2;
//        model.addAttribute("list",list1);
//        return new ModelAndView("yh_xx");
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * @根据用户名、手机号码查询用户信息
     * @param name
     * @param phone_number
     * @param model
     * @return
     */
    @RequestMapping("info_y_s")
    @ResponseBody
    public JSONArray info_y_s(String name,long phone_number,Model model,HttpServletResponse response){

        List<User_info_table> list = user_info_service.sel_y_s(name, phone_number);
//        JSONArray jsonArray = List2Json1.List2Json(list);
//        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
//        List<User_info_table> list1 = JSONArray.toList(jsonArray1,new User_info_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list);
        return list2;
//        model.addAttribute("list",list1);
//        return new ModelAndView("yh_xx");
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * @查询所有用户数据
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("data")
    public ModelAndView data(Model model,HttpServletRequest request,HttpServletResponse response){

        Map<String,Object> map = new HashMap<>();
        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("yh_sj");
        }

        List<User_data_table> list = user_data_service.sel_findall();
        List<Location_data_table> list1 = location_data_service.sel_findall();
        List<Logistics_data_table> list2 = logistics_data_service.sel_findall();
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        JSONArray jsonArray1 = List2Json1.List2Json(list1);
        JSONArray jsonArray2 = List2Json1.List2Json(list2);
        ArrayList user_list = User_data.user_bar(jsonObject);
        ArrayList from_list = User_data.user_from(jsonObject);
        ArrayList loca_list = User_data.user_loca(jsonArray1);
        ArrayList express = User_data.user_express(jsonArray2);

        map.put("user_list",user_list);
        map.put("from_list",from_list);
        map.put("loca_list",loca_list);
        map.put("express",express);

        model.addAttribute("list",list);
        model.addAttribute("list1",map);
//        model.addAttribute("list2",list2);
        return new ModelAndView("yh_sj");

    }

    /**
     * @根据时间查询用户数据
     * @param start
     * @param end
     * @param model
     * @return
     */
    @RequestMapping("/data_t")
    @ResponseBody
    public Map<String,Object> data_t(String start,String end,Model model){
        Map<String,Object> map = new HashMap<>();
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start1 = null;
        Date end1 = null;
        try {
            start1 = time.parse(start);
            end1 = time.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<User_data_table> list = user_data_service.sel(start1,end1);
        List<Location_data_table> list1 = location_data_service.sel(start1,end1);
        List<Logistics_data_table> list2 = logistics_data_service.sel(start1,end1);

        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        JSONArray jsonArray1 = List2Json1.List2Json(list1);
        JSONArray jsonArray2 = List2Json1.List2Json(list2);
        ArrayList user_list = User_data.user_bar(jsonObject);
        ArrayList from_list = User_data.user_from(jsonObject);
        ArrayList loca_list = User_data.user_loca(jsonArray1);
        ArrayList express = User_data.user_express(jsonArray2);

        map.put("user_list",user_list);
        map.put("from_list",from_list);
        map.put("loca_list",loca_list);
        map.put("express",express);
        return map;

//        model.addAttribute("list",list);
//        model.addAttribute("list1",map);

//        model.addAttribute("list1",list1);
//        model.addAttribute("list2",list2);
//        return new ModelAndView("yh_sj");

    }

    /**
     * @查询今天的用户数据
     * @param model
     * @return
     */
    @RequestMapping("/data_today")
    @ResponseBody
    public Map<String,Object> data_today(Model model){
        Map<String,Object> map = new HashMap<>();
        List<User_data_table> list = user_data_service.sel_otday();
        List<Location_data_table> list1 = location_data_service.sel_otday();
        List<Logistics_data_table> list2 = logistics_data_service.sel_otday();

        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        JSONArray jsonArray1 = List2Json1.List2Json(list1);
        JSONArray jsonArray2 = List2Json1.List2Json(list2);
        ArrayList user_list = User_data.user_bar(jsonObject);
        ArrayList from_list = User_data.user_from(jsonObject);
        ArrayList loca_list = User_data.user_loca(jsonArray1);
        ArrayList express = User_data.user_express(jsonArray2);

        map.put("user_list",user_list);
        map.put("from_list",from_list);
        map.put("loca_list",loca_list);
        map.put("express",express);
        return map;

//        model.addAttribute("list",list);
//        model.addAttribute("list1",map);
//        return new ModelAndView("yh_sj");

    }

    /**
     * @查询昨天的用户数据
     * @param model
     * @return
     */
    @RequestMapping("/data_yester")
    @ResponseBody
    public Map<String,Object> data_yester(Model model){
        Map<String,Object> map = new HashMap<>();
        List<User_data_table> list = user_data_service.sel_yester();
        List<Location_data_table> list1 = location_data_service.sel_yester();
        List<Logistics_data_table> list2 = logistics_data_service.sel_yester();

        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        JSONArray jsonArray1 = List2Json1.List2Json(list1);
        JSONArray jsonArray2 = List2Json1.List2Json(list2);
        ArrayList user_list = User_data.user_bar(jsonObject);
        ArrayList from_list = User_data.user_from(jsonObject);
        ArrayList loca_list = User_data.user_loca(jsonArray1);
        ArrayList express = User_data.user_express(jsonArray2);

        map.put("user_list",user_list);
        map.put("from_list",from_list);
        map.put("loca_list",loca_list);
        map.put("express",express);
        return map;

//        model.addAttribute("list",list);
//        model.addAttribute("list1",map);
//        return new ModelAndView("yh_sj");

    }

    /**
     * @查询最近7天的用户数据
     * @param model
     * @return
     */
    @RequestMapping("/data_7day")
    @ResponseBody
    public Map<String,Object> data_7day(Model model){
        Map<String,Object> map = new HashMap<>();
        List<User_data_table> list = user_data_service.sel_7day();
        List<Location_data_table> list1 = location_data_service.sel_7day();
        List<Logistics_data_table> list2 = logistics_data_service.sel_7day();

        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        JSONArray jsonArray1 = List2Json1.List2Json(list1);
        JSONArray jsonArray2 = List2Json1.List2Json(list2);
        ArrayList user_list = User_data.user_bar(jsonObject);
        ArrayList from_list = User_data.user_from(jsonObject);
        ArrayList loca_list = User_data.user_loca(jsonArray1);
        ArrayList express = User_data.user_express(jsonArray2);

        map.put("user_list",user_list);
        map.put("from_list",from_list);
        map.put("loca_list",loca_list);
        map.put("express",express);
        return map;

//        model.addAttribute("list",list);
//        model.addAttribute("list1",map);
//        return new ModelAndView("yh_sj");

    }

    /**
     * @查询最近30天的用户数据
     * @param model
     * @return
     */
    @RequestMapping("/data_30day")
    @ResponseBody
    public Map<String,Object> data_30day(Model model){
        Map<String,Object> map = new HashMap<>();
        List<User_data_table> list = user_data_service.sel_30day();
        List<Location_data_table> list1 = location_data_service.sel_30day();
        List<Logistics_data_table> list2 = logistics_data_service.sel_30day();

        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        JSONArray jsonArray1 = List2Json1.List2Json(list1);
        JSONArray jsonArray2 = List2Json1.List2Json(list2);
        ArrayList user_list = User_data.user_bar(jsonObject);
        ArrayList from_list = User_data.user_from(jsonObject);
        ArrayList loca_list = User_data.user_loca(jsonArray1);
        ArrayList express = User_data.user_express(jsonArray2);

        map.put("user_list",user_list);
        map.put("from_list",from_list);
        map.put("loca_list",loca_list);
        map.put("express",express);
        return map;

//        model.addAttribute("list",list);
//        model.addAttribute("list1",map);
//        return new ModelAndView("yh_sj");

    }

    /**
     * @查询最近一年的用户数据
     * @param model
     * @return
     */
    @RequestMapping("/data_years")
    @ResponseBody
    public Map<String ,Object> data_years(Model model){
        Map<String,Object> map = new HashMap<>();
        List<User_data_table> list = user_data_service.sel_years();
        List<Location_data_table> list1 = location_data_service.sel_years();
        List<Logistics_data_table> list2 = logistics_data_service.sel_years();

        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        JSONArray jsonArray1 = List2Json1.List2Json(list1);
        JSONArray jsonArray2 = List2Json1.List2Json(list2);
        ArrayList user_list = User_data.user_bar(jsonObject);
        ArrayList from_list = User_data.user_from(jsonObject);
        ArrayList loca_list = User_data.user_loca(jsonArray1);
        ArrayList express = User_data.user_express(jsonArray2);

        map.put("user_list",user_list);
        map.put("from_list",from_list);
        map.put("loca_list",loca_list);
        map.put("express",express);
        return map;

//        model.addAttribute("list",list);
//        model.addAttribute("list1",map);
//        return new ModelAndView("yh_sj");

    }
}
