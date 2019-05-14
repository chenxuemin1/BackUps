package xiaobaige.Pojo.community;

import xiaobaige.Pojo.Entity;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 10:44
 */
public class Commenttable extends Entity{

    private int id;
    //评论内容
    private String comment_message;
    //评论者openid
    private String comment_man_openid;
    //评论者昵称
    private String comment_nickname;
//    评论者的头像
    private String user_img;
    //评论时间
    private String comment_time;
    //被评论的说说的id
    private int be_comment_id;
    //该条评论的当前状态
    private int new_state;
    //备注
    private String remark;
    //当天被评论的数量
    private int pl_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment_message() {
        return comment_message;
    }

    public void setComment_message(String comment_message) {
        this.comment_message = comment_message;
    }

    public String getComment_man_openid() {
        return comment_man_openid;
    }

    public void setComment_man_openid(String comment_man_openid) {
        this.comment_man_openid = comment_man_openid;
    }

    public String getComment_nickname() {
        return comment_nickname;
    }

    public void setComment_nickname(String comment_nickname) {
        this.comment_nickname = comment_nickname;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public int getBe_comment_id() {
        return be_comment_id;
    }

    public void setBe_comment_id(int be_comment_id) {
        this.be_comment_id = be_comment_id;
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

    public int getPl_number() {
        return pl_number;
    }

    public void setPl_number(int pl_number) {
        this.pl_number = pl_number;
    }
}
