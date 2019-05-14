package ldxht.Dao.data;

import ldxht.Pojo.data.User_info_table;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:11
 */
public interface User_info_Dao {

    //搜索所有
    public List<User_info_table> sel_findall();
    //根据用户名搜索
    public List<User_info_table> sel_y(String name);
    //根据手机号码搜索
    public List<User_info_table> sel_s(long phone_number);
    //根据用户名和手机号码搜索
    public List<User_info_table> sel_y_s(String name, long phone_number);
    //查询今天
    public List<User_info_table> sel_otday();
    //查询昨天
    public List<User_info_table> sel_yester();
    //查询最近七天
    public List<User_info_table> sel_7day();
    //查询最近30天
    public List<User_info_table> sel_30day();
    //查询最近一年
    public List<User_info_table> sel_years();
}
