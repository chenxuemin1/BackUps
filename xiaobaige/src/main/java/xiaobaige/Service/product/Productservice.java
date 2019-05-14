package xiaobaige.Service.product;

import xiaobaige.Pojo.product.Producttable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 品牌表
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:08
 */

public interface Productservice {

    /**
     * @新增
     * @param product
     */
    public void add(Producttable product, MultipartFile logoFile);

    /**
     * @删除
     * @param id
     */
    public void del(int id);

    /**
     * @修改
     * @param product
     */
    public void edit(Producttable product, MultipartFile logoFile);

    /**
     *@查询所有
     * @return
     */
    public List<Producttable> findall();

    /**
     * @查询指定数据
     * @param id
     * @return
     */
    public List<Producttable> sel(int id);
}
