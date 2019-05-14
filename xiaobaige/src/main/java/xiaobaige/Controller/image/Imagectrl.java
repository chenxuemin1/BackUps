package xiaobaige.Controller.image;


import xiaobaige.Controller.Basectrl;
import xiaobaige.Pojo.image.UeditorUploadResp;
import xiaobaige.Service.image.Imageservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import static java.lang.System.out;
//import static xiaobaige.Util.Access_token.ACCESS_TOKEN;
import static xiaobaige.Util.MyTask.ACCESS_TOKEN;


/**
 * 图片上传
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 8:03
 */

@Controller

//@RequestMapping("/image")
public class Imagectrl extends Basectrl{

    @Autowired
    private Imageservice imageservice;

    /**
     * 图片上传
     * @return
     */
    @RequestMapping("/upload")
    public UeditorUploadResp upload(MultipartFile upfile) {
        log.info("正在上传文件：" + upfile.getOriginalFilename());
        return imageservice.upload(upfile);
    }

    /**
     * 上传logo
     * @return
     */
    @RequestMapping("/uplogo")
    public String logo(){
        String url = "http://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token="+ACCESS_TOKEN+"&type=image";
        String filepath = "C:/config_file/apache-tomcat-7.0.85/webapps/xiaobaige/resource/resource/img/YHQ.jpg";
        String result =  imageservice.uplogo(url, filepath);
        out.println(result);
        return result;

    }

}
