package ldxht.Dao.statement;

import ldxht.Pojo.statement.Statement_table;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 6:24
 */
public interface Statement_Dao {
    //查询所有
    public List<Statement_table> sel_findall();
    //根据时间搜索
    public List<Statement_table> sel_t(Date start, Date end);
    //根据费用类型查询
    public List<Statement_table> sel_type(String type);
}
