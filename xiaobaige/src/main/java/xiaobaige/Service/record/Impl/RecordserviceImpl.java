package xiaobaige.Service.record.Impl;

import xiaobaige.Dao.record.RecordDao;
import xiaobaige.Pojo.record.Activitytable;
import xiaobaige.Pojo.record.Invitationtable;
import xiaobaige.Pojo.record.Recordtable;
import xiaobaige.Service.record.Recordservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/26 0026 上午 10:28
 */

@Service
public class RecordserviceImpl implements Recordservice {

    @Autowired
    private RecordDao recordDao;

    @Override
    public void add(Recordtable record) {
        recordDao.add(record);

    }

    @Override
    public void del(int id) {
        recordDao.del(id);

    }

    @Override
    public void edit(Recordtable record) {
        recordDao.edit(record);

    }

    @Override
    public List<Recordtable> findall() {
        return recordDao.findall();
    }

    @Override
    public List<Recordtable> sel(String openid) {
        return recordDao.sel(openid);
    }

    @Override
    public List<Recordtable> news(String openid) {
        return recordDao.news(openid);
    }

    @Override
    public List<Invitationtable> news1(String openid) {
        return recordDao.news1(openid);
    }

    @Override
    public List<Activitytable> news2(String openid) {
        return recordDao.news2(openid);
    }

    @Override
    public int news_number(String openid) {
        return recordDao.news_number(openid);
    }
}
