package xiaobaige.Controller.system;

import xiaobaige.Pojo.record.Activitytable;
import xiaobaige.Pojo.record.Invitationtable;
import xiaobaige.Pojo.record.Recordtable;
import xiaobaige.Pojo.system.Usertable;
import xiaobaige.Service.access_token.Access_tokenservice;
import xiaobaige.Service.product.Backclothseservice;
import xiaobaige.Service.record.Recordservice;
import xiaobaige.Service.system.Userservice;
import xiaobaige.Util.*;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

import static java.lang.System.out;
import static xiaobaige.Controller.index.Indexcontroller.reurl;
import static xiaobaige.Util.MyTask.ACCESS_TOKEN;
import static xiaobaige.Util.MyTask.appid;

//import xiaobaige.Util.MyTask;
//import static xiaobaige.Util.MyTask.ACCESS_TOKEN;
//import static xiaobaige.Util.SignUtil.byteToStr;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 3:15
 */

@Controller
@RequestMapping("user")
public class Usercontroller {
    protected Log log = LogFactory.getLog(Usercontroller.class);

    @Autowired
    private Userservice userservice;

//    private static String token = "147258369123456789";

    static {
        Timer timer = new Timer();
        MyTask myTask = new MyTask();
        timer.schedule(myTask, 10, 7100000L);
        out.print("计时器运行成功");

    }

//    @Autowired
//    private Usertable user;

//    @RequestMapping("/add")
//    public String add(Usertable user){
//        Map<String,Object> result = new HashMap<String,Object>();
//        if((userservice.sel(user.getOpenid())).isEmpty()){
//            userservice.add(user);
//        }else{
//            userservice.edit2(user.getInviter());
//            userservice.add(user);
//        }
//        return "";
//    }

    @RequestMapping("/test")
    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception{

//        String get = request.getMethod();

//        String number = request.getParameter("test");

//        out.print(get+number);

        Usertable user = new Usertable();

        boolean isGet = request.getMethod().toLowerCase().equals("get");

        if (isGet) {
            //验证URL的真实性
            //get方法的验证(就是token验证)

            String str = access(request);

            log.info("这是get方法");

            response.getWriter().write(str);

        } else {

            log.info("这是post方法");
            //post方法一般是用户的事件处理(如关注、发送消息等。。。)
            Map<String,String> str = acceptMessage(request,response);
            log.info("str====="+str);
            //扫描者的openid
            String openid = str.get("FromUserName");
            log.info("openid======"+openid);
//            事件类型
            String msgtype = str.get("MsgType");
            log.info(msgtype);
//            事件
            String event = str.get("Event");
            log.info(event);

                    int number = userservice.sel_exist(openid);

                    if(number==0){
                        //            发送请求的地址
                        String urlNameString = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="+ACCESS_TOKEN+"&openid="+openid+"&lang=zh_CN";
                        log.info("urlNameString====="+urlNameString);

//            优惠券的code码
                        String carscode = str.get("UserCardCode");

                        //发送get请求获取用户的基本信息
//            String userinfo = QrCode.sendGet1(openid);

                        //获得用户数据
//            Map<String,String> usermap = QrCode.strtomap(userinfo);
                        JSONObject usermap = WechatUtil.httpRequest(urlNameString,"GET",null);

                        //用户昵称
                        String usernickname = usermap.getString("nickname");
                        log.info("usernickname====="+usernickname);
                        //用户性别
                        int sex = usermap.getInt("sex");
                        log.info("sex====="+sex);
                        //获取用户的地址
                        String location = usermap.getString("country")+usermap.getString("province")+usermap.getString("city");
                        log.info("location====="+location);
                        //用户来源
                        String userfrom = usermap.getString("subscribe_scene");
                        log.info("user_from====="+userfrom);

                        String touxiang = usermap.getString("headimgurl");
                        log.info("headimgurl====="+touxiang);

//            将用户信息存入user对象
                        user.setOpenid(openid);
                        user.setUser_nickname(usernickname);
                        user.setLocation(location);
//            user.setUser_from(userfrom);
//            user.setVip_grade("普会");
                        user.setUser_img(touxiang);
                        user.setSex(sex);
                        user.setGrade(0);

                        if(userfrom .equals("ADD_SCENE_QR_CODE")){

//                分享者openid
                            String inviter = usermap.getString("EventKey");
                            log.info("inviter====="+inviter);

                            user.setInviter(inviter);
                            user.setUser_from("扫描邀请二维码");
                            userservice.add(user);
                            userservice.edit2(inviter);


                        }else{

                            user.setUser_from("非用户邀请");
                            user.setInviter("null");
                            userservice.add(user);

                        }


                    response.setCharacterEncoding("UTF-8");
                    response.setContentType("text/html;charset=UTF-8");

                    HttpSession session = request.getSession(true);
                    String name = openid;
                    session.setAttribute("openid",name);

                }

        }

    }

    private String access(HttpServletRequest request) {

        //验证URL的真实性
        //微信加密签名
        String signature = request.getParameter("signature");
        //时间戳
        String timestamp = request.getParameter("timestamp");
        //随机数
        String nonce = request.getParameter("nonce");
        //随机字符串
        String echostr = request.getParameter("echostr");

        out.println("signature:"+signature);
        out.println("timestamp:"+timestamp);
        out.println("nonce"+nonce);
        out.println("echostr"+echostr);

//         通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {

            out.println("true");

            System.out.print("echostr="+echostr);
            return echostr;
        }else{

            out.println("false");
            return "fail";
        }
    }



    private Map<String,String> acceptMessage(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            Map<String, String> reqMap = MessageUtil.parseXml(request);

//            String fromUserName = reqMap.get("FromUserName");

//            String toUsername = reqMap.get("ToUserName");

//            String msgType = reqMap.get("MsgType");

//            response.getWriter().write("");
            log.info("reqMap======"+reqMap);
            return reqMap;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(String openid,HttpServletRequest request){
//        String openid = (String)request.getSession().getAttribute("openid");
        Map<String,Object> result = new HashMap<String,Object>();
        userservice.del(openid);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    @RequestMapping("/edit")
    public Map<String,Object> edit(Usertable user,HttpServletRequest request){
        String openid = (String)request.getSession().getAttribute("openid");
        Map<String,Object> result = new HashMap<String,Object>();
        userservice.edit(user);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",userservice.findall());
        return result;
    }

//    @RequestMapping("/sel")
//    public Map<String,Object> sel(String openid,HttpServletRequest request){
//        String openids = (String)request.getAttribute("openid");
//        Map<String,Object> result = new HashMap<String,Object>();
//        result.put("code",200);
//        result.put("message",userservice.sel(openid));
//        return result;
//    }


}
