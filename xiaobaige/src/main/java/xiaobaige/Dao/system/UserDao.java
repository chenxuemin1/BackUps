package xiaobaige.Dao.system;

import xiaobaige.Pojo.product.Backclothestable;
import xiaobaige.Pojo.system.Usertable;

import java.util.List;
import java.util.ListResourceBundle;

/**
 * 用户表
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 下午 1:26
 */
public interface UserDao {

    /**
     * @新增
     * @param user
     */
    public void add(Usertable user);


    /**
     * @删除
     * @param openid
     */
    public void del(String openid);


    /**
     * @修改
     * @param user
     */
    public void edit(Usertable user);

    /**
     * @邀请人数加一
     * @param openid
     */
    public void edit2(String openid);

    /**
     * @捐赠次数加一
     * @param openid
     */
    public void edit3(String openid);



    /**
     * @查询所有
     * @return
     */
    public List<Usertable> findall();

    /**
     * @我的号召力
     * @param openid
     * @return
     */
    public List<Usertable> my(String openid);

    /**
     * @我的号召力
     * @param openid
     * @return
     */
    public List<Usertable> my1(String openid);

    /**
     * @我的捐赠
     * @param openid
     * @return
     */
    public List<Backclothestable> my_jz(String openid);

    /**
     * @捐赠次数
     * @param openid
     * @return
     */
    public int jz_number(String openid);

    /**
     * @更改等级
     * @param grade
     */
    public void edit_grade(int grade, String openid);

    /**
     * @捐赠达人
     * @param openid
     * @return
     */
    public List<Usertable> jzdr(String openid);

    /**
     * @首页达人
     * @return
     */
    public List<Usertable> sel_index();

    /**
     * @等级超越人数
     * @return
     */
    public String over_number(String openid);

    /**
     * @判断是否已经存在
     * @param openid
     * @return
     */
    public int sel_exist(String openid);

    /**
     * @号召页面的个人信息
     * @param openid
     * @return
     */
    public List<Usertable> my2(String openid);
}
