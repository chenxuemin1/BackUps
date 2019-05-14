package ldxht.Service.repertory.Impl;

import ldxht.Dao.repertory.Repertory_Dao;
import ldxht.Pojo.repertory.Repertory_table;
import ldxht.Service.repertory.Repertory_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 6:10
 */
@Service
public class Repertory_serviceImpl implements Repertory_service{

    @Autowired
    private Repertory_Dao repertory_dao;

    @Override
    public List<Repertory_table> sel_findall() {
        return repertory_dao.sel_findall();
    }

    @Override
    public List<Repertory_table> sel_t(Date start, Date end) {
        return repertory_dao.sel_t(start,end);
    }

    @Override
    public List<Repertory_table> sel_type(String clothes_type) {
        return repertory_dao.sel_type(clothes_type);
    }
}
