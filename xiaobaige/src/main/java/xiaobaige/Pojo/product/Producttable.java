package xiaobaige.Pojo.product;

import xiaobaige.Pojo.Entity;

/**
 * 品牌表
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:00
 */
public class Producttable extends Entity{

    private int id;
    private String name;
    private String logo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
