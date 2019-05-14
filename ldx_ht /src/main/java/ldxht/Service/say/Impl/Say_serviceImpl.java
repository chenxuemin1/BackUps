package ldxht.Service.say.Impl;

import ldxht.Dao.say.Say_Dao;
import ldxht.Pojo.say.Say_table;
import ldxht.Service.say.Say_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 3:43
 */
@Service
public class Say_serviceImpl implements Say_service {

    @Autowired
    private Say_Dao sayDao;

    @Override
    public void del(int id) {
        sayDao.del(id);
    }

    @Override
    public void del_lh(int id) {
        sayDao.del_lh(id);
    }

    @Override
    public void edit_hf(int id) {
        sayDao.edit_hf(id);
    }

    @Override
    public List<Say_table> sel_n_m(String nickname, String message) {
        return sayDao.sel_n_m(nickname,message);
    }

    @Override
    public List<Say_table> sel_n(String nickname) {
        return sayDao.sel_n(nickname);
    }

    @Override
    public List<Say_table> sel_m(String message) {
        return sayDao.sel_m(message);
    }

    @Override
    public List<Say_table> sel_findall() {
        return sayDao.sel_findall();
    }
}
