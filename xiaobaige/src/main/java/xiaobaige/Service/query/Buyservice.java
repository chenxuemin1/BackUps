package xiaobaige.Service.query;

import xiaobaige.Pojo.query.Buytable;

import java.util.List;

/**订单表
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 5:28
 */

public interface Buyservice {
    /**
     * @新增
     * @param buy
     */
    public void add(Buytable buy);

    /**
     * @删除
     * @param express_number
     */
    public void del(long express_number);

    /**
     * @修改
     * @param buy
     */
    public void edit(Buytable buy);

    /**
     *@查询所有
     * @return
     */
    public List<Buytable> findall();

    /**
     * @查询指定数据
     * @param express_number
     * @return
     */
    public List<Buytable> sel(long express_number);
}
