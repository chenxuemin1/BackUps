package xiaobaige.Service.record;

import xiaobaige.Pojo.record.Invitationtable;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/4 0004 下午 8:17
 */
public interface Invitationservice {

    /**
     * @添加
     * @param invitation
     */
    public void add(Invitationtable invitation);

    /**
     * @删除
     * @param id
     */
    public void del(int id);
}
