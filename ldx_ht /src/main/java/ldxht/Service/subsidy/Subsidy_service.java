package ldxht.Service.subsidy;

import ldxht.Pojo.subsidy.Subsidy_table;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 下午 5:31
 */
public interface Subsidy_service {

    //根据用户名搜索
    public List<Subsidy_table> sel_y(String name);
    //根据快递单号
    public List<Subsidy_table> sel_d(String express_number);
    //根据用户名、快递单号搜索
    public List<Subsidy_table> sel_y_d(String name, String express_number);
    //修改重量和反赠金额
    public void edit(Subsidy_table subsidy_table);
    //搜索所有
    public List<Subsidy_table>sel_findall();

}
