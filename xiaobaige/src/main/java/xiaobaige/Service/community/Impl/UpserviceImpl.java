package xiaobaige.Service.community.Impl;

import xiaobaige.Dao.community.UpDao;
import xiaobaige.Pojo.community.Uptable;
import xiaobaige.Service.community.Upservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.System.out;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 11:45
 */

@Service
public class UpserviceImpl implements Upservice{

    @Autowired
    private UpDao upDao;

    @Override
    public void add(Uptable up) {
        upDao.add(up);
    }

    @Override
    public void del(int be_up_id, String up_man_openid) {

    }


    @Override
    public void edit(Uptable up) {

        upDao.edit(up);
    }

    @Override
    public List<Uptable> findall() {
        return upDao.findall();
    }

    @Override
    public List<Uptable> sel(int be_up_id, String up_man_openid) {
        return upDao.sel(be_up_id,up_man_openid);
    }

    @Override
    public int sel_up_number(int be_up_id, String up_man_openid) {
        out.print("被点赞的说说id"+be_up_id+"----------"+"点赞者的openid"+up_man_openid);
        return upDao.sel_up_number(be_up_id,up_man_openid);
    }

    @Override
    public String sel_up_img(String openid) {
        return upDao.sel_up_img(openid);
    }


}
