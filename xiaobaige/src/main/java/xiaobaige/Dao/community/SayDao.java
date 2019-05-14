package xiaobaige.Dao.community;

import xiaobaige.Pojo.community.Commenttable;
import xiaobaige.Pojo.community.Saytable;
import xiaobaige.Pojo.system.Usertable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 下午 2:11
 */
public interface SayDao {

    //添加说说
    public void add(Saytable say);
    //删除说说
    public void del(int id);
    //修改说说
    public void edit(Saytable say);
    //查询所有说说
    public List<Saytable> findall();
    //单条查询
    public List<Saytable> sel(String public_man_openid);
    //查询我的关注
    public List<Saytable> my_gz(String openid);
    //我的发布
    public List<Saytable>my_fb(String openid);
    //点赞
    public void up(int say_id);
    //点赞次数
    public int up_number(int id);
    //根据说说id查说说
    public List<Saytable> sel_say(int id);
//    根据说说id查询该说说的所有评论
    public List<Commenttable> sel_comment(int id);
    //根据用户提供的信息查询关注的好友的说说
    public List<Saytable> gz_fb_query(String message);
    //根据用户提供的信息查询自己的说说
    public List<Saytable> my_fb_query(String message, String openid);
//    根据说说id获取点赞者的头像
    public List<Usertable> up_touxiang(int id);
}
