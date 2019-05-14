package ldxht.Controller.coupon;

import ldxht.Pojo.coupon.Give_table;
import ldxht.Pojo.coupon.Off_table;
import ldxht.Service.coupon.Give_service;
import ldxht.Service.coupon.Off_service;
import ldxht.Util.List2Json1;
import ldxht.Util.Time_Date;
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

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 22:17
 */
@Controller
public class Coupon {

    @Autowired
    private Give_service give_service;

    @Autowired
    private Off_service off_service;

    /**
     * @优惠券赠送
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/coupon")
    public ModelAndView coupon(Model model, HttpServletRequest request, HttpServletResponse response){

        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("yhq_zs");
        }

        List<Give_table> list =  give_service.sel_findall();
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Give_table> list1 = JSONArray.toList(jsonArray1,new Give_table(),new JsonConfig());

        model.addAttribute("list",list1);

        return new ModelAndView("yhq_zs");

    }

    /**
     * @根据昵称查询优惠券
     * @param nickname
     * @param model
     * @return
     */
    @RequestMapping("/coupon_z_n")
    @ResponseBody
    public JSONArray coupon_z_n(String nickname,Model model,HttpServletResponse response){

        List<Give_table> list =  give_service.sel_n(nickname);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Give_table> list1 = JSONArray.toList(jsonArray1,new Give_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);

        return list2;

//        model.addAttribute("list",list1);

//        return new ModelAndView("yhq_zs");
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * @根据订单编号查询优惠券
     * @param order_id
     * @param model
     * @return
     */
    @RequestMapping("/coupon_z_d")
    @ResponseBody
    public JSONArray coupon_z_d(int order_id,Model model ,HttpServletResponse response){

        List<Give_table> list =  give_service.sel_d(order_id);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Give_table> list1 = JSONArray.toList(jsonArray1,new Give_table(),new JsonConfig());

//        model.addAttribute("list",list1);
//
//        return new ModelAndView("yhq_zs");
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * @根据昵称、订单编号查询优惠券
     * @param nickanme
     * @param order_id
     * @param model
     * @return
     */
    @RequestMapping("/coupon_z_n_d")
    @ResponseBody
    public JSONArray coupon_z_n_d(String nickanme,int order_id,Model model,HttpServletResponse response){

        List<Give_table> list =  give_service.sel_n_d(nickanme, order_id);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Give_table> list1 = JSONArray.toList(jsonArray1,new Give_table(),new JsonConfig());

//        model.addAttribute("list",list1);
//
//        return new ModelAndView("yhq_zs");
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    /**
     * @优惠券核销
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/coupon_h")
    public ModelAndView coupon_h(Model model,HttpServletRequest request,HttpServletResponse response){
        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("yhq_hx");
        }

        List<Off_table> list = off_service.sel_findall();
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"get_time");
        JSONArray jsonArray2 = Time_Date.jsonArray(jsonArray1,"valid_date");
        List<Off_table> list1 = JSONArray.toList(jsonArray2,new Off_table(),new JsonConfig());

        model.addAttribute("list",list1);

        return new ModelAndView("yhq_hx");

    }

    /**
     * @根据券号查询优惠券
     * @param coupon_cord_id
     * @param model
     * @return
     */
    @RequestMapping("/coupon_h_q")
    @ResponseBody
    public JSONArray coupon_h_q(String coupon_cord_id ,Model model,HttpServletResponse response){

        List<Off_table> list = off_service.sel_q(coupon_cord_id);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Off_table> list1 = JSONArray.toList(jsonArray1,new Off_table(),new JsonConfig());

//        model.addAttribute("list",list1);
//
//        return new ModelAndView("yhq_hx");
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * @根据状态查询优惠券
     * @param state
     * @param model
     * @return
     */
    @RequestMapping("/coupon_h_z")
    @ResponseBody
    public JSONArray coupon_h_z(int state, Model model, HttpServletResponse response){

        List<Off_table> list = off_service.sel_z(state);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Off_table> list1 = JSONArray.toList(jsonArray1,new Off_table(),new JsonConfig());

//        model.addAttribute("list",list1);
//
//        return new ModelAndView("yhq_hx");
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    /**
     *@根据券号、状态查询优惠券
     * @param coupon_card_id
     * @param state
     * @param model
     * @return
     */
    @RequestMapping("/coupon_h_q_z")
    @ResponseBody
    public JSONArray coupon_q_z(String coupon_card_id,int state,Model model,HttpServletResponse response){

        List<Off_table> list = off_service.sel_q_z(coupon_card_id,state);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Off_table> list1 = JSONArray.toList(jsonArray1,new Off_table(),new JsonConfig());

//        model.addAttribute("list",list1);
//
//        return new ModelAndView("yhq_hx");
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    /**
     * @手动核销
     * @param coupon_id
     */
    @RequestMapping("/coupon_hx")
    public void coupon_hx(int coupon_id){
        off_service.edit_hx(coupon_id);
    }

}
