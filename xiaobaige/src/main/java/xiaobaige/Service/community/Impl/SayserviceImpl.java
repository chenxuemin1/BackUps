package xiaobaige.Service.community.Impl;


import xiaobaige.Dao.community.SayDao;
import xiaobaige.Pojo.community.Commenttable;
import xiaobaige.Pojo.community.Saytable;
import xiaobaige.Pojo.system.Usertable;
import xiaobaige.Prop.SystemProperties;
import xiaobaige.Service.community.Sayservice;
import xiaobaige.Util.FileTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/24 0024 上午 11:44
 */

@Service
public class SayserviceImpl implements Sayservice{

    @Autowired
    private SayDao sayDao;

    @Autowired
    private SystemProperties system;


    @Override
    public void add1(MultipartFile file) {

    }

    @Override
    public void add(Saytable say, MultipartFile upfile, MultipartFile upfile2, MultipartFile upfile3) throws Exception{
        try {

            if(say.getSay_message()==null||say.getSay_message().isEmpty()){
                say.setSay_message(null);

            }
            if (upfile!=null&&!upfile.isEmpty()){
                String filename = FileTools.upload(system.getImgInformationDir(),upfile);
                say.setPhoto_loca1(system.getImgInformationPath()+filename);

            }else {
                say.setPhoto_loca1(null);
            }
            if(upfile2!=null&&!upfile2.isEmpty()){
                String filename2 = FileTools.upload(system.getImgInformationDir2(), upfile2);
                say.setPhoto_loca2(system.getImgInformationPath2() + filename2);

            }else {
                say.setPhoto_loca2(null);
            }
            if(upfile3!=null&&!upfile3.isEmpty()) {
                String filename3 = FileTools.upload(system.getImgInformationDir3(), upfile3);
                say.setPhoto_loca3(system.getImgInformationPath3() + filename3);

            }else {
                say.setPhoto_loca3(null);
            }
            sayDao.add(say);

        }catch (Exception e){
//            throw new RuntimeException("发布失败");
            e.printStackTrace();
        }

    }

    @Override
    public void del(int id) {
        sayDao.del(id);
    }

    @Override
    public void edit(Saytable say) {
        sayDao.edit(say);
    }

    @Override
    public List<Saytable> findall() {
        return sayDao.findall();
    }

    @Override
    public List<Saytable> sel(String public_man_openid) {
        return sayDao.sel(public_man_openid);
    }

    @Override
    public List<Saytable> my_gz(String openid) {
        return sayDao.my_gz(openid);
    }

    @Override
    public List<Saytable> my_fb(String openid) {
        return sayDao.my_fb(openid);
    }
    @Override
    public void up(int say_id) {
        sayDao.up(say_id);
    }

    @Override
    public int up_number(int id) {
        return sayDao.up_number(id);
    }

    @Override
    public List<Saytable> sel_say(int id) {
        return sayDao.sel_say(id);
    }

    @Override
    public List<Commenttable> sel_comment(int id) {
        return sayDao.sel_comment(id);
    }

    @Override
    public List<Saytable> gz_fb_query(String message) {
        return sayDao.gz_fb_query(message);
    }

    @Override
    public List<Saytable> my_fb_query(String message, String openid) {
        return sayDao.my_fb_query(message, openid);
    }

    @Override
    public List<Usertable> up_touxiang(int id) {
        return sayDao.up_touxiang(id);
    }

}
