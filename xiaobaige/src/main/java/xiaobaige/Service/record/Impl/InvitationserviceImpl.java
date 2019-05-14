package xiaobaige.Service.record.Impl;

import xiaobaige.Dao.record.InvitationDao;
import xiaobaige.Pojo.record.Invitationtable;
import xiaobaige.Service.record.Invitationservice;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/4 0004 下午 8:24
 */
public class InvitationserviceImpl implements Invitationservice{

    @Autowired
    private InvitationDao invitationDao;

    @Override
    public void add(Invitationtable invitation) {
        invitationDao.add(invitation);
    }

    @Override
    public void del(int id) {
        invitationDao.del(id);
    }
}
