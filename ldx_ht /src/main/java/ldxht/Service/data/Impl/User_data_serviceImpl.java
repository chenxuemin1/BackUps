package ldxht.Service.data.Impl;

import ldxht.Dao.data.User_data_Dao;
import ldxht.Pojo.data.User_data_table;
import ldxht.Pojo.data.User_info_table;
import ldxht.Service.data.User_data_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:18
 */
@Service
public class User_data_serviceImpl implements User_data_service {

    @Autowired
    private User_data_Dao user_data_dao;

    @Override
    public List<User_data_table> sel_findall() {
        return user_data_dao.sel_findall();
    }

    @Override
    public List<User_data_table> sel(Date start, Date end) {
        return user_data_dao.sel(start,end);
    }

    @Override
    public List<User_data_table> sel_otday() {
        return user_data_dao.sel_otday();
    }

    @Override
    public List<User_data_table> sel_yester() {
        return user_data_dao.sel_yester();
    }

    @Override
    public List<User_data_table> sel_7day() {
        return user_data_dao.sel_7day();
    }

    @Override
    public List<User_data_table> sel_30day() {
        return user_data_dao.sel_30day();
    }

    @Override
    public List<User_data_table> sel_years() {
        return user_data_dao.sel_years();
    }
}
