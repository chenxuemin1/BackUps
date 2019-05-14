package xiaobaige.Service.query.Impl;

import xiaobaige.Dao.query.BuyDao;
import xiaobaige.Pojo.query.Buytable;
import xiaobaige.Service.query.Buyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 上午 11:24
 */

@Service
public class BuyserviceImpl implements Buyservice {

    @Autowired
    private BuyDao buyDao;

    @Override
    public void add(Buytable buy) {
        buyDao.add(buy);
    }

    @Override
    public void del(long express_number) {
        buyDao.del(express_number);
    }

    @Override
    public void edit(Buytable buy) {
        buyDao.edit(buy);
    }

    @Override
    public List<Buytable> findall() {

        return buyDao.findall();
    }

    @Override
    public List<Buytable> sel(long express_number) {
        return buyDao.sel(express_number);
    }


}
