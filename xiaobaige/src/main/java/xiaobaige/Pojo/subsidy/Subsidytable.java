package xiaobaige.Pojo.subsidy;

import xiaobaige.Pojo.Entity;

/**补贴表
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 4:41
 */
public class Subsidytable extends Entity{

    private int id;
    private long express_number;
    private String user_name;
    private double weight_confirm;
    private double back_money;
    private int now_state;
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getExpress_number() {
        return express_number;
    }

    public void setExpress_number(long express_number) {
        this.express_number = express_number;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public double getWeight_confirm() {
        return weight_confirm;
    }

    public void setWeight_confirm(double weight_confirm) {
        this.weight_confirm = weight_confirm;
    }

    public double getBack_money() {
        return back_money;
    }

    public void setBack_money(double back_money) {
        this.back_money = back_money;
    }

    public int getNow_state() {
        return now_state;
    }

    public void setNow_state(int now_state) {
        this.now_state = now_state;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
