package ldxht.Service.say.Impl;

import ldxht.Dao.say.Phone_brand_Dao;
import ldxht.Pojo.say.Phone_brand_table;
import ldxht.Service.say.Phone_brand_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:01
 */
@Service
public class Phone_brand_serviceImpl implements Phone_brand_service {

    @Autowired
    private Phone_brand_Dao phone_brand_dao;

    @Override
    public List<Phone_brand_table> sel(Date start, Date end) {
        return phone_brand_dao.sel(start,end);
    }

    @Override
    public List<Phone_brand_table> sel_findall() {
        return phone_brand_dao.sel_findall();
    }
}
