package xiaobaige.Service.record;

import xiaobaige.Pojo.record.Activitytable;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/4 0004 下午 8:16
 */
public interface Activityservice {

    /**
     * @添加
     * @param activity
     */
    public void add(Activitytable activity);

    /**
     * @删除
     * @param id
     */
    public void del(int id);

}
