package xiaobaige.Dao.product;

import xiaobaige.Pojo.product.Backclothestable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/16 0016 下午 6:39
 */
public interface BackclothesDao {

    /**
     * @新增
     * @param backclothes
     */
    public void add(Backclothestable backclothes);

    /**
     * @删除
     * @param id
     */
    public void del(int id);

    /**
     * @修改
     * @param backclothes
     */
    public void edit(Backclothestable backclothes);

    /**
     * @信息补充
     * @param backclothes
     */
    public void edit2(Backclothestable backclothes);

    /**
     *@查询所有
     * @return
     */
    public List<Backclothestable> findall();

    /**
     * @查询指定数据
     * @param id
     * @return
     */
    public List<Backclothestable> sel(int id);

    /**
     * @根据捐家的姓名查询
     * @param openid
     * @return
     */
    public List<Backclothestable> sel2(String openid);

    /**
     * @查询快递类型
     * @param express_number
     * @return
     */
    public String express_type(String express_number);
}
