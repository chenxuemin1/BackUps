package ldxht.Service.coupon;

import ldxht.Pojo.coupon.Give_table;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 5:06
 */
public interface Give_service {

    //根据昵称搜索
    public List<Give_table> sel_n(String name);
    //根据订单编号搜索
    public List<Give_table> sel_d(int order_number);
    //根据昵称、订单搜索
    public List<Give_table> sel_n_d(String name, int order_number);
    //搜索所有
    public List<Give_table> sel_findall();
}
