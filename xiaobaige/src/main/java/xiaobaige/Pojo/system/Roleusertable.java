package xiaobaige.Pojo.system;

import xiaobaige.Pojo.Entity;

/**
 * @角色表
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 1:35
 */
public class Roleusertable extends Entity{

    private int role_id;

    private long user_id;

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
