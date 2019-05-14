package xiaobaige.Service.system;

import xiaobaige.Pojo.system.Roleusertable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 2:08
 */
public interface Roleuserservice {

    /**
     * @新增
     * @param roleid
     * @param userids
     */
    public void add(int roleid, int[] userids);


    /**
     * @删除
     * @param userid
     */
    public void del(int userid);


    /**
     * @修改
     * @param userid
     */
    public void edit(int userid);

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
    public List<Roleusertable> sel(int userid);
}
