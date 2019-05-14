package ldxht.Service.say;

import ldxht.Pojo.say.Phone_brand_table;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 3:33
 */
public interface Phone_brand_service {
    //根据时间查询
    public List<Phone_brand_table> sel(Date start, Date end);

    //搜索所有
    public List<Phone_brand_table> sel_findall();

}
