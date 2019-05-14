package ldxht.Dao.repertory;

import ldxht.Pojo.repertory.Clear_table;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 6:16
 */
public interface Clear_Dao {

    //查询清算表
    public List<Clear_table> sel_findall();
    //添加数据
    public void add(Clear_table clear_table);
}
