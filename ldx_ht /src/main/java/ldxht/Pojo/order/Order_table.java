package ldxht.Pojo.order;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 2:03
 */
public class Order_table {
    //订单id
    private int order_id;
    //姓名
    private String name;
    //昵称
    private String nickname;
    //手机号
    private long phone_number;
    //订单编号
    private int order_number;
    //下单时间
    private String time;
    //反赠状态
    private int state;
    //快递单号
    private long express_number;
    //确认重量
    private double comfirm_weight;
    //快递图片url
    private String express_img;
    //客户备注
    private String remark;
    //后天备注
    private String remark_server;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public long getExpress_number() {
        return express_number;
    }

    public void setExpress_number(long express_number) {
        this.express_number = express_number;
    }

    public double getComfirm_weight() {
        return comfirm_weight;
    }

    public void setComfirm_weight(double comfirm_weight) {
        this.comfirm_weight = comfirm_weight;
    }

    public String getExpress_img() {
        return express_img;
    }

    public void setExpress_img(String express_img) {
        this.express_img = express_img;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark_server() {
        return remark_server;
    }

    public void setRemark_server(String remark_server) {
        this.remark_server = remark_server;
    }
}
