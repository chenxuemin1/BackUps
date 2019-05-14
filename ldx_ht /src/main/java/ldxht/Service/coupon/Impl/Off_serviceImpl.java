package ldxht.Service.coupon.Impl;

import ldxht.Dao.coupon.Off_Dao;
import ldxht.Pojo.coupon.Off_table;
import ldxht.Service.coupon.Off_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 5:25
 */
@Service
public class Off_serviceImpl implements Off_service {

    @Autowired
    private Off_Dao off_dao;

    @Override
    public List<Off_table> sel_q(String coupon_card_id) {
        return off_dao.sel_q(coupon_card_id);
    }

    @Override
    public List<Off_table> sel_z(int state) {
        return off_dao.sel_z(state);
    }

    @Override
    public List<Off_table> sel_q_z(String coupon_card_id, int state) {
        return off_dao.sel_q_z(coupon_card_id,state);
    }

    @Override
    public List<Off_table> sel_findall() {
        return off_dao.sel_findall();
    }

    @Override
    public void edit_hx(int coupon_id) {
        off_dao.edit_hx(coupon_id);
    }
}
