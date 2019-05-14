package xiaobaige.Dao.query;

import xiaobaige.Pojo.query.Buytable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 下午 1:24
 */
public interface BuyDao {

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
     * 修改
     * @param buy
     */
    public void edit(Buytable buy);


    /**
     * @查询
     * @return
     */
    public List<Buytable> findall();

    /**
     * @查询指定数据
     * @param user_id
     * @return
     */
    public List<Buytable> sel(long user_id);


}
