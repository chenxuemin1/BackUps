package ldxht.Controller.statement;

import ldxht.Pojo.statement.Statement_table;
import ldxht.Service.statement.Statement_service;
import ldxht.Util.List2Json1;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
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
import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 22:20
 */
@Controller
public class Statement {

    @Autowired
    private Statement_service statement_service;

    /**
     * @查询所有费用报表
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/fybb")
    public ModelAndView fybb(Model model, HttpServletRequest request, HttpServletResponse response){

        List<Statement_table> list = statement_service.sel_findall();
        model.addAttribute("list",list);
        return new ModelAndView("fybb");
    }

    /**
     * @根据时间查询报表
     * @param start
     * @param end
     * @param model
     * @return
     */
    @RequestMapping("fybb_t")
    @ResponseBody
    public JSONArray fybb_t(String start, String end, Model model){

        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start1 = null;
        Date end1 = null;
        try {
            start1 = time.parse(start);
            end1 = time.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Statement_table> list = statement_service.sel_t(start1,end1);
        JSONArray list1 = List2Json1.List2Json(list);
        return list1;
//        model.addAttribute("list",list);
//        return new ModelAndView("fybb");

    }

    /**
     * @根据类别查询费用报表
     * @param type
     * @param model
     * @return
     */
    @RequestMapping("/fybb_type")
    @ResponseBody
    public JSONArray fybb_type(String type, Model model){
        List<Statement_table> list = statement_service.sel_type(type);
        JSONArray list1 = List2Json1.List2Json(list);
        return list1;
//        model.addAttribute("list",list);
//        return new ModelAndView("fybb");
    }
}
