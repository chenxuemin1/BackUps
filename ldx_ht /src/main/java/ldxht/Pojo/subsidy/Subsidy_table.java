package ldxht.Pojo.subsidy;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 12:59
 */
public class Subsidy_table {
    //订单id
    private int id;
    //快递单号
    private String express_number;
    //姓名
    private String name;
    //下单时间
    private String time;
    //输入重量
    private double weight;
    //确认重量
    private double confim_weight;
    //反赠金额
    private double back_money;
    //反赠状态
    private int state;
    //备注
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpress_number() {
        return express_number;
    }

    public void setExpress_number(String express_number) {
        this.express_number = express_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getConfim_weight() {
        return confim_weight;
    }

    public void setConfim_weight(double confim_weight) {
        this.confim_weight = confim_weight;
    }

    public double getBack_money() {
        return back_money;
    }

    public void setBack_money(double back_money) {
        this.back_money = back_money;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
