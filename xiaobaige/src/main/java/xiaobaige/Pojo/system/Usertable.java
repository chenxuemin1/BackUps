package xiaobaige.Pojo.system;

import xiaobaige.Pojo.Entity;

/**用户表
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 4:34
 */
public class Usertable extends Entity{

    private int id;
    private String openid;
    private String user_name;
    private String user_img;
    private long user_telephone;
    private String user_nickname;
    private int buy_number;
    private int coupon_number;
    private String location;
    private String user_from;
    private String follow_time;
    private int invitation_number;
    private int donation_number;
    private String inviter;
    private String vip_grade;
    private double donation_weight;
    private int grade;
    private int sex;
    private String over_number;


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

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public long getUser_telephone() {
        return user_telephone;
    }

    public void setUser_telephone(long user_telephone) {
        this.user_telephone = user_telephone;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public int getBuy_number() {
        return buy_number;
    }

    public void setBuy_number(int buy_number) {
        this.buy_number = buy_number;
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

    public String getUser_from() {
        return user_from;
    }

    public void setUser_from(String user_from) {
        this.user_from = user_from;
    }

    public String getFollow_time() {
        return follow_time;
    }

    public void setFollow_time(String follow_time) {
        this.follow_time = follow_time;
    }

    public int getInvitation_number() {
        return invitation_number;
    }

    public void setInvitation_number(int invitation_number) {
        this.invitation_number = invitation_number;
    }

    public int getDonation_number() {
        return donation_number;
    }

    public void setDonation_number(int donation_number) {
        this.donation_number = donation_number;
    }

    public String getInviter() {
        return inviter;
    }

    public void setInviter(String inviter) {
        this.inviter = inviter;
    }

    public String getVip_grade() {
        return vip_grade;
    }

    public void setVip_grade(String vip_grade) {
        this.vip_grade = vip_grade;
    }

    public double getDonation_weight() {
        return donation_weight;
    }

    public void setDonation_weight(double donation_weight) {
        this.donation_weight = donation_weight;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getOver_number() {
        return over_number;
    }

    public void setOver_number(String over_number) {
        this.over_number = over_number;
    }

}

