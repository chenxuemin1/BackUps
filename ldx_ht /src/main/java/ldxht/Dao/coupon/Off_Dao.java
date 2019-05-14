package ldxht.Dao.coupon;

import ldxht.Pojo.coupon.Off_table;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 5:28
 */
public interface Off_Dao {

    //根据优惠券券号搜索
    public List<Off_table> sel_q(String coupon_card_id);
    //根据优惠券状态搜索
    public List<Off_table> sel_z(int state);
    //根据券号、状态搜索
    public List<Off_table> sel_q_z(@Param("coupon_card_id") String coupon_card_id, @Param("state") int state);
    //搜索所有
    public List<Off_table> sel_findall();
    //手动核销
    public void edit_hx(int coupon_id);
}
