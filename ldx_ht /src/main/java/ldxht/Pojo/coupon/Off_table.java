package ldxht.Pojo.coupon;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 1:09
 */
public class Off_table {
    //优惠券id
    private int coupon_id;
    //优惠券券号
    private String coupon_cord_id;
    //面值
    private int money;
    //有效日期
    private String valid_date;
    //使用条件
    private String condition;
    //领取人（昵称）
    private String nickname;
    //领取时间
    private String get_time;
    //使用情况
    private int use_state;

    public int getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
    }

    public String getCoupon_cord_id() {
        return coupon_cord_id;
    }

    public void setCoupon_cord_id(String coupon_cord_id) {
        this.coupon_cord_id = coupon_cord_id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGet_time() {
        return get_time;
    }

    public void setGet_time(String get_time) {
        this.get_time = get_time;
    }

    public int getUse_state() {
        return use_state;
    }

    public void setUse_state(int use_state) {
        this.use_state = use_state;
    }
}
