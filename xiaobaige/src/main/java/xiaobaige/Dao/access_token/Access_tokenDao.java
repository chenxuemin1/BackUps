package xiaobaige.Dao.access_token;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/11 0011 下午 4:43
 */
public interface Access_tokenDao {

    /**
     * @添加access_token
     * @param access_token
     */
    public void add(String access_token);

    /**
     * @修改access_token
     * @param access_token
     */
    public void edit(String access_token);

    /**
     * @读取access_token
     */
    public String sel();
}
