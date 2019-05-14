package xiaobaige.Service.system.Impl;

import xiaobaige.Dao.system.PowerplayDao;
import xiaobaige.Pojo.system.Powerplaytable;
import xiaobaige.Service.system.Powerplayservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 2:44
 */

@Service
public class PowerplayserviceImpl implements Powerplayservice{

    @Autowired
    private PowerplayDao powerplayDao;

    @Override
    public void add(int powerid, int[] playids) {
        powerplayDao.add(powerid,playids);
    }

    @Override
    public void del(int playid) {
        powerplayDao.del(playid);
    }

    @Override
    public void edit(int playid) {
        powerplayDao.edit(playid);
    }

    @Override
    public List<Powerplaytable> findall() {
        return powerplayDao.findall();
    }

    @Override
    public List<Powerplaytable> sel(int powerid) {
        return powerplayDao.sel(powerid);
    }
}
