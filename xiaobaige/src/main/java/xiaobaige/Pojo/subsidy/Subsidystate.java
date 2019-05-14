package xiaobaige.Pojo.subsidy;

import xiaobaige.Pojo.Entity;

/**补贴状态类别
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 4:40
 */
public class Subsidystate extends Entity{

    private int id;
    private String subsudy_state;
    private int subsidy_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubsudy_state() {
        return subsudy_state;
    }

    public void setSubsudy_state(String subsudy_state) {
        this.subsudy_state = subsudy_state;
    }

    public int getSubsidy_code() {
        return subsidy_code;
    }

    public void setSubsidy_code(int subsidy_code) {
        this.subsidy_code = subsidy_code;
    }
}
