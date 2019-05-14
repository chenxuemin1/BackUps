package xiaobaige.Service.qrcode.Impl;//package xiaobaige.Service.qrcode.Impl;
//
//import com.google.gson.JsonSyntaxException;
//import xiaobaige.Constant.QrCodeConstant;
//import xiaobaige.Pojo.qrcode.Qrcode;
//import xiaobaige.Pojo.qrcode.WechatQRCodeShortUrl;
//import xiaobaige.Pojo.qrcode.WechatResult;
//import xiaobaige.Service.qrcode.Qrcodeservice;
//import xiaobaige.Util.HttpReqUtil;
//import xiaobaige.Util.JsonUtil;
//import xiaobaige.Util.SystemConstant;
//import xiaobaige.Util.WechatConfig;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeMap;
//
///**
// * @author xm@c.com    Administrator
// * @date 2018/4/21 0021 下午 5:24
// */
//
//@Service
//public class QrcodeserviceImpl implements Qrcodeservice {
//
//
//    /**
//     * 生成临时二维码
//     * @param accessToken
//     * @param expireSeconds 该二维码的有效时间，以秒为单位，最大不超过2592000（30天），默认为30秒
//     * @param sceneId 场景Id
//     * @return
//     */
//    @Override
//    public String createTempTicket(String accessToken, int expireSeconds, int sceneId) {
//
//        TreeMap<String,String> params = new TreeMap<>();
//        params.put("access_Token","accessToken");
//        Map<String,Integer> intMap = new HashMap<>();
//        intMap.put("scene_id",sceneId);
//        Map<String,Map<String,Integer>> mapMap = new HashMap<>();
//        mapMap.put("scnen",intMap);
//        Map<String,Object> paramsMap = new HashMap<>();
//        paramsMap.put("expire_seconds",expireSeconds);
//        paramsMap.put("action_name", QrCodeConstant.QR_SCENE);
//        paramsMap.put("action_info",mapMap);
//        String data = JsonUtil.toJsonString(paramsMap);
//        data = HttpReqUtil.HttpsDefaultExecute(SystemConstant.POST_METHOD, WechatConfig.CREATE_TICKET_PATH,params,data);
//        Qrcode qrcode = null;
//        try{
//            qrcode = JsonUtil.fromJsonString(data,Qrcode.class);
//        }catch (JsonSyntaxException e){
//            e.printStackTrace();
//        }
//        return qrcode == null ? null:qrcode.getTicket();
//
//
//    }
//
//    /**
//     * @生成永久二维码（字符串）
//     * @param accessToken
//     * @param sceneStr
//     * @return
//     */
//    @Override
//    public String createForeverStrTicket(String accessToken, String sceneStr) {
//        TreeMap<String, String> params = new TreeMap<>();
//        params.put("access_token", accessToken);
//        // output data
//        Map<String, String> intMap = new HashMap<>();
//        intMap.put("scene_str", sceneStr);
//        Map<String, Map<String, String>> mapMap = new HashMap<>();
//        mapMap.put("scene", intMap);
//        Map<String, Object> paramsMap = new HashMap<>();
//        paramsMap.put("action_name", QrCodeConstant.QR_LIMIT_STR_SCENE);
//        paramsMap.put("action_info", mapMap);
//        String data = JsonUtil.toJsonString(paramsMap);
//        data = HttpReqUtil.HttpsDefaultExecute(SystemConstant.POST_METHOD, WechatConfig.CREATE_TICKET_PATH, params, data);
//        Qrcode qrcode = null;
//        try {
//            qrcode = JsonUtil.fromJsonString(data, Qrcode.class);
//        } catch (JsonSyntaxException e) {
//            e.printStackTrace();
//        }
//        return qrcode == null ? null : qrcode.getTicket();
//    }
//
//
//    /**
//     * @通过ticket换取二维码展示
//     * @param accessToken
//     * @param ticket
//     * @return
//     * @throws Exception
//     */
//    @Override
//    public String showQrcode(String accessToken, String ticket) throws Exception {
//        return toShortQRCodeurl(accessToken, HttpReqUtil.setParmas(params(ticket), WechatConfig.SHOW_QRCODE_PATH, null));
//    }
//
//
//    /**
//     * @下载二维码
//     * @param ticket
//     * @param savePath
//     * @return
//     * @throws Exception
//     */
//    @Override
//    public WechatResult downshowQrcode(String ticket, String savePath) throws Exception {
//        return HttpReqUtil.downMeaterMetod(params(ticket), SystemConstant.GET_METHOD, WechatConfig.SHOW_QRCODE_PATH,
//                savePath);
//    }
//
//    private TreeMap<String, String> params(String ticket) {
//        TreeMap<String, String> params = new TreeMap<>();
//        params.put("ticket", HttpReqUtil.urlEncode(ticket, SystemConstant.DEFAULT_CHARACTER_ENCODING));
//        return params;
//    }
//
//    /**
//     * 长链接转短链接
//     *
//     * @param accessToken
//     * @param longUrl  长链接
//     * @return
//     */
//    private String toShortQRCodeurl(String accessToken, String longUrl) {
//        TreeMap<String, String> params = new TreeMap<>();
//        params.put("access_token", accessToken);
//        Map<String, Object> paramsMap = new HashMap<>();
//        paramsMap.put("action", QrCodeConstant.LONG2SHORT);
//        paramsMap.put("long_url", longUrl);
//        String data = JsonUtil.toJsonString(paramsMap);
//        String result = HttpReqUtil.HttpsDefaultExecute(SystemConstant.POST_METHOD, WechatConfig.WECHAT_SHORT_QRCODE_URL,
//                params, data);
//        WechatQRCodeShortUrl wechatQRCodeShortUrl = JsonUtil.fromJsonString(result, WechatQRCodeShortUrl.class);
//        return wechatQRCodeShortUrl.getShort_url();
//    }
//}
