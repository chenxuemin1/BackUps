package xiaobaige.Dao.system;

import xiaobaige.Pojo.system.Roleusertable;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @角色与用户关系表
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 3:04
 */
public interface RoleuserDao {

    /**
     * @新增
     * @param roleid
     * @param userids
     */
    public void add(@Param("roleid") int roleid, @Param("userids") int[] userids);


    /**
     * @删除
     * @param userid
     */
    public void del(long userid);


    /**
     * @修改
     * @param userid
     */
    public void edit(long userid);

    /**
     * @查询所有
     * @return
     */
    public List<Roleusertable> findall();

    /**
     * @查询指定数据
     * @param userid
     * @return
     */
    public List<Roleusertable> sel(long userid);
}
