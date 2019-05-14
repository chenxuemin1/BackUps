package ldxht.Pojo.say;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 2:01
 */
public class Phone_brand_table {
    //终端id
    private int brand_id;
    //顾客使用的终端品牌
    private String brand;
    //比重
    private double brand_proportion;

    public String getBrand() {
        return brand;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBrand_proportion() {
        return brand_proportion;
    }

    public void setBrand_proportion(double brand_proportion) {
        this.brand_proportion = brand_proportion;
    }
}
