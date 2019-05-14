package xiaobaige.Pojo.query;

import xiaobaige.Pojo.Entity;

import java.util.Date;

/**
 * 订单表
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 4:29
 */
public class Buytable extends Entity{

    private int id;
    private int openid;
    private Date buy_time;
    private long express_number;
    private String logistics;
    private double weight_confirm;
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOpenid() {
        return openid;
    }

    public void setOpenid(int openid) {
        this.openid = openid;
    }

    public Date getBuy_time() {
        return buy_time;
    }

    public void setBuy_time(Date buy_time) {
        this.buy_time = buy_time;
    }

    public long getExpress_number() {
        return express_number;
    }

    public void setExpress_number(long express_number) {
        this.express_number = express_number;
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    public double getWeight_confirm() {
        return weight_confirm;
    }

    public void setWeight_confirm(double weight_confirm) {
        this.weight_confirm = weight_confirm;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
