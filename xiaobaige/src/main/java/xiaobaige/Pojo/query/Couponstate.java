package xiaobaige.Pojo.query;

import xiaobaige.Pojo.Entity;

/**
 * 优惠券状态类别
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 4:31
 */
public class Couponstate extends Entity{

    private int id;
    private String coupon_state;
    private int coupon_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoupon_state() {
        return coupon_state;
    }

    public void setCoupon_state(String coupon_state) {
        this.coupon_state = coupon_state;
    }

    public int getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(int coupon_code) {
        this.coupon_code = coupon_code;
    }
}
