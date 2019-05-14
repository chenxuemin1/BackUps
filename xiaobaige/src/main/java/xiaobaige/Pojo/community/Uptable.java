package xiaobaige.Pojo.community;

import xiaobaige.Pojo.Entity;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 10:44
 */
public class Uptable extends Entity{

    private int id;
    //被点赞的说说的id
    private int be_up_id;
    //点赞者
    private String up_man_openid;
    //点赞时间
    private String up_time;
    //点赞的当前状态
    private int new_state;
    //备注
    private String remark;
//    是否已经点赞过
    private int number_up;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBe_up_id() {
        return be_up_id;
    }

    public void setBe_up_id(int be_up_id) {
        this.be_up_id = be_up_id;
    }

    public String getUp_man_openid() {
        return up_man_openid;
    }

    public void setUp_man_openid(String up_man_openid) {
        this.up_man_openid = up_man_openid;
    }

    public String getUp_time() {
        return up_time;
    }

    public void setUp_time(String up_time) {
        this.up_time = up_time;
    }

    public int getNew_state() {
        return new_state;
    }

    public void setNew_state(int new_state) {
        this.new_state = new_state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getNumber_up() {
        return number_up;
    }

    public void setNumber_up(int number_up) {
        this.number_up = number_up;
    }
}
