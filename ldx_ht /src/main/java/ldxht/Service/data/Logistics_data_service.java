package ldxht.Service.data;

import ldxht.Pojo.data.Logistics_data_table;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:27
 */
public interface Logistics_data_service {
    //查询所有
    public List<Logistics_data_table> sel_findall();
    //根据时间查询
    public List<Logistics_data_table> sel(Date start, Date end);
    //查询今天
    public List<Logistics_data_table> sel_otday();
    //查询昨天
    public List<Logistics_data_table> sel_yester();
    //查询最近七天
    public List<Logistics_data_table> sel_7day();
    //查询最近30天
    public List<Logistics_data_table> sel_30day();
    //查询最近一年
    public List<Logistics_data_table> sel_years();
}
