package xiaobaige.Service.subsidy.Impl;

import xiaobaige.Dao.subsidy.SubsidyDao;
import xiaobaige.Pojo.subsidy.Subsidystate;
import xiaobaige.Pojo.subsidy.Subsidytable;
import xiaobaige.Service.subsidy.Subsidyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 上午 11:48
 */

@Service
public class SubsidyserviceImpl implements Subsidyservice {

    @Autowired
    private SubsidyDao subsidyDao ;

    @Override
    public void add(String express_number) {
        subsidyDao.add(express_number);
    }

    @Override
    public void del(long express_number) {
        subsidyDao.del(express_number);
    }

    @Override
    public void edit(Subsidytable subsidy) {
        subsidyDao.edit(subsidy);
    }

    @Override
    public List<Subsidytable> findall() {

        return subsidyDao.findall();
    }

    @Override
    public List<Subsidytable> sel(long express_number) {
        return subsidyDao.sel(express_number);
    }

    @Override
    public List<Subsidystate> type(int subsidycode) {
        return subsidyDao.type(subsidycode);
    }
}
