package xiaobaige.Dao.system;

import xiaobaige.Pojo.system.Powerplaytable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @权限与操作关系表
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 3:05
 */
public interface PowerplayDao {

    /**
     * @新增
     * @param powerid
     * @param playids
     */
    public void add(@Param("powerid") int powerid, @Param("playids") int[] playids);


    /**
     * @删除
     * @param powerid
     */
    public void del(int powerid);


    /**
     * @修改
     * @param powerid
     */
    public void edit(int powerid);

    /**
     * @查询所有
     * @return
     */
    public List<Powerplaytable> findall();

    /**
     * @查询指定数据
     * @param powerid
     * @return
     */
    public List<Powerplaytable> sel(int powerid);
}
