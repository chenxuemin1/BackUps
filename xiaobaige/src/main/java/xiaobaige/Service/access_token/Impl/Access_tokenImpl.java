package xiaobaige.Service.access_token.Impl;


import xiaobaige.Dao.access_token.Access_tokenDao;
import xiaobaige.Service.access_token.Access_tokenservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/11 0011 下午 4:19
 */

@Service
public class Access_tokenImpl implements Access_tokenservice {

    @Autowired
    private Access_tokenDao access_tokenDao;

    @Override
    public void add(String access_token) {
        access_tokenDao.add(access_token);
    }

    @Override
    public void edit(String access_token) {
        access_tokenDao.edit(access_token);
    }

    @Override
    public String sel() {
        return access_tokenDao.sel();
    }
}
