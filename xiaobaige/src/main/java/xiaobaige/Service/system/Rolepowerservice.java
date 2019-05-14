package xiaobaige.Service.system;

import xiaobaige.Pojo.system.Rolepowertable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 2:26
 */
public interface Rolepowerservice {

    /**
     * @新增
     * @param roleid
     * @param powerids
     */
    public void add(int roleid, int[] powerids);


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
