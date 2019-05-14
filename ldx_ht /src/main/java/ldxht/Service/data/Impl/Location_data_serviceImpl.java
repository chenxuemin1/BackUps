package ldxht.Service.data.Impl;

import ldxht.Dao.data.Location_data_Dao;
import ldxht.Pojo.data.Location_data_table;
import ldxht.Service.data.Location_data_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:25
 */
@Service
public class Location_data_serviceImpl implements Location_data_service {

    @Autowired
    private Location_data_Dao location_data_dao;

    @Override
    public List<Location_data_table> sel_findall() {
        return location_data_dao.sel_findall();
    }

    @Override
    public List<Location_data_table> sel(Date start, Date end) {
        return location_data_dao.sel(start,end);
    }

    @Override
    public List<Location_data_table> sel_otday() {
        return location_data_dao.sel_otday();
    }

    @Override
    public List<Location_data_table> sel_yester() {
        return location_data_dao.sel_yester();
    }

    @Override
    public List<Location_data_table> sel_7day() {
        return location_data_dao.sel_7day();
    }

    @Override
    public List<Location_data_table> sel_30day() {
        return location_data_dao.sel_30day();
    }

    @Override
    public List<Location_data_table> sel_years() {
        return location_data_dao.sel_years();
    }
}
