package ldxht.Service.subsidy.Impl;

import ldxht.Dao.subsidy.Subsidy_Dao;
import ldxht.Pojo.subsidy.Subsidy_table;
import ldxht.Service.subsidy.Subsidy_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 5:47
 */

@Service
public class Subsidy_serviceImpl implements Subsidy_service {

    @Autowired
    private Subsidy_Dao subsidy_dao;

    @Override
    public List<Subsidy_table> sel_y(String name) {
        return subsidy_dao.sel_y(name);
    }

    @Override
    public List<Subsidy_table> sel_d(String express_number) {
        return subsidy_dao.sel_d(express_number);
    }

    @Override
    public List<Subsidy_table> sel_y_d(String name, String express_number) {
        return subsidy_dao.sel_y_d(name,express_number);
    }

    @Override
    public void edit(Subsidy_table subsidy_table) {
        subsidy_dao.edit(subsidy_table);
    }

    @Override
    public List<Subsidy_table> sel_findall() {
        return subsidy_dao.sel_findall();
    }
}
