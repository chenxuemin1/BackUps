package ldxht.Service.order;

import ldxht.Pojo.order.Order_table;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 3:11
 */
public interface Order_service {

    //添加？
    public void add();
    //根据用户名、手机号码搜索
    public List<Order_table> sel_y_s(String name, long phone_number);
    //根据用户名搜索
    public List<Order_table> sel_y(String name);
    //根据手机号码搜索
    public  List<Order_table> sel_s(long phone_number);
    //搜索所有
    public List<Order_table> sel_findall();
    //搜索指定订单
    public List<Order_table> sel_d(int order_id);
    //添加备注
    public void edit_remark(int order_id);

}
