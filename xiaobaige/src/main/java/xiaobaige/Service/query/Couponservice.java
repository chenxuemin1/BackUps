package xiaobaige.Service.query;

import xiaobaige.Pojo.query.Couponstate;
import xiaobaige.Pojo.query.Coupontable;

import java.util.List;

/**优惠券表
 * @author xm@c.com    Administrator
 * @date 2018/4/11 0011 下午 5:35
 */
public interface Couponservice {

    /**
     * @新增
     * @param coupon
     */
    public void add(Coupontable coupon);

    /**
     * @删除
     * @param express_number
     */
    public void del(long express_number);

    /**
     * @修改
     * @param coupon
     */
    public void edit(Coupontable coupon);

    /**
     * @查询所有
     * @return
     */
    public List<Coupontable> findall();

    /**
     * @查询指定数据
     * @param express_number
     * @return
     */
    public List<Coupontable> sel(long express_number);

    /**
     * @优惠券状态类别查询
     * @param
     */
    public List<Couponstate> type(int couponcode);

    /**
     * @根据user_id查询未使用的优惠券
     * @param openid
     * @return
     */
    public List<Coupontable> sel_coupon_0(String openid);

    /**
     * @根据user_id查询已使用和已过期的优惠券
     * @param openid
     * @return
     */
    public List<Coupontable> sel_coupon_1(String openid);

}
