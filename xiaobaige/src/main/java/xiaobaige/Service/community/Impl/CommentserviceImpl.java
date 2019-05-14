package xiaobaige.Service.community.Impl;


import xiaobaige.Dao.community.CommentDao;
import xiaobaige.Pojo.community.Commenttable;
import xiaobaige.Service.community.Commentservice;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 11:45
 */

@Service
public class CommentserviceImpl implements Commentservice{

    @Autowired
    private CommentDao commentDao;


    @Override
    public void add(Commenttable comment) {
        commentDao.add(comment);
    }

    @Override
    public void del(int id) {
        commentDao.del(id);
    }

    @Override
    public void edit(Commenttable comment) {
        commentDao.edit(comment);
    }

    @Override
    public List<Commenttable> findall() {
        return commentDao.findall();
    }

    @Override
    public List<Commenttable> sel(int be_comment_id) {
        return commentDao.sel(be_comment_id);
    }

    @Override
    public List<Commenttable> pl_list(String openid) {
        return commentDao.pl_list(openid);
    }

    @Override
    public void del_pl(int id) {
        commentDao.del_pl(id);
    }

    @Override
    public int pl_number(String openid) {
        return commentDao.pl_number(openid);
    }

    @Override
    public List<Commenttable> sel_comment(int id) {
        return commentDao.sel_comment(id);
    }

    @Override
    public void edit_state(int id) {
        commentDao.edit_state(id);
    }

    @Override
    public List<Commenttable> sel_my_comment(int be_comment_id,String comment_man_openid) {
        return commentDao.sel_my_comment(be_comment_id,comment_man_openid);
    }


}
