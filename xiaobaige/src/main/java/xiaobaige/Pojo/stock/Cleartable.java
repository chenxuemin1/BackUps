package xiaobaige.Pojo.stock;

import xiaobaige.Pojo.Entity;

/**
 * 清单表
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 4:38
 */
public class Cleartable extends Entity{
    private int id;
    private int clothes_type;
    private double weight;
    private String buyer;
    private long buyer_phone;
    private String buy_time;
    private double buy_price;
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClothes_type() {
        return clothes_type;
    }

    public void setClothes_type(int clothes_type) {
        this.clothes_type = clothes_type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public long getBuyer_phone() {
        return buyer_phone;
    }

    public void setBuyer_phone(long buyer_phone) {
        this.buyer_phone = buyer_phone;
    }

    public String getBuy_time() {
        return buy_time;
    }

    public void setBuy_time(String buy_time) {
        this.buy_time = buy_time;
    }

    public double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
