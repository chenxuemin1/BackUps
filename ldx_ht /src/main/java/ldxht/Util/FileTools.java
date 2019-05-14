package ldxht.Util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 文件工具类
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 8:00
 */
public class FileTools {

    /**
     * 文件上传
     * @param basePath		上传目录
     * @param upfile		上传文件
     * @return
     */
    public static void upload(String basePath, MultipartFile upfile,String fileName) throws Exception {
        if(!upfile.isEmpty()) {
            String oName = upfile.getOriginalFilename();
            File file = new File(basePath);
            // 目录不存在则创建目录
            if(!file.exists()) {
                file.mkdirs();
            }
//            String fileName = filename;
            // copy文件到指定目录
            upfile.transferTo(new File(basePath + fileName));
//            return fileName;
        }
//        return null;
    }
}
