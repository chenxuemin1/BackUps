package ldxht.Service.order.Impl;

import ldxht.Dao.order.Order_Dao;
import ldxht.Pojo.order.Order_table;
import ldxht.Service.order.Order_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 3:23
 */
@Service
public class Order_ServiceImpl implements Order_service {

    @Autowired
    private Order_Dao orderDao;

    @Override
    public void add() {
        orderDao.add();
    }

    @Override
    public List<Order_table> sel_y_s(String name, long phone_number) {
        return orderDao.sel_y_s(name,phone_number);
    }

    @Override
    public List<Order_table> sel_y(String name) {
        return orderDao.sel_y(name);
    }

    @Override
    public List<Order_table> sel_s(long phone_number) {
        return orderDao.sel_s(phone_number);
    }

    @Override
    public List<Order_table> sel_findall() {
        return orderDao.sel_findall();
    }

    @Override
    public List<Order_table> sel_d(int order_id) {
        return orderDao.sel_d(order_id);
    }

    @Override
    public void edit_remark(int order_id) {
        orderDao.edit_remark(order_id);
    }
}
