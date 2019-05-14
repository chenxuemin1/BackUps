package ldxht.Controller.order;

import ldxht.Pojo.coupon.Off_table;
import ldxht.Pojo.order.Order_table;
import ldxht.Service.order.Order_service;
import ldxht.Util.List2Json1;
import ldxht.Util.Time_Date;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author xm@c.com  薛民
 * @date 2018/5/30 22:19
 */
@Controller
public class Order {

    @Autowired
    private Order_service order_service;


    /**
     * @查询所有订单
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/order")
    public ModelAndView order(Model model,HttpServletRequest request, HttpServletResponse response){

        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("ddcx");
        }

        List<Order_table> list = order_service.sel_findall();
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Order_table> list1 = JSONArray.toList(jsonArray1,new Order_table(),new JsonConfig());

        model.addAttribute("list",list1);

        return new ModelAndView("ddcx");

    }

    /**
     * @根据用户名查询订单
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/order_y")
    @ResponseBody
    public JSONArray order_y(String name,Model model,HttpServletResponse response){

        List<Order_table> list = order_service.sel_y(name);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Order_table> list1 = JSONArray.toList(jsonArray1,new Order_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        model.addAttribute("list",list1);
//
//        return new ModelAndView("ddcx");
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    /**
     * @根据手机号码查询订单
     * @param phone_number
     * @param model
     * @return
     */
    @RequestMapping("/order_s")
    @ResponseBody
    public JSONArray order_s(long phone_number,Model model,HttpServletResponse response){

        List<Order_table> list = order_service.sel_s(phone_number);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Order_table> list1 = JSONArray.toList(jsonArray1,new Order_table(),new JsonConfig());

        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        model.addAttribute("list",list1);
//        return new ModelAndView("ddcx");
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * @根据用户名手机号码查询订单
     * @param name
     * @param phone_number
     * @param model
     * @return
     */
    @RequestMapping("/order_y_s")
    @ResponseBody
    public JSONArray order_y_s(String name,long phone_number,Model model,HttpServletResponse response){
        List<Order_table> list = order_service.sel_y_s(name, phone_number);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Order_table> list1 = JSONArray.toList(jsonArray1,new Order_table(),new JsonConfig());

        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        model.addAttribute("list",list1);
//        return new ModelAndView("ddcx");
//        try {
//            response.getWriter().print(list2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * @查询指定订单
     * @param order_id
     * @return
     */
    @RequestMapping("/order_d")
    @ResponseBody
    public JSONArray order_d(int order_id){
        List<Order_table> list = order_service.sel_d(order_id);
        JSONArray list1 = List2Json1.List2Json(list);
        return list1;
    }

    /**
     * @添加备注
     * @param order_id
     */
    @RequestMapping("/order_remark")
    public void order_remark(int order_id){
        order_service.edit_remark(order_id);
    }



}
