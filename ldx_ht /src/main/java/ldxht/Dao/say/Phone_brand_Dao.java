package ldxht.Dao.say;

import ldxht.Pojo.say.Phone_brand_table;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 4:03
 */
public interface Phone_brand_Dao {

    //根据时间查询
    public List<Phone_brand_table> sel(Date start, Date end);

    //搜索所有
    public List<Phone_brand_table> sel_findall();
}
