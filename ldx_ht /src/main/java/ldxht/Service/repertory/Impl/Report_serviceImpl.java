package ldxht.Service.repertory.Impl;

import ldxht.Dao.repertory.Report_Dao;
import ldxht.Pojo.repertory.Report_table;
import ldxht.Service.repertory.Report_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 6:10
 */

@Service
public class Report_serviceImpl implements Report_service{

    @Autowired
    private Report_Dao report_dao;

    @Override
    public List<Report_table> sel_findall() {
        return report_dao.sel_findall();
    }

    @Override
    public List<Report_table> sel_t(Date start, Date end) {
        return report_dao.sel_t(start,end);
    }

    @Override
    public List<Report_table> sel_type(String clothes_type) {
        return report_dao.sel_type(clothes_type);
    }
}
