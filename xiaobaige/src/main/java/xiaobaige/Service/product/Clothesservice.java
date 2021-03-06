package xiaobaige.Service.product;

import xiaobaige.Pojo.product.Clothestable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 衣服表
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:08
 */
public interface Clothesservice {

    /**
     * @新增
     * @param clothes
     */
    public void add(Clothestable clothes, MultipartFile logoFile);

    /**
     * @删除
     * @param id
     */
    public void del(int id);

    /**
     * @修改
     * @param clothes
     */
    public void edit(Clothestable clothes, MultipartFile logoFile);

    /**
     *@查询所有
     * @return
     */
    public List<Clothestable> findall();

    /**
     * @查询指定数据
     * @param id
     * @return
     */
    public List<Clothestable> sel(int id);
}
