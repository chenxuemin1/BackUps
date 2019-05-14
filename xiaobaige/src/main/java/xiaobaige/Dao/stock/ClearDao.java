package xiaobaige.Dao.stock;

import xiaobaige.Pojo.stock.Cleartable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 下午 1:27
 */
public interface ClearDao {

    /**
     * @新增
     * @param clear
     */
    public void add(Cleartable clear);

    /**
     * @删除
     * @param buyer
     */
    public void del(String buyer);

    /**
     * @修改
     * @param
     */
    public void edit(Cleartable clear);

    /**
     * @查询
     * @return
     */
    public List<Cleartable> findall();

    /**
     * @查询指定数据
     * @param buyer
     * @return
     */
    public List<Cleartable> sel(String buyer);
}
