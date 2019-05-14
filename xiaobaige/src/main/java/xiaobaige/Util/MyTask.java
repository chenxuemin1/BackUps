package xiaobaige.Util;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import xiaobaige.Service.access_token.Access_tokenservice;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.TimerTask;

import static java.lang.System.out;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/10 0010 上午 10:04
 */
public class MyTask extends TimerTask {

    public static WechatUtil wechatUtil = new WechatUtil();
    public static JSONObject access_token_json;
    public static String ACCESS_TOKEN = null;
    public static String EXPIRES_IN = null;
//    微信公众平台
    public static final String appid="wx7c0ce70a0c29dff0";
    public static final String secter="859b811a521f27ed0907604ca831e110";
//    微信开放平台：网站应用
//    public static final String appid="wx3fe65bedefd642de";
//    public static final String secter="9b1176e0d6362b06496adb2b20bec4c8";
//    微信开放平台：第三方平台
//    public static final String appid="wx2b6a9d00a69128c1";
//    public static final String secter="a1ff243e054bcfd32a766f4b68684b8e";

    @Autowired
     private Access_tokenservice access_tokenservice;

    @Override
    public void run() {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secter;
        access_token_json = wechatUtil.httpRequest(url,"GET","null");
        ACCESS_TOKEN = access_token_json.getString("access_token");
        EXPIRES_IN = access_token_json.getString("expires_in");

        out.println("-----------------------------------------这是获取到的access_token--------------------------------------------\n"+ACCESS_TOKEN+"\n有效期为："+EXPIRES_IN);

        String menuurl = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+ACCESS_TOKEN;
        JSONArray list = new JSONArray();
        JSONObject obj = new JSONObject();
        obj.put("name","捐赠登记");
        obj.put("type","view");
        obj.put("url","http://www.xiaominguan.com/xiaobaige/yysy");
        JSONObject obj2 = new JSONObject();
        obj2.put("name","我的订单");
        obj2.put("type","view");
        obj2.put("url","http://www.xiaomingtuan.com/xiaobaige/my_jz");
        list.add(obj);
        list.add(obj2);

//        String json = "{\n" +
//                "    \"button\": [\n" +
//                "        {\n" +
//                "            \"name\": \"捐赠登记\", \n" +
//                "            \"type\": \"view\", \n" +
//                "            \"url\": \"www.xiaominguan.com/xiaobaige/yysy\"\n" +
//                "        }, \n" +
//                "        {\n" +
//                "            \"name\": \"我的订单\", \n" +
//                "            \"type\": \"view\", \n" +
//                "            \"url\": \"www.xiaomingtuan.com/xiaobaige/my_jz\"\n" +
//                "        }\n" +
//                "    ]\n" +
//                "}";
//        JSONObject jsonObject = JSONObject .fromObject(json);

        WechatUtil.httpRequest(menuurl, "POST", list.toString());
        out.println("自定义菜单成功");
//        access_tokenservice.edit(ACCESS_TOKEN);
//        out.println("存入成功");

        try {
            Thread.sleep(7000*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        String access =  access_tokenservice.sel();

//        access_tokenservice.edit(ACCESS_TOKEN);
//        out.print("access_token存储成功");



//        RedisUtil.set("access_token",ACCESS_TOKEN,7200000L);
//        RedisUtil.set("access_token1",test,7200000L);
    }

}
