package ldxht.Dao.coupon;

import ldxht.Pojo.coupon.Give_table;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 5:28
 */
public interface Give_Dao {

    //根据昵称搜索
    public List<Give_table> sel_n(String name);
    //根据订单编号搜索
    public List<Give_table> sel_d(int order_id);
    //根据昵称、订单搜索
    public List<Give_table> sel_n_d(@Param("user_nickname") String name, @Param("order_id") int order_id);
    //搜索所有
    public List<Give_table> sel_findall();

}
