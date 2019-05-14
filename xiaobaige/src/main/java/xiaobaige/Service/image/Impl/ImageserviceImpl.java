package xiaobaige.Service.image.Impl;

import xiaobaige.Pojo.image.UeditorUploadResp;
import xiaobaige.Prop.SystemProperties;
import xiaobaige.Service.image.Imageservice;
import xiaobaige.Util.FileTools;
import xiaobaige.Util.Uplogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:56
 */

@Service
public class ImageserviceImpl implements Imageservice {

    @Autowired
    private SystemProperties system;

    @Override
    public UeditorUploadResp upload(MultipartFile upfile) {
        UeditorUploadResp resp = new UeditorUploadResp();

        try {
            String fileName = FileTools.upload(system.getImgInformationDir(), upfile);
            resp.setState("SUCCESS");
            resp.setOriginal(fileName);
            resp.setSize(upfile.getSize());
            resp.setTitle(fileName);
            resp.setType(upfile.getContentType());
            resp.setUrl(system.getImgInformationPath() + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    @Override
    public String uplogo(String url, String filepath) {

        String url1 = null;
        try {
            url1 =  Uplogo.send(url, filepath);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return url1;
    }
}
