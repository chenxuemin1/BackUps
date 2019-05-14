package ldxht.Service.poster.Impl;

import ldxht.Prop.SystemProperties;
import ldxht.Service.poster.Posterservice;
import ldxht.Util.FileTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/5 0005 下午 1:50
 */
@Service
public class PosterserviceImpl implements Posterservice{

    @Autowired
    private SystemProperties system;

    @Override
    public void edit_sy(MultipartFile file, String filename) {

        try {
            FileTools.upload(system.getImgindex1Dir(),file,filename);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void edit_dj(MultipartFile file, String filename) {

        try {
            FileTools.upload(system.getImgindex1Dir(),file,filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit_dr(MultipartFile file, String filename) {

        try {
            FileTools.upload(system.getImgindex1Dir(),file,filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
