package ldxht.Pojo.data;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 2:10
 */
public class User_data_table {
    //用户数
    private int user_number;
    //总反赠金额
    private double back_money;
    //优惠券派发次数
    private int coupon_give_number;
    //下单次数
    private int back_number;
    //使用终端数
    private int terminal_number;
    //手机端比重
    private double phone_proportion;
    //pc端比重
    private double pc_proportion;
    //用户来源数量
    private int user_from;
    //用户来源比重(直接关注)
    private int zj_follow_proportion;
    //用户来源比重(其他)
    private int qt_follow_proportion;

    public int getUser_number() {
        return user_number;
    }

    public void setUser_number(int user_number) {
        this.user_number = user_number;
    }

    public double getBack_money() {
        return back_money;
    }

    public void setBack_money(double back_money) {
        this.back_money = back_money;
    }

    public int getCoupon_give_number() {
        return coupon_give_number;
    }

    public void setCoupon_give_number(int coupon_give_number) {
        this.coupon_give_number = coupon_give_number;
    }

    public int getBack_number() {
        return back_number;
    }

    public void setBack_number(int back_number) {
        this.back_number = back_number;
    }

    public int getTerminal_number() {
        return terminal_number;
    }

    public void setTerminal_number(int terminal_number) {
        this.terminal_number = terminal_number;
    }

    public double getPhone_proportion() {
        return phone_proportion;
    }

    public void setPhone_proportion(double phone_proportion) {
        this.phone_proportion = phone_proportion;
    }

    public double getPc_proportion() {
        return pc_proportion;
    }

    public void setPc_proportion(double pc_proportion) {
        this.pc_proportion = pc_proportion;
    }

    public int getUser_from() {
        return user_from;
    }

    public void setUser_from(int user_from) {
        this.user_from = user_from;
    }

    public int getZj_follow_proportion() {
        return zj_follow_proportion;
    }

    public void setZj_follow_proportion(int zj_follow_proportion) {
        this.zj_follow_proportion = zj_follow_proportion;
    }

    public int getQt_follow_proportion() {
        return qt_follow_proportion;
    }

    public void setQt_follow_proportion(int qt_follow_proportion) {
        this.qt_follow_proportion = qt_follow_proportion;
    }
}
