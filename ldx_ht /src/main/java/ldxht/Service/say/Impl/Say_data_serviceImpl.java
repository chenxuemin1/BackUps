package ldxht.Service.say.Impl;

import ldxht.Dao.say.Say_data_Dao;
import ldxht.Pojo.say.Say_data_table;
import ldxht.Service.say.Say_data_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 3:55
 */
@Service
public class Say_data_serviceImpl implements Say_data_service {

    @Autowired
    private Say_data_Dao say_data_dao;

    @Override
    public List<Say_data_table> sel(Date start, Date end) {
        return say_data_dao.sel(start,end);
    }

    @Override
    public List<Say_data_table> sel_findall() {
        return say_data_dao.sel_findall();
    }
}
