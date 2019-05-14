package ldxht.Controller.poster;

import ldxht.Service.poster.Posterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static java.lang.System.out;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/5 0005 下午 1:30
 */
@Controller
public class Poster {

    @Autowired
    private Posterservice posterservice;

    /**
     * 首页海报
     * @return
     */
    @RequestMapping("/sy_hb")
    public String sy_hb(){

        return "sy_hb";
    }

    /**
     * @更换首页海报
     * @param file
     * @param id
     */
    @RequestMapping("/gh_sy")
    public void gh_sy(String filename, MultipartFile file, HttpServletResponse response){
        out.println(file+"-------"+filename);
        out.println(file.getSize());
        posterservice.edit_sy(file,filename);
        try {
            response.getWriter().print(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @捐赠登记海报
     * @return
     */
    @RequestMapping("/dj_hb")
    public String dj_hb(){

        return "dj_hb";
    }

    /**
     * @跟换捐赠登记海报
     * @param file
     * @param id
     */
    @RequestMapping("/gh_dj")
    public void gh_dj(MultipartFile file,String filename){
        posterservice.edit_dj(file,filename);
    }

    /**
     * @捐赠达人海报
     * @return
     */
    @RequestMapping("/dr_hb")
    public String dr_hb(){

        return "dr_hb";
    }

    /**
     * @更换捐赠达人海报
     * @param file
     * @param id
     */
    @RequestMapping("/gh_dr")
    public void gh_dr(MultipartFile file,String filname){
        posterservice.edit_dr(file,filname);
    }
}
