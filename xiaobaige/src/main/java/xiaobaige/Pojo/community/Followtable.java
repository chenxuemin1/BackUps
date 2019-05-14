package xiaobaige.Pojo.community;

import xiaobaige.Pojo.Entity;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 10:45
 */
public class Followtable extends Entity{

    private int id;
    //关注者
    private String follow_user_openid;
    //被关注者
        private String be_follow_user_openid;
    //关注时间
    private String follow_time;
    //关注状态
    private int new_state;
    //备注
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFollow_user_openid() {
        return follow_user_openid;
    }

    public void setFollow_user_openid(String follow_user_openid) {
        this.follow_user_openid = follow_user_openid;
    }

    public String getBe_follow_user_openid() {
        return be_follow_user_openid;
    }

    public void setBe_follow_user_openid(String be_follow_user_openid) {
        this.be_follow_user_openid = be_follow_user_openid;
    }

    public String getFollow_time() {
        return follow_time;
    }

    public void setFollow_time(String follow_time) {
        this.follow_time = follow_time;
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
}
