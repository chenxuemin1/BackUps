package xiaobaige.Service.query.Impl;

import xiaobaige.Dao.query.CouponDao;
import xiaobaige.Pojo.query.Couponstate;
import xiaobaige.Pojo.query.Coupontable;
import xiaobaige.Service.query.Couponservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 上午 11:30
 */

@Service
public class CouponserviceImpl implements Couponservice {

    @Autowired
    private CouponDao couponDao ;


    @Override
    public void add(Coupontable coupon) {
        couponDao.add(coupon);
    }

    @Override
    public void del(long express_number) {
        couponDao.del(express_number);
    }

    @Override
    public void edit(Coupontable coupon) {
        couponDao.edit(coupon);
    }

    @Override
    public List<Coupontable> findall() {

        return couponDao.findall();
    }

    @Override
    public List<Coupontable> sel(long express_number) {
        return couponDao.sel(express_number);
    }

    @Override
    public List<Couponstate> type(int couponcode) {
        return couponDao.type(couponcode);
    }

    @Override
    public List<Coupontable> sel_coupon_0(String openid) {
        return couponDao.sel_coupon_0(openid);
    }

    @Override
    public List<Coupontable> sel_coupon_1(String openid) {
        return couponDao.sel_coupon_1(openid);
    }
}
