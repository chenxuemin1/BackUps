package xiaobaige.Service.system.Impl;

import xiaobaige.Dao.system.RolepowerDao;
import xiaobaige.Pojo.system.Rolepowertable;
import xiaobaige.Service.system.Rolepowerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 2:44
 */

@Service
public class RolepowerserviceImpl implements Rolepowerservice{

    @Autowired
    private RolepowerDao rolepowerDao;


    @Override
    public void add(int roleid, int[] powerids) {
        rolepowerDao.add(roleid,powerids);
    }

    @Override
    public void del(int powerid) {
        rolepowerDao.del(powerid);
    }

    @Override
    public void edit(int roleid) {
        rolepowerDao.edit(roleid);
    }

    @Override
    public List<Rolepowertable> findall() {
        return rolepowerDao.findall();
    }

    @Override
    public List<Rolepowertable> sel(int powerid) {
        return rolepowerDao.sel(powerid);
    }
}
