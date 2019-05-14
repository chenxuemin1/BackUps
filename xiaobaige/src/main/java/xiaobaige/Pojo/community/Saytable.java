package xiaobaige.Pojo.community;

import xiaobaige.Pojo.Entity;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 10:42
 */
public class Saytable extends Entity{

    private int id;
    //发布者昵称
    private String man_nickname;
//    发布者的头像
    private String user_img;
    //说说内容
    private String say_message;
    //发布者id
    private String public_man_openid;
    //发布时间
    private String public_time;
    //说说状态；1为存在；0为删除
    private int new_state;
    //图片地址1
    private String photo_loca1;
    //图片地址2
    private String photo_loca2;
    //图片地址3
    private String photo_loca3;
    //备注
    private String remark;
    //评论次数
    private int pl_number;
    //点赞次数
    private int up_number;
    //图片上传测试
    private MultipartFile one;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMan_nickname() {
        return man_nickname;
    }

    public void setMan_nickname(String man_nickname) {
        this.man_nickname = man_nickname;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public String getSay_message() {
        return say_message;
    }

    public void setSay_message(String say_message) {
        this.say_message = say_message;
    }

    public String getPublic_man_openid() {
        return public_man_openid;
    }

    public void setPublic_man_openid(String public_man_openid) {
        this.public_man_openid = public_man_openid;
    }

    public String getPublic_time() {
        return public_time;
    }

    public void setPublic_time(String public_time) {
        this.public_time = public_time;
    }

    public int getNew_state() {
        return new_state;
    }

    public void setNew_state(int new_state) {
        this.new_state = new_state;
    }

    public String getPhoto_loca1() {
        return photo_loca1;
    }

    public void setPhoto_loca1(String photo_loca1) {
        this.photo_loca1 = photo_loca1;
    }

    public String getPhoto_loca2() {
        return photo_loca2;
    }

    public void setPhoto_loca2(String photo_loca2) {
        this.photo_loca2 = photo_loca2;
    }

    public String getPhoto_loca3() {
        return photo_loca3;
    }

    public void setPhoto_loca3(String photo_loca3) {
        this.photo_loca3 = photo_loca3;
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

    public int getUp_number() {
        return up_number;
    }

    public void setUp_number(int up_number) {
        this.up_number = up_number;
    }

    public MultipartFile getOne() {
        return one;
    }

    public void setOne(MultipartFile one) {
        this.one = one;
    }

}
