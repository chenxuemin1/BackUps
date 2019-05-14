package ldxht.Dao.index;

import org.apache.ibatis.annotations.Param;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 21:59
 */
public interface Index_Dao {
    //搜索管理员账号
    public int sel(@Param("account")String account, @Param("password")String password);

}
