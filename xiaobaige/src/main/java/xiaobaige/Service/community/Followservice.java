package xiaobaige.Service.community;

import xiaobaige.Pojo.community.Followtable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 11:43
 */
public interface Followservice {

    //添加关注记录
    public void add(Followtable follow);
    //删除关注记录
    public void del(String be_follow_user_openid, String follow_user_openid);
    //修改关注记录
    public void edit(Followtable follow);
    //查询所有关注情况
    public List<Followtable> findall();
    //单条查询
    public List<Followtable> sel(String be_follow_user_openid);
    //查询是否已关注
    public int sel_gz_num(String be_follow_user_openid, String follow_user_openid);
}
