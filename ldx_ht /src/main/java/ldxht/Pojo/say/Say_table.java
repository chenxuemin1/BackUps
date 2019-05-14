package ldxht.Pojo.say;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 1:38
 */
public class Say_table {
    //说说id
    private int say_id;
    //昵称
    private String nickanme;
    //发布时间
    private String time;
    //发布内容
    private String message;
    //说说图片url
    private String photo_loca1;
    private String photo_loca2;
    private String photo_loca3;

    public int getSay_id() {
        return say_id;
    }

    public void setSay_id(int say_id) {
        this.say_id = say_id;
    }

    public String getNickanme() {
        return nickanme;
    }

    public void setNickanme(String nickanme) {
        this.nickanme = nickanme;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoto_loca1() {
        return photo_loca1;
    }

    public void setPhoto_loca1(String photo_loca1) {
        this.photo_loca1 = photo_loca1;
    }

    public String getPhoto_loca2() {
        return photo_loca2;
    }

    public void setPhoto_loca2(String photo_loca2) {
        this.photo_loca2 = photo_loca2;
    }

    public String getPhoto_loca3() {
        return photo_loca3;
    }

    public void setPhoto_loca3(String photo_loca3) {
        this.photo_loca3 = photo_loca3;
    }
}
