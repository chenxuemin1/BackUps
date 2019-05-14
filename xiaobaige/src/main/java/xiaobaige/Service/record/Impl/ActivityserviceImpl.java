package xiaobaige.Service.record.Impl;

import xiaobaige.Dao.record.ActivityDao;
import xiaobaige.Pojo.record.Activitytable;
import xiaobaige.Service.record.Activityservice;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/4 0004 下午 8:23
 */
public class ActivityserviceImpl implements Activityservice{

    @Autowired
    private ActivityDao activityDao;

    @Override
    public void add(Activitytable activity) {
        activityDao.add(activity);
    }

    @Override
    public void del(int id) {
        activityDao.del(id);
    }
}
