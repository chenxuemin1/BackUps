package ldxht.Service.say;

import ldxht.Pojo.say.Say_table;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 3:34
 */
public interface Say_service {

    //删除
    public void del(int id);
    //拉黑
    public void del_lh(int id);
    //回复
    public void edit_hf(int id);
    //根据昵称和内容搜索
    public List<Say_table> sel_n_m(String nickname, String message);
    //根据昵称搜索
    public List<Say_table> sel_n(String nickname);
    //根据内容搜索
    public List<Say_table> sel_m(String message);
    //搜索所有
    public List<Say_table> sel_findall();
}
