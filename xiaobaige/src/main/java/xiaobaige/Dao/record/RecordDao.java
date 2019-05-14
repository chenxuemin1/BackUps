package xiaobaige.Dao.record;

import xiaobaige.Pojo.record.Activitytable;
import xiaobaige.Pojo.record.Invitationtable;
import xiaobaige.Pojo.record.Recordtable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/26 0026 上午 10:35
 */
public interface RecordDao {
    /**
     * @添加记录
     * @param record
     */
    public void add(Recordtable record);

    /**
     * @删除记录
     * @param id
     */
    public void del(int id);

    /**
     * @修改记录
     * @param record
     */
    public void edit(Recordtable record);

    /**
     * @查询所有
     * @return
     */
    public List<Recordtable> findall();

    /**
     * @查询指定用户数据
     * @param openid
     * @return
     */
    public List<Recordtable> sel(String openid);

    /**
     * @我的等级系统信息
     * @param openid
     * @return
     */
    public List<Recordtable> news(String openid);

    /**
     * @我的邀请系统信息
     * @param openid
     * @return
     */
    public List<Invitationtable> news1(String openid);

    /**
     * @我的活动系统信息
     * @param openid
     * @return
     */
    public List<Activitytable> news2(String openid);

    /**
     * @查询系统消息条数
     * @param openid
     * @return
     */
    public int news_number(String openid);


}
