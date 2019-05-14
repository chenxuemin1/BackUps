package xiaobaige.Dao.subsidy;

import xiaobaige.Pojo.subsidy.Subsidystate;
import xiaobaige.Pojo.subsidy.Subsidytable;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 下午 1:28
 */
public interface SubsidyDao {

    /**
     * @新增
     * @param subsidy
     */
    public void add(String express_number);

    /**
     * @删除
     * @param express_number
     */
    public void del(long express_number);

    /**
     * @修稿
     * @param subsidy
     */
    public void edit(Subsidytable subsidy);

    /**
     * @查询
     * @return
     */
    public List<Subsidytable> findall();

    /**
     * @查询指定数据
     * @param express_number
     * @return
     */
    public List<Subsidytable> sel(long express_number);

    /**
     * @查询反赠状态类别
     * @param subsidycode
     */
    public List<Subsidystate> type(int subsidycode);
}
