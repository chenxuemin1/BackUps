package xiaobaige.Service.stock.Impl;

import xiaobaige.Dao.stock.CouponclothestypeDao;
import xiaobaige.Pojo.stock.Couponclothestype;
import xiaobaige.Service.stock.Couponclothestypeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 上午 11:44
 */

@Service
public class CouponclothestypeserviceImpl implements Couponclothestypeservice {

    @Autowired
    private CouponclothestypeDao couponclothestypeDao;


    @Override
    public void add(Couponclothestype couponclothestype) {
        couponclothestypeDao.add(couponclothestype);
    }

    @Override
    public void del(int id) {
        couponclothestypeDao.del(id);
    }

    @Override
    public void edit(Couponclothestype couponclothestype) {
        couponclothestypeDao.edit(couponclothestype);
    }

    @Override
    public List<Couponclothestype> findall() {

        return couponclothestypeDao.findall();
    }

    /**
     * @查询指定数据
     * @param id
     * @return
     */
    public List<Couponclothestype> sel(int id){
        return couponclothestypeDao.sel(id);
    };
}
