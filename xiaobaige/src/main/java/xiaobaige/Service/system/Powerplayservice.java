package xiaobaige.Service.system;

import xiaobaige.Pojo.system.Powerplaytable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 2:26
 */
public interface Powerplayservice {

    /**
     * @新增
     * @param powerid
     * @param playids
     */
    public void add(int powerid, int[] playids);


    /**
     * @删除
     * @param playid
     */
    public void del(int playid);


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
