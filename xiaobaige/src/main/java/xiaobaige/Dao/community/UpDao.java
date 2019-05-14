package xiaobaige.Dao.community;

import xiaobaige.Pojo.community.Uptable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 下午 2:13
 */
public interface UpDao {

    //添加点赞
    public void add(Uptable up);
    //删除点赞
    public void del(int be_up_id, int up_man_id);
    //修改点赞
    public void edit(Uptable up);
    //查询所有点赞
    public List<Uptable> findall();
    //单条查询
    public List<Uptable> sel(int be_up_id, String up_man_openid);
    //查询是否已经点赞过该说说
    public int sel_up_number(@Param("be_up_id") int be_up_id, @Param("up_man_openid") String up_man_openid);
//    根据openid查询用户的头像
    public String sel_up_img(String openid);
}
