package xiaobaige.Pojo.product;

import xiaobaige.Pojo.Entity;

/**
 * 衣服表
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 6:58
 */
public class Clothestable extends Entity{

    private int id;
    private int product_id;
    private String name;
    private int clothes_type;
    private String clothes_img;
    private int price;
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClothes_type() {
        return clothes_type;
    }

    public void setClothes_type(int clothes_type) {
        this.clothes_type = clothes_type;
    }

    public String getClothes_img() {
        return clothes_img;
    }

    public void setClothes_img(String clothes_img) {
        this.clothes_img = clothes_img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
