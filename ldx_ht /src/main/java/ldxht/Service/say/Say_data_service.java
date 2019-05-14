package ldxht.Service.say;

import ldxht.Pojo.say.Say_data_table;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 3:32
 */
public interface Say_data_service {

    //根据时间查询
    public List<Say_data_table> sel(Date start, Date end);
    //查询所有
    public List<Say_data_table> sel_findall();

}
