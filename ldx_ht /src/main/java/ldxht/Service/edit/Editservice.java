package ldxht.Service.edit;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/5 0005 上午 11:14
 */
public interface Editservice {

    //修改通告
    public void edit_tell(String message);

    //获取滚动通告
    public String sel_tell();

}
