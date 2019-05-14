package ldxht.Dao.repertory;

import ldxht.Pojo.repertory.Report_table;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 6:17
 */
public interface Report_Dao {

    //搜索所有
    public List<Report_table> sel_findall();
    //根据时间搜索报表
    public List<Report_table> sel_t(@Param("start") Date start, @Param("end") Date end);
    //根据衣服种类
    public List<Report_table> sel_type(String clothes_type);
}
