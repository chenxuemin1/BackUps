package xiaobaige.Pojo.qrcode;

import xiaobaige.Pojo.Entity;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/21 0021 下午 4:30
 */
public class Qrcode extends Entity{

    /**
     * @获取的二维码ticket
     */
    private String ticket;

    /**
     * @设置二维码的有效时间
     */
    private int expire_seconds;

    /**
     * @二维码解析后得到的url地址
     */
    private String url;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getExpire_seconds() {
        return expire_seconds;
    }

    public void setExpire_seconds(int expire_seconds) {
        this.expire_seconds = expire_seconds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
