package xiaobaige.Service.qrcode;

import xiaobaige.Pojo.qrcode.WechatResult;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/21 0021 下午 4:36
 */
public interface Qrcodeservice {

    /**
     * @创建临时带参数的二维码
     * @param accessToken
     * @param expireSeconds 该二维码的有效时间，以秒为单位，最大不超过2592000（30天），默认为30秒
     * @param sceneId 场景Id
     * @return
     */
    public String createTempTicket(String accessToken, int expireSeconds, int sceneId);

    /**
     * @创建永久二维码（字符串）
     * @param accessToken
     * @param sceneStr 场景Str
     * @return
     */
    public String createForeverStrTicket(String accessToken, String sceneStr);

    /**
     * @获取二维码的ticker，通过ticker换取二维码图片展示
     * @param accessToken
     * @param ticker
     * @return
     */
    public String showQrcode(String accessToken, String ticker) throws Exception;

    /**
     * @下载二维码图片
     * @param ticket
     * @param savePath
     * @return
     */
    public WechatResult downshowQrcode(String ticket, String savePath) throws Exception;


    public String getQrcode(String account);

    public String getTempQrcode(String scene_id);

    public String sendPost(String param, String url);

    public String downloadFile(String urlString, String filePath);
}
