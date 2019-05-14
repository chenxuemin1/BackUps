package xiaobaige.Service.community;

import xiaobaige.Pojo.community.Uptable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 11:44
 */
public interface Upservice {

    //添加点赞
    public void add(Uptable up);
    //删除点赞
    public void del(int be_up_id, String up_man_openid);
    //修改点赞
    public void edit(Uptable up);
    //查询所有点赞
    public List<Uptable> findall();
    //单条查询
    public List<Uptable> sel(int be_up_id, String up_man_openid);
    //查询是否已经点赞过该说说
    public int sel_up_number(int be_up_id, String up_man_openid);
//    根据openid获取用户的头像
    public String sel_up_img(String openid);
}
