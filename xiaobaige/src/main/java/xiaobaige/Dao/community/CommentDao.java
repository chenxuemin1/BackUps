package xiaobaige.Dao.community;

import xiaobaige.Pojo.community.Commenttable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 下午 2:11
 */
public interface CommentDao {

    //添加评论
    public void add(Commenttable comment);
    //删除评论
    public void del(int id);
    //修改评论
    public void edit(Commenttable comment);
    //查询所有
    public List<Commenttable> findall();
    //单条查询
    public List<Commenttable> sel(int be_comment_id);
//    评论列表
    public List<Commenttable> pl_list(String openid);
//    删除评论
    public void del_pl(int id);
//    当天被评的数量
    public int pl_number(String openid);
//    根据评论id查该说说的所有评论
    public List<Commenttable> sel_comment(int id);
//    根据评论id修改评论的状态
    public void edit_state(int id);
//    查询自己的评论
    public List<Commenttable> sel_my_comment(@Param("be_comment_id") int be_comment_id, @Param("comment_man_openid") String comment_man_openid);
}
