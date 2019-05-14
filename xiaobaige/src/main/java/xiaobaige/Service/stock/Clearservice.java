package xiaobaige.Service.stock;

import xiaobaige.Pojo.query.Buytable;
import xiaobaige.Pojo.stock.Cleartable;

import java.util.List;

/**
 * 清单表
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 上午 9:36
 */
public interface Clearservice {

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
