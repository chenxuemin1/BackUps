package ldxht.Controller.subsidy;

import ldxht.Pojo.subsidy.Subsidy_table;
import ldxht.Service.coupon.Give_service;
import ldxht.Service.coupon.Off_service;
import ldxht.Service.subsidy.Subsidy_service;
import ldxht.Util.List2Json1;
import ldxht.Util.Time_Date;
import net.sf.json.JSONArray;
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

import static java.lang.System.out;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 22:20
 */
@Controller
public class Subsidy {

    @Autowired
    private Subsidy_service subsidy_service;

    /**
     * @查询所有物流补贴
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/wlbt")
    public ModelAndView wlbt(Model model,HttpServletRequest request,HttpServletResponse response){
        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("wlbt");
        }

        List<Subsidy_table> list = subsidy_service.sel_findall();
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Subsidy_table> list1 = JSONArray.toList(jsonArray1, new Subsidy_table(),new JsonConfig());

        model.addAttribute("list",list1);

        return new ModelAndView("wlbt");

    }

    @RequestMapping("/sub")
    @ResponseBody
    public JSONArray sub(String name,String express_number,Model model,HttpServletRequest request,HttpServletResponse response){
        List<Subsidy_table> list1;
        JSONArray list = null;
        out.println(name+"-------"+express_number);
        if(name==null||name.isEmpty()){
            if(express_number==null||express_number.isEmpty()){
                out.println("不执行任何操作");
            }else {
                list1 = wlbt_d(express_number);
                list = List2Json1.List2Json(list1);

            }

        }else {
            if(express_number==null||express_number.isEmpty()){
                list1 = wlbt_y(name);
                list = List2Json1.List2Json(list1);
            }else {
                list1 =  wlbt_y_d(name, express_number);
                list = List2Json1.List2Json(list1);
            }
        }

        out.println(list.toString());
        return list;

//        model.addAttribute("list",list);
//        return new ModelAndView("wlbt");
//        try {
//            response.getWriter().print(list);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * @根据用户名查询物流补贴
     * @param name
     * @return
     */
    @RequestMapping("/wlbt_y")
    public JSONArray wlbt_y (String name){

        List<Subsidy_table> list = subsidy_service.sel_y(name);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Subsidy_table> list1 = JSONArray.toList(jsonArray1, new Subsidy_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
    }

    /**
     * @根据快递单号查询物流补贴
     * @param express_number
     * @return
     */
    @RequestMapping("/wlbt_d")
    public JSONArray wlbt_d (String express_number){

        List<Subsidy_table> list = subsidy_service.sel_d(express_number);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Subsidy_table> list1 = JSONArray.toList(jsonArray1, new Subsidy_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
    }

    /**
     * @根据用户名、快递单号查询物流补贴
     * @param name
     * @param express_number
     * @return
     */
    @RequestMapping("/wlbt_y_d")
    public JSONArray wlbt_y_d(String name,String express_number){

        List<Subsidy_table> list = subsidy_service.sel_y_d(name, express_number);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Subsidy_table> list1 = JSONArray.toList(jsonArray1, new Subsidy_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;

    }

    /**
     * @修改物流补贴
     * @param subsidy_table
     */
    @RequestMapping("/wibt_edit")
    public void wlbt_edit(Subsidy_table subsidy_table){

        subsidy_service.edit(subsidy_table);

    }
}
