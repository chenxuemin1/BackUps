package ldxht.Controller.index;

import ldxht.Service.index.Index_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.lang.System.out;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 21:46
 */
@Controller
public class Index {

    @Autowired
    private Index_service index_service;

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/proving")
    public void proving(String account, String password, HttpServletRequest request, HttpServletResponse response){
        int i = index_service.sel(account,password);
        out.println(i);

        if(i==1){
            out.println("账号和密码正确");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession(true);
            session.setAttribute("account",account);
            session.setAttribute("password",password);

            try {
                response.getWriter().println(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            return "wlbt";
        }else {

            try {
                response.getWriter().println(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            return "index";
        }
    }

}
