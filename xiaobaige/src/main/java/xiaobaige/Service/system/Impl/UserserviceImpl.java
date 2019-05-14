package xiaobaige.Service.system.Impl;

import xiaobaige.Dao.system.UserDao;
import xiaobaige.Pojo.product.Backclothestable;
import xiaobaige.Pojo.system.Usertable;
import xiaobaige.Service.system.Userservice;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/12 0012 上午 11:34
 */

@Service
public class UserserviceImpl implements Userservice{

    @Autowired
    private UserDao userDao ;


    @Override
    public void add(Usertable user) {
        userDao.add(user);
    }

    @Override
    public void del(String openid) {
        userDao.del(openid);
    }

    @Override
    public void edit(Usertable user) {
        userDao.edit(user);
    }

    @Override
    public void edit2(String openid){
        userDao.edit2(openid);
    }

    @Override
    public void edit3(String openid){
        userDao.edit3(openid);
    }

    @Override
    public List<Usertable> findall() {

        return userDao.findall();
    }

    @Override
    public List<Usertable> my(String openid) {
        return userDao.my(openid);
    }

    @Override
    public List<Usertable> my1(String openid){
        return userDao.my1(openid);
    }

    @Override
    public List<Backclothestable> my_jz(String openid) {
        return userDao.my_jz(openid);
    }

    @Override
    public int jz_number(String openid) {
        return userDao.jz_number(openid);
    }

    @Override
    public void edit_grade(int grade,String openid) {
        userDao.edit_grade(grade,openid);
    }

    @Override
    public List<Usertable> jzdr(String openid) {
        return userDao.jzdr(openid);
    }

    @Override
    public List<Usertable> sel_index() {
        return userDao.sel_index();
    }

    @Override
    public String over_number(String openid) {
        return userDao.over_number(openid);
    }

    @Override
    public int sel_exist(String openid) {
        return userDao.sel_exist(openid);
    }

    @Override
    public List<Usertable> my2(String openid) {
        return userDao.my2(openid);
    }


}
