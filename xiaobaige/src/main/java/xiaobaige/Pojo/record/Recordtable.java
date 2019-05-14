package xiaobaige.Pojo.record;

import xiaobaige.Pojo.Entity;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/26 0026 上午 9:55
 */
public class Recordtable extends Entity{

    private int id;

    private String title;

    private String first_grade;

    private String now_grade;

    private String time;

    private String openid;

    private int state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_grade() {
        return first_grade;
    }

    public void setFirst_grade(String first_grade) {
        this.first_grade = first_grade;
    }

    public String getNow_grade() {
        return now_grade;
    }

    public void setNow_grade(String now_grade) {
        this.now_grade = now_grade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
