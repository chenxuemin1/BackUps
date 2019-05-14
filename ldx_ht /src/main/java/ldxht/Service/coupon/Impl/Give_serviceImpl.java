package ldxht.Service.coupon.Impl;

import ldxht.Dao.coupon.Give_Dao;
import ldxht.Pojo.coupon.Give_table;
import ldxht.Service.coupon.Give_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 5:17
 */
@Service
public class Give_serviceImpl implements Give_service{

    @Autowired
    private Give_Dao give_dao;

    @Override
    public List<Give_table> sel_n(String name) {
        return give_dao.sel_n(name);
    }

    @Override
    public List<Give_table> sel_d(int order_number) {
        return give_dao.sel_d(order_number);
    }

    @Override
    public List<Give_table> sel_n_d(String name, int order_number) {
        return give_dao.sel_n_d(name,order_number);
    }

    @Override
    public List<Give_table> sel_findall() {
        return give_dao.sel_findall();
    }
}
