package xiaobaige.Service.tell.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiaobaige.Dao.tell.TellDao;
import xiaobaige.Service.tell.Tellservice;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/5 0005 下午 12:37
 */

@Service
public class TellserviceImpl implements Tellservice {

    @Autowired
    private TellDao tellDao;

    @Override
    public String sel_tell() {
        return tellDao.sel_tell();
    }
}
