package xiaobaige.Pojo.query;

import xiaobaige.Pojo.Entity;

import java.util.Date;

/**
 * 优惠券表
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 4:32
 */
public class Coupontable extends Entity{

    private int id;
    private String openid;
    private String express_number;
    private int coupon_state;
    private java.sql.Date coupon_date;
    private Date coupon_create_time;

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

    public String getExpress_number() {
        return express_number;
    }

    public void setExpress_number(String express_number) {
        this.express_number = express_number;
    }

    public int getCoupon_state() {
        return coupon_state;
    }

    public void setCoupon_state(int coupon_state) {
        this.coupon_state = coupon_state;
    }

//    public Date getCoupon_date() {
//        return coupon_date;
//    }

//    public void setCoupon_date(Date coupon_date) {
//        this.coupon_date = coupon_date;
//    }


    public java.sql.Date getCoupon_date() {
        return coupon_date;
    }

    public void setCoupon_date(java.sql.Date coupon_date) {
        this.coupon_date = coupon_date;
    }

    public Date getCoupon_create_time() {
        return coupon_create_time;
    }

    public void setCoupon_create_time(Date coupon_create_time) {
        this.coupon_create_time = coupon_create_time;
    }
}

