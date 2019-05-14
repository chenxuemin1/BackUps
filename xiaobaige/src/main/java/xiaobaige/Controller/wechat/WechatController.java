package xiaobaige.Controller.wechat;//package xiaobaige.Controller.wechat;
//
//
//import xiaobaige.Util.MessageUtil;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.UnsupportedEncodingException;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.*;
//
///**
// * @author xm@c.com    Administrator
// * @date 2018/4/23 0023 下午 5:18
// */
//
//@Controller
//public class WechatController {
//
//    @RequestMapping("/wechat")
//    @ResponseBody
//    public void Wechat(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        boolean isGet = request.getMethod().toLowerCase().equals("get");
//
//        if (isGet) {
//            //验证URL的真实性
//            //get方法的验证(就是token验证)
//            String str = access(request, response);
//            response.getWriter().write(str);
//        } else {
//            //post方法一般是用户的事件处理(如关注、发送消息等。。。)
//            Map<String,String> str = acceptMessage(request,response);
//
//        }
//    }
//
//    private String access(HttpServletRequest request, HttpServletResponse response) {
//
//        //验证URL的真实性
//        //微信加密签名
//        String signature = request.getParameter("signature");
//        //时间戳
//        String timestamp = request.getParameter("timestamp");
//        //随机数
//        String nonce = request.getParameter("noce");
//        //随机字符串
//        String echostr = request.getParameter("echostr");
//
//        List<String> params = new ArrayList<String>();
//
//        //添加token
//        params.add("token");
//
//        //添加时间戳
//        params.add(timestamp);
//
//        //添加随机数
//        params.add(nonce);
//
//        //将token、timestamp、nonce进行字典序排序
//        Collections.sort(params, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        //将三个参数拼接成一个字符串进行sha-1加密
//        String str = params.get(0) + params.get(1) + params.get(2);
//
//        MessageDigest messageDigest;
//
//        try {
//
//            messageDigest = MessageDigest.getInstance("SHA-1");
//
//            messageDigest.reset();
//
//            try {
//
//                messageDigest.update(str.getBytes("UTF-8"));
//
//                byte[] digesta = messageDigest.digest();
//
//                StringBuffer haxString = new StringBuffer();
//
//                String result = null;
//
//                for (int i = 0; i < digesta.length; i++) {
//
//                    String shaHex = Integer.toHexString(digesta[i] & 0xFF);
//
//                    if (shaHex.length() < 2) {
//                        haxString.append(0);
//                    }
//                    haxString.append(shaHex);
//                }
//
//                result = haxString.toString().toLowerCase();
//
//                //将加密后的参数与微信加密签名对比
//                if (result.equals(signature)) {
//
//                    //正确则返回随机字符串
//                    return echostr;
//
//                } else {
//                    return "";
//                }
//
//            } catch (UnsupportedEncodingException e) {
//
//                e.printStackTrace();
//            }
//
//        } catch (NoSuchAlgorithmException e) {
//
//            e.printStackTrace();
//        }
//        return  null;
//    }
//
//    private Map<String,String> acceptMessage(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        try {
//            Map<String, String> reqMap = MessageUtil.parseXml(request);
//
//            //即用户的openID
//            String fromUserName = reqMap.get("FromUserName");
//
//            String toUsername = reqMap.get("ToUserName");
//
//            String msgType = reqMap.get("MsgType");
//
//            return reqMap;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
