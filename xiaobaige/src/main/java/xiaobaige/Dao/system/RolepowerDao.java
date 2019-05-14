package xiaobaige.Dao.system;

import xiaobaige.Pojo.system.Rolepowertable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @角色与权限关系表
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 3:05
 */
public interface RolepowerDao {

    /**
     * @新增
     * @param roleid
     * @param powerids
     */
    public void add(@Param("roleid") int roleid, @Param("powerids") int[] powerids);


    /**
     * @删除
     * @param powerid
     */
    public void del(int powerid);


    /**
     * @修改
     * @param roleid
     */
    public void edit(int roleid);

    /**
     * @查询所有
     * @return
     */
    public List<Rolepowertable> findall();

    /**
     * @查询指定数据
     * @param powerid
     * @return
     */
    public List<Rolepowertable> sel(int powerid);
}
