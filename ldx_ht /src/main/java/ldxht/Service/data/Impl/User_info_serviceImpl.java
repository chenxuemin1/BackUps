package ldxht.Service.data.Impl;

import ldxht.Dao.data.User_info_Dao;
import ldxht.Pojo.data.User_info_table;
import ldxht.Service.data.User_info_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:09
 */
@Service
public class User_info_serviceImpl implements User_info_service {

    @Autowired
    private User_info_Dao user_info_dao;

    @Override
    public List<User_info_table> sel_findall() {
        return user_info_dao.sel_findall();
    }

    @Override
    public List<User_info_table> sel_y(String name) {
        return user_info_dao.sel_y(name);
    }

    @Override
    public List<User_info_table> sel_s(long phone_number) {
        return user_info_dao.sel_s(phone_number);
    }

    @Override
    public List<User_info_table> sel_y_s(String name, long phone_number) {
        return user_info_dao.sel_y_s(name,phone_number);
    }

    @Override
    public List<User_info_table> sel_otday() {
        return user_info_dao.sel_otday();
    }

    @Override
    public List<User_info_table> sel_yester() {
        return user_info_dao.sel_yester();
    }

    @Override
    public List<User_info_table> sel_7day() {
        return user_info_dao.sel_7day();
    }

    @Override
    public List<User_info_table> sel_30day() {
        return user_info_dao.sel_30day();
    }

    @Override
    public List<User_info_table> sel_years() {
        return user_info_dao.sel_years();
    }
}
