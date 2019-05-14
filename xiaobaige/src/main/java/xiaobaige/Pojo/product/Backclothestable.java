package xiaobaige.Pojo.product;

import xiaobaige.Pojo.Entity;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/16 0016 下午 6:25
 */
public class Backclothestable extends Entity {

    private int id;
    private String openid;
    private String back_loca;
    private String sender_name;
    private long sender_phone;
    private String city_picker;
    private String minute_loca;
    private String express_type;
    private String express_number;
    private double weight;
    private double confirm_weight;
    private int back_state;
    private String remark;
    private String donation_time;
    private String express_state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getBack_loca() {
        return back_loca;
    }

    public void setBack_loca(String back_loca) {
        this.back_loca = back_loca;
    }

    public String getSender_name() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    public long getSender_phone() {
        return sender_phone;
    }

    public void setSender_phone(long sender_phone) {
        this.sender_phone = sender_phone;
    }

    public String getCity_picker() {
        return city_picker;
    }

    public void setCity_picker(String city_picker) {
        this.city_picker = city_picker;
    }

    public String getMinute_loca() {
        return minute_loca;
    }

    public void setMinute_loca(String minute_loca) {
        this.minute_loca = minute_loca;
    }

    public String getExpress_type() {
        return express_type;
    }

    public void setExpress_type(String express_type) {
        this.express_type = express_type;
    }

    public String getExpress_number() {
        return express_number;
    }

    public void setExpress_number(String express_number) {
        this.express_number = express_number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getConfirm_weight() {
        return confirm_weight;
    }

    public void setConfirm_weight(double confirm_weight) {
        this.confirm_weight = confirm_weight;
    }

    public int getBack_state() {
        return back_state;
    }

    public void setBack_state(int back_state) {
        this.back_state = back_state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

//    public Date getDonation_time() {
//        return donation_time;
//    }
//
//    public void setDonation_time(Date donation_time) {
//        this.donation_time = donation_time;
//    }


    public String getDonation_time() {
        return donation_time;
    }

    public void setDonation_time(String donation_time) {
        this.donation_time = donation_time;
    }

    public String getExpress_state() {
        return express_state;
    }

    public void setExpress_state(String express_state) {
        this.express_state = express_state;
    }
}
