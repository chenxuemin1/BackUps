package ldxht.Pojo.repertory;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 2:49
 */
public class Report_table {
    //id
    private int id;
    //衣服种类
    private String clothes_type;
    //买家姓名
    private String name;
    //电话号码
    private long phone_number;
    //购买时间
    private String buy_time;
    //备注
    private String remark;
    //重量
    private double weight;
    //价格
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClothes_type() {
        return clothes_type;
    }

    public void setClothes_type(String clothes_type) {
        this.clothes_type = clothes_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getBuy_time() {
        return buy_time;
    }

    public void setBuy_time(String buy_time) {
        this.buy_time = buy_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
