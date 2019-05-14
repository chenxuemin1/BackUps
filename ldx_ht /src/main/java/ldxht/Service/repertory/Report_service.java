package ldxht.Service.repertory;


import ldxht.Pojo.repertory.Report_table;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 5:55
 */
public interface Report_service {

    //搜索所有
    public List<Report_table> sel_findall();
    //根据时间搜索报表
    public List<Report_table> sel_t(Date start, Date end);
    //根据衣服种类
    public List<Report_table> sel_type(String clothes_type);
}
