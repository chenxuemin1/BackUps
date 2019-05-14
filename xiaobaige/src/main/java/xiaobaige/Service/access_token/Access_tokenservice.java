package xiaobaige.Service.access_token;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/11 0011 下午 4:18
 */
public interface Access_tokenservice {

    /**
     *@添加access_token
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
     * @return
     */
    public String sel();

}
