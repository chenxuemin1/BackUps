package xiaobaige.Service.system.Impl;

import xiaobaige.Dao.system.RoleuserDao;
import xiaobaige.Pojo.system.Roleusertable;
import xiaobaige.Service.system.Roleuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 2:35
 */

@Service
public class RoleuserserviceImpl implements Roleuserservice {

    @Autowired
    private RoleuserDao roleuserDao;


    @Override
    public void add(int roleid, int[] userids) {
        roleuserDao.add(roleid,userids);
    }

    @Override
    public void del(int userid) {
        roleuserDao.del(userid);
    }

    @Override
    public void edit(int userid) {
        roleuserDao.edit(userid);
    }

    @Override
    public List<Roleusertable> findall() {
        return roleuserDao.findall();
    }

    @Override
    public List<Roleusertable> sel(int userid) {
        return roleuserDao.sel(userid);
    }
}
