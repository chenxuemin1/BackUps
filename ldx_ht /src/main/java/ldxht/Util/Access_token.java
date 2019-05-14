package ldxht.Util;//package ldx.Util;
//
//import ldx.Service.access_token.Access_tokenservice;
//import net.sf.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static java.lang.System.out;
//
///**
// * @author xm@c.com    Administrator
// * @date 2018/5/18 0018 下午 1:38
// */
//public class Access_token implements Runnable {
//
//    public static WechatUtil wechatUtil = new WechatUtil();
//    public static JSONObject access_token_json;
//    public static String ACCESS_TOKEN = null;
//    public static int EXPIRES_IN ;
//    public static final String appid="wx7c0ce70a0c29dff0";
//    public static final String secter="06437d3b25dd3a725d38ff3bd283856c";
//
//    @Autowired
//    private Access_tokenservice access_tokenservice;
//
//    @Override
//    public void run() {
//
//        while (true){
//            try{
//
//                String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secter;
//                access_token_json = wechatUtil.httpRequest(url,"GET","null");
//                ACCESS_TOKEN = access_token_json.getString("access_token");
//                EXPIRES_IN = access_token_json.getInt("expires_in");
//
//
//                if(ACCESS_TOKEN!=null){
//
//                    out.println("-----------------------------------------这是获取到的access_token--------------------------------------------"+ACCESS_TOKEN+"有效期为："+EXPIRES_IN);
//
////                    String access =  access_tokenservice.sel();
////
////                    if(access==null||access.isEmpty()){
////                        access_tokenservice.add(ACCESS_TOKEN);
////                        out.print("access_token存储成功");
////                    }else {
////                        access_tokenservice.edit(ACCESS_TOKEN);
////                        out.print("access_token存储成功");
////                    }
//
////                    Thread.sleep((EXPIRES_IN-100)*1000);
//                    Thread.sleep(5*1000);
//                }else {
//                    out.println(access_token_json.getInt("errcode"));
//                    out.println(access_token_json.getString("errmsg"));
//                    Thread.sleep(5*1000);
//
//                }
//
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//
//        }
//    }
//}
