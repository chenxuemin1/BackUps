package ldxht.Dao.say;

import ldxht.Pojo.say.Say_table;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 3:46
 */
public interface Say_Dao {

    //删除
    public void del(int id);
    //拉黑
    public void del_lh(int id);
    //回复
    public void edit_hf(int id);
    //根据昵称和内容搜索
    public List<Say_table> sel_n_m(@Param("nickname") String nickname, @Param("message") String message);
    //根据昵称搜索
    public List<Say_table> sel_n(String nickname);
    //根据内容搜索
    public List<Say_table> sel_m(String message);
    //搜索所有
    public List<Say_table> sel_findall();
}
