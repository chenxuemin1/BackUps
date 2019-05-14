package ldxht.Controller.repertory;

import ldxht.Pojo.coupon.Off_table;
import ldxht.Pojo.repertory.Clear_table;
import ldxht.Pojo.repertory.Repertory_table;
import ldxht.Pojo.repertory.Report_table;
import ldxht.Service.repertory.Clear_service;
import ldxht.Service.repertory.Repertory_service;
import ldxht.Service.repertory.Report_service;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 22:19
 */
@Controller
public class Repertory {

    @Autowired
    private Clear_service clear_service;

    @Autowired
    private Repertory_service repertory_service;

    @Autowired
    private Report_service report_service;

    /**
     * @查询所有库存
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/kc")
    public ModelAndView kc(Model model, HttpServletRequest request, HttpServletResponse response){

        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("kc");
        }

        List<Repertory_table> list = repertory_service.sel_findall();
        model.addAttribute("list",list);
        return new ModelAndView("kc");

    }

    /**
     * @根据时间查询库存
     * @param start
     * @param end
     * @param model
     * @return
     */
    @RequestMapping("/kc_t")
    @ResponseBody
    public JSONArray kc_t(String start,String end,Model model){

        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start1 = null;
        Date end1 = null;
        try {
            start1 = time.parse(start);
            end1 = time.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Repertory_table> list = repertory_service.sel_t(start1,end1);
        JSONArray list1 = List2Json1.List2Json(list);
        return list1;
//        model.addAttribute("list",list);
//
//        return new ModelAndView("kc");
    }

    /**
     * @根据类型查询库存
     * @param type
     * @param model
     * @return
     */
    @RequestMapping("/kc_type")
    @ResponseBody
    public JSONArray kc_type(String type,Model model){

        List<Repertory_table> list = repertory_service.sel_type(type);
        JSONArray list1 = List2Json1.List2Json(list);
        return list1;
//        model.addAttribute("list",list);
//        return new ModelAndView("kc");
    }

    /**
     * @查询清算表
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/qs")
    public ModelAndView qs(Model model,HttpServletRequest request,HttpServletResponse response){

        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("qs");
        }

        List<Clear_table> list = clear_service.sel_findall();
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"buy_time");
        List<Report_table> list1 = JSONArray.toList(jsonArray1,new Report_table(),new JsonConfig());
        model.addAttribute("list",list1);
        return new ModelAndView("qs");

    }

    /**
     * @添加清算数据
     * @param clear_table
     * @param model
     */
    @RequestMapping("/qs_add")
    public void qs_add(Clear_table clear_table,Model model){

        clear_service.add(clear_table);

    }

    /**
     * @查询所有报表
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/bb")
    public ModelAndView bb(Model model,HttpServletRequest request ,HttpServletResponse response){

        String account = (String) request.getSession().getAttribute("account");
        String password = (String) request.getSession().getAttribute("password");

        if(account==null||password==null||account.isEmpty()||password.isEmpty()){
            return new ModelAndView("bb");
        }

        List<Report_table> list = report_service.sel_findall();
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"buy_time");
        List<Report_table> list1 = JSONArray.toList(jsonArray1,new Report_table(),new JsonConfig());
        model.addAttribute("list",list1);
        return new ModelAndView("bb");

    }

    /**
     * @根据时间查询报表
     * @param start
     * @param end
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/bb_t")
    @ResponseBody
    public JSONArray bb_t(String start,String end,Model model,HttpServletRequest request,HttpServletResponse response){

        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start1 = null;
        Date end1 = null;
        try {
            start1 = time.parse(start);
            end1 = time.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Report_table> list = report_service.sel_t(start1,end1);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Report_table> list1 = JSONArray.toList(jsonArray1,new Report_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        model.addAttribute("list",list1);
//        return new ModelAndView("bb");
    }

    /**
     * @根据类别查询报表
     * @param type
     * @param model
     * @return
     */
    @RequestMapping("/bb_type")
    @ResponseBody
    public JSONArray bb_type(String type,Model model){
        List<Report_table> list = report_service.sel_type(type);
        JSONArray jsonArray = List2Json1.List2Json(list);
        JSONArray jsonArray1 = Time_Date.jsonArray(jsonArray,"time");
        List<Report_table> list1 = JSONArray.toList(jsonArray1,new Report_table(),new JsonConfig());
        JSONArray list2 = List2Json1.List2Json(list1);
        return list2;
//        model.addAttribute("list",list1);
//        return new ModelAndView("bb");
    }

}
