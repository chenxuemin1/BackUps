package xiaobaige.Controller.qrcode;


import xiaobaige.Util.Hb_qrcde;
import xiaobaige.Util.QrCode;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xiaobaige.Util.WechatUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;
import static xiaobaige.Util.MyTask.ACCESS_TOKEN;


/**
 * @author xm@c.com    Administrator
 * @date 2018/4/21 0021 下午 10:09
 */

@Controller
public class QrCodescontroller {

    /**
     * @生成永久二维码
     * @return
     */
    @RequestMapping("/qrcode")
    public static void qrcode(HttpServletRequest request, HttpServletResponse response) throws Exception{

        String openid = (String)request.getSession().getAttribute("openid");
        //文件的保存路径
        String path = "E://JAVA_Development//IDEA";

        //邀请二维码：ticket、expire_seconds、url
        String str =  QrCode.getTempQrcode(openid);

        //将json字符串转成json对象
        JSONObject json = JSONObject.fromObject(str);

        //二维码解析后的地址
        String url = json.get("url").toString();

        //得到的ticket，用于到指定的url换取二维码
        String ticket = json.get("ticket").toString();

        //换取二维码的地址
        String qrurl = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+ticket;

        //返回的结果为字符串化的图片
        String result = QrCode.sendGet(qrurl);

        //下载二维码，返回文件地址
        String filePath = QrCode.downloadFile(qrurl,path);

        response.getWriter().write(result);

//        return filePath;

         response.getWriter().write(qrurl);
    }


    /**
     * 生成临时二维码
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/TempQrcode")
    public void tempQrcode(HttpServletRequest request, HttpServletResponse response)throws Exception{


        Map<String,String> map = new HashMap<>();

        String openid = (String)request.getSession().getAttribute("openid");

//        String nickname = QrCode.strtomap(QrCode.sendGet1(openid)).get("nickname");
        String urlNameString = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="+ACCESS_TOKEN+"&openid="+openid+"&lang=zh_CN";
        JSONObject usermap = WechatUtil.httpRequest(urlNameString,"GET",null);
        String nickname = usermap.getString("nickname");

        //文件保存路径
        String path = "C:/config_file/apache-tomcat-7.0.85/webapps/xiaobaige/resource/qrcode/";
//        String path = "E://JAVA_Development//IDEA";

        //根据用户的id换取临时二维码（微信获取的‘open_id’,每个微信号唯一）
        String str = QrCode.getTempQrcode(openid);

        //将json字符串转成json对象
        JSONObject json = JSONObject.fromObject(str);

        //二维码解析后的地址
        String url = json.get("url").toString();
        out.println("二维码解析后的url："+url);

        //用于换取而二维码的ticket
        String ticket = json.get("ticket").toString();
        out.println("ticket："+ticket);

        //换取而二维码的地址
        String qrurl = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+ticket;
        out.println(qrurl);

        //字符图片
        String result = QrCode.sendGet(qrurl);
        out.println("图片字符"+result);

        //下载二维码，返回文件地址
        String filePath = QrCode.downloadFile(qrurl,path);
        out.println("图片保存路径"+filePath);

//        生成公众号二维码海报
        /**
         * @param srcImgPath    目标源文件
         * @param iconPath      水印图片
         * @param targerPath    目标文件
         * @param nick_name     文字水印
         */
        String srcImgPath = "C:/config_file/apache-tomcat-7.0.85/webapps/xiaobaige/resource/haibao/3.jpg";
        String iconPath = filePath;
        String targerPath = "C:/config_file/apache-tomcat-7.0.85/webapps/xiaobaige/resource/haibao/4.jpg";
//        String nick_name = "小荷才露尖尖角";
        Hb_qrcde.markImageByIcon(iconPath, srcImgPath, targerPath);
        Hb_qrcde.markByText(nickname, targerPath, targerPath);
        response.getWriter().write("http://www.xiaomingtuan.com/xiaobaige/resource/haibao/4.jpg");

    }




}
