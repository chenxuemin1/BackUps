package ldxht.Dao.data;

import ldxht.Pojo.data.User_data_table;
import ldxht.Pojo.data.User_info_table;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:20
 */
public interface User_data_Dao {

    //搜索所有
    public List<User_data_table> sel_findall();
    //根据时间查询
    public List<User_data_table> sel(Date start, Date end);
    //查询今天
    public List<User_data_table> sel_otday();
    //查询昨天
    public List<User_data_table> sel_yester();
    //查询最近七天
    public List<User_data_table> sel_7day();
    //查询最近30天
    public List<User_data_table> sel_30day();
    //查询最近一年
    public List<User_data_table> sel_years();
}
