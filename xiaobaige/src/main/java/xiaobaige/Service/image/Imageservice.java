package xiaobaige.Service.image;

import xiaobaige.Pojo.image.UeditorUploadResp;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:54
 */
public interface Imageservice {

    /**
     * 图片上传
     * @param upfile
     * @return
     */
    public UeditorUploadResp upload(MultipartFile upfile);

    /**
     * @上传logo
     * @param url
     * @param filepath
     * @return
     */
    public String uplogo(String url, String filepath);
}
