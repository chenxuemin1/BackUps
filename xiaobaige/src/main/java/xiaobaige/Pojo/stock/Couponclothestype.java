package xiaobaige.Pojo.stock;

import xiaobaige.Pojo.Entity;

/**衣服类别
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 4:39
 */
public class Couponclothestype extends Entity{

    private int id;
    private int coupon_clothes_code;
    private String coupon_clothes_type;
    private int coupon_clothes_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoupon_clothes_code() {
        return coupon_clothes_code;
    }

    public void setCoupon_clothes_code(int coupon_clothes_code) {
        this.coupon_clothes_code = coupon_clothes_code;
    }

    public String getCoupon_clothes_type() {
        return coupon_clothes_type;
    }

    public void setCoupon_clothes_type(String coupon_clothes_type) {
        this.coupon_clothes_type = coupon_clothes_type;
    }

    public int getCoupon_clothes_number() {
        return coupon_clothes_number;
    }

    public void setCoupon_clothes_number(int coupon_clothes_number) {
        this.coupon_clothes_number = coupon_clothes_number;
    }
}
