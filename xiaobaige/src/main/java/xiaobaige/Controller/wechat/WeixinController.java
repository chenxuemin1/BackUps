package xiaobaige.Controller.wechat;//package xiaobaige.Controller.wechat;
//
//import org.aspectj.bridge.MessageUtil;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.*;
//
///**
// * @author xm@c.com    Administrator
// * @date 2018/4/23 0023 上午 11:47
// */
//@Controller
//public class WeixinController {
//
//    // 唯藌的url、token接口设置(来自微信服务器的消息)
//    @RequestMapping("/test")
//    @ResponseBody
//    public void weixinUrlSet(HttpServletRequest request,
//                             HttpServletResponse response) throws IOException {
//        System.out.println("进入test,微信的访问会有2种方式post以及get,get只是做url验证。 ");
//
//        boolean isGet = request.getMethod().toLowerCase().equals("get");
//
//        if (isGet) {
//            System.out.println("request:" + request.toString());
//            //get方法，一般用于微信服务器与本机服务器开发的基本配置（就是token验证，确定服务器是你的）
//            String str = access(request, response);
//            response.getWriter().write(str);
//        } else {
//            //post方法，一般是用户的事件处理（例如：关注/取消关注、点击按钮、发送消息....）
//            System.out.println("enter post");
//
//            try {
//                // 接收消息并返回消息
//                String str = acceptMessage(request, response);
//
//                response.getWriter().write(str);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    /**
//     * 验证URL真实性
//     *
//     * @param request
//     * @param response
//     * @return String
//     * @throws NoSuchAlgorithmException
//     * @throws UnsupportedEncodingException
//     * @author morning
//     * @date 2015年2月17日 上午10:53:07
//     */
//    private String access(HttpServletRequest request,
//                          HttpServletResponse response) {
//        // 验证URL真实性
//        System.out.println("进入验证access");
//        String signature = request.getParameter("signature"); // 微信加密签名
//        String timestamp = request.getParameter("timestamp"); // 时间戳
//        String nonce = request.getParameter("nonce");// 随机数
//        String echostr = request.getParameter("echostr");// 随机字符串
//
//        List<String> params = new ArrayList<String>();
//        //WeixinStaticData. TOKEN就是配置时的token
//        params.add(WeixinStaticData.TOKEN);
//        params.add(timestamp);
//        params.add(nonce);
//
//        // 1. 将token、timestamp、nonce三个参数进行字典序排序
//        Collections.sort(params, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        // 2. 将三个参数字符串拼接成一个字符串进行sha1加密
//        String str = params.get(0) + params.get(1) + params.get(2);
//        MessageDigest crypt;
//        try {
//            crypt = MessageDigest.getInstance("SHA-1");
//            crypt.reset();
//
//            try {
//                crypt.update(str.getBytes("UTF-8"));
//
//                String temp = WeixinTool.batySHA1(crypt.digest());
//
//                if (temp.equals(signature)) {
//                    System.out.println("成功返回 echostr：" + echostr);
//                    return echostr;
//                } else {
//                    System.out.println("失败 认证");
//                }
//            } catch (UnsupportedEncodingException e1) {
//                // TODO Auto-generated catch block
//                e1.printStackTrace();
//            }
//
//        } catch (NoSuchAlgorithmException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
//        return null;
//    }
//
//    private String acceptMessage(HttpServletRequest request,
//                                 HttpServletResponse response) throws IOException {
//        Map<String, String> reqMap = MessageUtil.parseXml(request);
//
//        System.out.println("reqMap:" + reqMap.toString());
//
//        String fromUserName = reqMap.get("FromUserName");
//        String toUserName = reqMap.get("ToUserName");
//        String msgType = reqMap.get("MsgType");
//
//        BaseMsg msg = null;// 要发送的消息
//
//        // 事件推送
//        if (msgType.equals(ReqType.EVENT)) {
//            // 事件类型
//            String eventType = reqMap.get("Event");
//
//            // 二维码事件
//            String ticket = reqMap.get("Ticket");
//            if (ticket != null) {
//                String eventKey = reqMap.get("EventKey");
//                QrCodeEvent event = new QrCodeEvent(eventKey, ticket);
//                buildBasicEvent(reqMap, event);
//                msg = handleQrCodeEvent(event);
//            }
//            // 关注
//            if (eventType.equals(EventType.SUBSCRIBE)) {
//                //根据reqMap 可以判断用户是否扫带有有参数的二维码
//                BaseEvent event = new BaseEvent();
//                buildBasicEvent(reqMap, event);
//                msg = handleSubscribe(event, reqMap);
//
//            }
//            // 取消关注
//            else if (eventType.equals(EventType.UNSUBSCRIBE)) {
//                BaseEvent event = new BaseEvent();
//                buildBasicEvent(reqMap, event);
//                msg = handleUnsubscribe(event);
//            }
//            // 点击菜单拉取消息时的事件推送
//            else if (eventType.equals(EventType.CLICK)) {
//                System.out.println("点击菜单拉取消息时的事件推送");
//                String eventKey = reqMap.get("EventKey");
//                MenuEvent event = new MenuEvent(eventKey);
//                buildBasicEvent(reqMap, event);
//                msg = handleMenuClickEvent(event);
//            }
//            // 点击菜单跳转链接时的事件推送
//            else if (eventType.equals(EventType.VIEW)) {
//                System.out.println("点击菜单跳转链接时的事件推送");
//                String eventKey = reqMap.get("EventKey");
//                MenuEvent event = new MenuEvent(eventKey);
//                System.out.println("event：" + event.toXml().toString());
//                buildBasicEvent(reqMap, event);
//
//                msg = handleMenuViewEvent(event);
//            }
//            // 上报地理位置事件
//            else if (eventType.equals(EventType.LOCATION)) {
//                double latitude = Double.parseDouble(reqMap.get("Latitude"));
//                double longitude = Double.parseDouble(reqMap.get("Longitude"));
//                double precision = Double.parseDouble(reqMap.get("Precision"));
//                LocationEvent event = new LocationEvent(latitude, longitude,
//                        precision);
//                buildBasicEvent(reqMap, event);
//                msg = handleLocationEvent(event);
//            }
//
//        } else {// 接受普通消息
//
//            // 文本消息
//            if (msgType.equals(ReqType.TEXT)) {
//                String content = reqMap.get("Content");
//                TextReqMsg textReqMsg = new TextReqMsg(content);
//                buildBasicReqMsg(reqMap, textReqMsg);
//                msg = handleTextMsg(textReqMsg);
//            }
//            // 图片消息
//            else if (msgType.equals(ReqType.IMAGE)) {
//                String picUrl = reqMap.get("PicUrl");
//                String mediaId = reqMap.get("MediaId");
//                ImageReqMsg imageReqMsg = new ImageReqMsg(picUrl, mediaId);
//                buildBasicReqMsg(reqMap, imageReqMsg);
//                msg = handleImageMsg(imageReqMsg);
//            }
//            // 音频消息
//            else if (msgType.equals(ReqType.VOICE)) {
//                String format = reqMap.get("Format");
//                String mediaId = reqMap.get("MediaId");
//                String recognition = reqMap.get("Recognition");
//                VoiceReqMsg voiceReqMsg = new VoiceReqMsg(mediaId, format,
//                        recognition);
//                buildBasicReqMsg(reqMap, voiceReqMsg);
//                msg = handleVoiceMsg(voiceReqMsg);
//            }
//            // 视频消息
//            else if (msgType.equals(ReqType.VIDEO)) {
//                String thumbMediaId = reqMap.get("ThumbMediaId");
//                String mediaId = reqMap.get("MediaId");
//                VideoReqMsg videoReqMsg = new VideoReqMsg(mediaId, thumbMediaId);
//                buildBasicReqMsg(reqMap, videoReqMsg);
//                msg = handleVideoMsg(videoReqMsg);
//            }
//            // 地理位置消息
//            else if (msgType.equals(ReqType.LOCATION)) {
//                double locationX = Double.parseDouble(reqMap.get("Location_X"));
//                double locationY = Double.parseDouble(reqMap.get("Location_Y"));
//                int scale = Integer.parseInt(reqMap.get("Scale"));
//                String label = reqMap.get("Label");
//                LocationReqMsg locationReqMsg = new LocationReqMsg(locationX,
//                        locationY, scale, label);
//                buildBasicReqMsg(reqMap, locationReqMsg);
//                msg = handleLocationMsg(locationReqMsg);
//            }
//            // 链接消息
//            else if (msgType.equals(ReqType.LINK)) {
//                String title = reqMap.get("Title");
//                String description = reqMap.get("Description");
//                String url = reqMap.get("Url");
//                LinkReqMsg linkReqMsg = new LinkReqMsg(title, description, url);
//                buildBasicReqMsg(reqMap, linkReqMsg);
//                msg = handleLinkMsg(linkReqMsg);
//            }
//
//        }
//
//        if (msg == null) {
//            // 回复空串是微信的规定，代表不回复
//            return "";
//        }
//
//        msg.setFromUserName(toUserName);
//        msg.setToUserName(fromUserName);
//        return msg.toXml();
//    }
//
//    /*******************************************下面为处理每个请求的具体逻辑入口*******************************/
//
//    /**
//     * 处理文本消息
//     */
//    protected BaseMsg handleTextMsg(TextReqMsg msg ) {
//        return handleDefaultMsg(msg );
//    }
//
//    /**
//     * 处理图片消息
//     */
//    protected BaseMsg handleImageMsg(ImageReqMsg msg ) {
//        return handleDefaultMsg(msg );
//    }
//
//    /**
//     * 处理语音消息
//     */
//    protected BaseMsg handleVoiceMsg(VoiceReqMsg msg ) {
//        return handleDefaultMsg(msg );
//    }
//
//    /**
//     * 处理视频消息
//     */
//    protected BaseMsg handleVideoMsg(VideoReqMsg msg ) {
//        return handleDefaultMsg(msg );
//    }
//
//    /**
//     * 处理地理位置消息
//     */
//    protected BaseMsg handleLocationMsg(LocationReqMsg msg) {
//        return handleDefaultMsg(msg );
//    }
//
//    /**
//     * 处理链接消息
//     */
//    protected BaseMsg handleLinkMsg(LinkReqMsg msg ) {
//        return handleDefaultMsg(msg );
//    }
//
//    /**
//     * 处理扫描带参数二维码事件
//     */
//    protected BaseMsg handleQrCodeEvent(QrCodeEvent event ) {
//        System. out.println("处理扫描带参数二维码事件" );
//        System. out.println("event:" +event .toXml());
//        userScanQrCodeService.handleScanQrCode();
//        return handleDefaultEvent(event );
//    }
//
//    /**
//     * 处理上报地理位置事件
//     */
//    protected BaseMsg handleLocationEvent(LocationEvent event) {
//        return handleDefaultEvent(event );
//    }
//
//    /**
//     * 处理点击菜单拉取消息时的事件推送
//     */
//    protected BaseMsg handleMenuClickEvent(MenuEvent event) {
//        return handleDefaultEvent(event );
//    }
//
//    /**
//     * 处理点击菜单跳转链接时的事件推送
//     */
//    protected BaseMsg handleMenuViewEvent(MenuEvent event ) {
//        return handleDefaultEvent(event );
//    }
//
//    /**
//     * 处理关注事件
//     * 默认不回复
//     */
//    protected BaseMsg handleSubscribe(BaseEvent event , Map<String,String> reMap) {
//        System. out.println("用户关注======" );
//        userSubscribeService.handleSubscribeService(event ,reMap );
//        String msg = userSubscribeService.displayAutoReturn();
//        return new TextMsg(msg);
//    }
//
//    /**
//     * 处理取消订阅事件 <br>
//     * 默认不回复
//     */
//    protected BaseMsg handleUnsubscribe(BaseEvent event ) {
//        System. out.println("用户取消关注======" );
//        userUnSubscribeService.handleUnSubscribe(event );
//        return null ;
//    }
//
//    /**
//     * 处理消息的默认方式 <br>
//     * 如果不重写该方法，则默认不返回任何消息
//     */
//    protected BaseMsg handleDefaultMsg(BaseReqMsg msg ) {
//        return null ;
//    }
//
//    /**
//     * 设置处理事件的默认方式 <br>
//     * 如果不重写该方法，则默认不返回任何消息
//     */
//    protected BaseMsg handleDefaultEvent(BaseEvent event ) {
//        return null ;
//    }
//
//    /**
//     * 为事件普通消息对象添加基本参数 <br>
//     * 参数包括：MsgId、MsgType、FromUserName、ToUserName和CreateTime
//     */
//    private void buildBasicReqMsg(Map<String, String> reqMap, BaseReqMsg reqMsg) {
//        addBasicReqParams( reqMap, reqMsg);
//        reqMsg.setMsgId( reqMap.get( "MsgId"));
//    }
//
//    /**
//     * 为事件推送对象添加基本参数 <br>
//     * 参数包括：Event、MsgType、FromUserName、ToUserName和CreateTime
//     */
//    private void buildBasicEvent(Map<String, String> reqMap, BaseEvent event) {
//        addBasicReqParams( reqMap, event);
//        event.setEvent( reqMap.get( "Event"));
//    }
//
//    /**
//     * 为请求对象添加基本参数，包括MsgType、FromUserName、ToUserName和CreateTime <br>
//     * 请求对象包括普通消息和事件推送
//     */
//    private void addBasicReqParams(Map<String, String> reqMap, BaseReq req) {
//        req.setMsgType( reqMap.get( "MsgType"));
//        req.setFromUserName( reqMap.get( "FromUserName"));
//        req.setToUserName( reqMap.get( "ToUserName"));
//        req.setCreateTime(Long. parseLong(reqMap.get("CreateTime")));
//    }
//}