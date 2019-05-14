package ldxht.Dao.Edit;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/5 0005 上午 11:19
 */
public interface Edit_Dao {

    //修改通告
    public void edit_tell(String message);

    //获取滚动通告
    public String sel_tell();
}
