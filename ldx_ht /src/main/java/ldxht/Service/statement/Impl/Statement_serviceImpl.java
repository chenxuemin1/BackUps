package ldxht.Service.statement.Impl;

import ldxht.Dao.statement.Statement_Dao;
import ldxht.Pojo.statement.Statement_table;
import ldxht.Service.statement.Statement_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 6:22
 */
@Service
public class Statement_serviceImpl implements Statement_service {
    @Autowired
    private Statement_Dao statement_dao;

    @Override
    public List<Statement_table> sel_findall() {
        return statement_dao.sel_findall();
    }

    @Override
    public List<Statement_table> sel_t(Date start, Date end) {
        return statement_dao.sel_t(start,end);
    }

    @Override
    public List<Statement_table> sel_type(String type) {
        return statement_dao.sel_type(type);
    }
}
