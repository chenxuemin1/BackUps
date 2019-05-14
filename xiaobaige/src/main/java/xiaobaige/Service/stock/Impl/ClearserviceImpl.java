package xiaobaige.Service.stock.Impl;

import xiaobaige.Dao.stock.ClearDao;
import xiaobaige.Pojo.stock.Cleartable;
import xiaobaige.Service.stock.Clearservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 上午 11:42
 */

@Service
public class ClearserviceImpl implements Clearservice {

    @Autowired
    private ClearDao clearDao ;


    @Override
    public void add(Cleartable clear) {
        clearDao.add(clear);
    }

    @Override
    public void del(String buyer) {
        clearDao.del(buyer);
    }

    @Override
    public void edit(Cleartable clear) {
        clearDao.edit(clear);
    }

    @Override
    public List<Cleartable> findall() {

        return clearDao.findall();
    }

    @Override
    public List<Cleartable> sel(String buyer) {
        return clearDao.sel(buyer);
    }

}
