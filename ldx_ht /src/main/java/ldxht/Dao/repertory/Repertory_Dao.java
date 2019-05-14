package ldxht.Dao.repertory;

import ldxht.Pojo.repertory.Repertory_table;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 6:16
 */
public interface Repertory_Dao {
    //搜索所有
    public List<Repertory_table> sel_findall();
    //根据时间搜索库存
    public List<Repertory_table> sel_t(Date start, Date end);
    //根据衣服类型搜索
    public List<Repertory_table> sel_type(String clothes_type);
}
