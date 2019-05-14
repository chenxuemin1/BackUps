package ldxht.Service.edit.Impl;

import ldxht.Dao.Edit.Edit_Dao;
import ldxht.Service.edit.Editservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/5 0005 上午 11:15
 */
@Service
public class EditserviceImpl implements Editservice {

    @Autowired
    private Edit_Dao edit_dao;

    @Override
    public void edit_tell(String message) {
        edit_dao.edit_tell(message);
    }

    @Override
    public String sel_tell() {
        return edit_dao.sel_tell();
    }
}
