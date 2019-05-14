package xiaobaige.Service.product.Impl;

import xiaobaige.Dao.product.BackclothesDao;
import xiaobaige.Pojo.product.Backclothestable;
import xiaobaige.Service.product.Backclothseservice;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static java.lang.System.out;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/16 0016 下午 6:36
 */

@Service
public class BackclothesserviceImpl implements Backclothseservice {

    protected Log log = LogFactory.getLog(BackclothesserviceImpl.class);
    @Autowired
    private BackclothesDao backclothesDao;


    @Override
    public void add(Backclothestable backclothes) {
        backclothesDao.add(backclothes);
    }

    @Override
    public void del(int id) {
        backclothesDao.del(id);
    }

    @Override
    public void edit(Backclothestable backclothes) {
        backclothesDao.edit(backclothes);
    }

    @Override
    public void edit2(Backclothestable backclothes) {
        backclothesDao.edit2(backclothes);
    }

    @Override
    public List<Backclothestable> findall() {
        return backclothesDao.findall();
    }

    @Override
    public List<Backclothestable> sel(int id) {
        return backclothesDao.sel(id);
    }

    @Override
    public List<Backclothestable> sel2(String openid) {
        return backclothesDao.sel2(openid);
    }

    @Override
    public String express_type(String express_number) {
//        out.println(express_number+"============="+backclothesDao.express_type(express_number));
        backclothesDao.express_type(express_number);
        return backclothesDao.express_type(express_number);
    }
}
