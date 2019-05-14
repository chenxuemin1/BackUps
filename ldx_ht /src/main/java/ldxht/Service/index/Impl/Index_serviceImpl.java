package ldxht.Service.index.Impl;

import ldxht.Dao.index.Index_Dao;
import ldxht.Service.index.Index_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xm@c.com    薛民
 * @date 2018/5/30 21:57
 */

@Service
public class Index_serviceImpl implements Index_service {

    @Autowired
    private Index_Dao index_dao;

    @Override
    public int sel(String account, String password) {
        return index_dao.sel(account,password);
    }
}
