package xiaobaige.Prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:58
 */

@Component
public class SystemProperties {

    @Value("${img.Upload.dir}")
    private String imgUploadDir;

    @Value("${img.base.path}")
    private String imgBasePath;

    @Value("${img.information.dir}")
    private String imgInformationDir;
    @Value("${img.information.path}")
    private String imgInformationPath;

    @Value("${img.information.dir2}")
    private String imgInformationDir2;
    @Value("${img.information.path2}")
    private String imgInformationPath2;

    @Value("${img.information.dir3}")
    private String imgInformationDir3;
    @Value("${img.information.path3}")
    private String imgInformationPath3;

    public String getImgUploadDir() {
        return imgUploadDir;
    }
    public void setImgUploadDir(String imgUploadDir) {
        System.out.println("获取图片上传目录：" + imgUploadDir);
        this.imgUploadDir = imgUploadDir;
    }

    public String getImgBasePath() {
        return imgBasePath;
    }
    public void setImgBasePath(String imgBasePath) {
        this.imgBasePath = imgBasePath;
    }
    public String getImgInformationDir() {
        return imgInformationDir;
    }
    public void setImgInformationDir(String imgInformationDir) {
        this.imgInformationDir = imgInformationDir;
    }

    public String getImgInformationPath() {
        return imgInformationPath;
    }
    public void setImgInformationPath(String imgInformationPath) {
        this.imgInformationPath = imgInformationPath;
    }

    public String getImgInformationDir2() {
        return imgInformationDir2;
    }

    public void setImgInformationDir2(String imgInformationDir2) {
        this.imgInformationDir2 = imgInformationDir2;
    }

    public String getImgInformationPath2() {
        return imgInformationPath2;
    }

    public void setImgInformationPath2(String imgInformationPath2) {
        this.imgInformationPath2 = imgInformationPath2;
    }

    public String getImgInformationDir3() {
        return imgInformationDir3;
    }

    public void setImgInformationDir3(String imgInformationDir3) {
        this.imgInformationDir3 = imgInformationDir3;
    }

    public String getImgInformationPath3() {
        return imgInformationPath3;
    }

    public void setImgInformationPath3(String imgInformationPath3) {
        this.imgInformationPath3 = imgInformationPath3;
    }
}
