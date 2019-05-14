package ldxht.Service.repertory.Impl;

import ldxht.Dao.repertory.Clear_Dao;
import ldxht.Pojo.repertory.Clear_table;
import ldxht.Service.repertory.Clear_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 6:01
 */

@Service
public class Clear_serviceImpl implements Clear_service {

    @Autowired
    private Clear_Dao clear_dao;
    @Override
    public List<Clear_table> sel_findall() {
        return clear_dao.sel_findall();
    }

    @Override
    public void add(Clear_table clear_table) {
        clear_dao.add(clear_table);
    }
}
