package ldxht.Controller.edit;

import ldxht.Service.edit.Editservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/5 0005 上午 11:26
 */
@Controller
public class Edit{

    @Autowired
    private Editservice editservice;

    @RequestMapping("/gd_tg")
    public ModelAndView gd_tg(Model model){
        String message = editservice.sel_tell();
        model.addAttribute("message",message);
        return new ModelAndView("gd_tg");
    }

    @RequestMapping("/edit_tell")
    public void edit_tell(String message){
        editservice.edit_tell(message);
    }

}
