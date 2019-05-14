package ldxht.Pojo.coupon;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 1:08
 */
public class Give_table {
    //优惠券id
    private int coupon_id;
    //订单id
    private int order_id;
    //订单编号
    private int order_number;
    //昵称
    private String user_nickanem;
    //下单时间
    private String time;
    //重量
    private double weight;
    //快递单号
    private long express_number;
    //优惠券面值
    private int money;
    //使用条件
    private String condition;
    //有效期
    private String valid_date;

    public int getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public String getUser_nickanem() {
        return user_nickanem;
    }

    public void setUser_nickanem(String user_nickanem) {
        this.user_nickanem = user_nickanem;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getExpress_number() {
        return express_number;
    }

    public void setExpress_number(long express_number) {
        this.express_number = express_number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }
}
