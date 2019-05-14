package ldxht.Service.data.Impl;

import ldxht.Dao.data.Logistics_data_Dao;
import ldxht.Pojo.data.Logistics_data_table;
import ldxht.Service.data.Logistics_data_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:29
 */
@Service
public class Logistics_data_serviceImpl implements Logistics_data_service {

    @Autowired
    private Logistics_data_Dao logistics_data_dao;

    @Override
    public List<Logistics_data_table> sel_findall() {
        return logistics_data_dao.sel_findall();
    }

    @Override
    public List<Logistics_data_table> sel(Date start, Date end) {
        return logistics_data_dao.sel(start,end);
    }

    @Override
    public List<Logistics_data_table> sel_otday() {
        return logistics_data_dao.sel_otday();
    }

    @Override
    public List<Logistics_data_table> sel_yester() {
        return logistics_data_dao.sel_yester();
    }

    @Override
    public List<Logistics_data_table> sel_7day() {
        return logistics_data_dao.sel_7day();
    }

    @Override
    public List<Logistics_data_table> sel_30day() {
        return logistics_data_dao.sel_30day();
    }

    @Override
    public List<Logistics_data_table> sel_years() {
        return logistics_data_dao.sel_years();
    }
}
