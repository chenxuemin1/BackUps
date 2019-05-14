package ldxht.Pojo.data;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 2:10
 */
public class User_info_table {
    //用户id
    private int user_id;
    //昵称
    private String nickname;
    //名字
    private String name;
    //电话号码
    private long phone_number;
    //下单次数
    private int back_number;
    //优惠券数量
    private int coupon_number;
    //地区
    private String location;
    //总重量
    private double weight;
    //用户来源
    private int user_from;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public int getBack_number() {
        return back_number;
    }

    public void setBack_number(int back_number) {
        this.back_number = back_number;
    }

    public int getCoupon_number() {
        return coupon_number;
    }

    public void setCoupon_number(int coupon_number) {
        this.coupon_number = coupon_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getUser_from() {
        return user_from;
    }

    public void setUser_from(int user_from) {
        this.user_from = user_from;
    }
}
