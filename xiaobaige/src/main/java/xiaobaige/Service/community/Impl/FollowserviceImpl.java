package xiaobaige.Service.community.Impl;


import xiaobaige.Dao.community.FollowDao;
import xiaobaige.Pojo.community.Followtable;
import xiaobaige.Service.community.Followservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 11:45
 */

@Service
public class FollowserviceImpl implements Followservice{

    @Autowired
    private FollowDao followDao;


    @Override
    public void add(Followtable follow) {
        followDao.add(follow);
    }

    @Override
    public void del(String be_follow_user_openid, String follow_user_openid) {
        followDao.del(be_follow_user_openid,follow_user_openid);
    }

    @Override
    public void edit(Followtable follow) {
        followDao.edit(follow);
    }

    @Override
    public List<Followtable> findall() {
        return followDao.findall();
    }

    @Override
    public int sel_gz_num(String be_follow_user_openid, String follow_user_openid) {
        return followDao.sel_gz_num(be_follow_user_openid,follow_user_openid);
    }

    @Override
    public List<Followtable> sel(String be_follow_user_openid) {
        return followDao.sel(be_follow_user_openid);
    }
}
