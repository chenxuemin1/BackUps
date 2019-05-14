package xiaobaige.Pojo.qrcode;

/**
 * 二维码短链接返回结果
 * @author xm@c.com    Administrator
 * @date 2018/4/21 0021 下午 7:54
 */

public class WechatQRCodeShortUrl extends Resultstate{

    private String short_url; //短链接

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }
}
