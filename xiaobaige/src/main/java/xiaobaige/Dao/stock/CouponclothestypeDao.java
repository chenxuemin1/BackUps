package xiaobaige.Dao.stock;

import xiaobaige.Pojo.stock.Couponclothestype;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 下午 1:27
 */
public interface CouponclothestypeDao {

    /**
     * @新增
     * @param couponclothestype
     */
    public void add(Couponclothestype couponclothestype);

    /**
     * @删除
     * @param id
     */
    public void del(int id);

    /**
     * @修改
     * @param couponclothestype
     */
    public void edit(Couponclothestype couponclothestype);

    /**
     * @查询
     * @return
     */
    public List<Couponclothestype> findall();

    /**
     * @查询指定数据
     * @param id
     * @return
     */
    public List<Couponclothestype> sel(int id);

}
