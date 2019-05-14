package xiaobaige.Pojo.image;

import xiaobaige.Pojo.Entity;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/27 0027 上午 10:31
 */
public class Imagetable extends Entity{

    private String openid;

    private String message;

    private MultipartFile file1;

    private MultipartFile file2;

    private MultipartFile file3;

    private MultipartFile not_file;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MultipartFile getFile1() {
        return file1;
    }

    public void setFile1(MultipartFile file1) {
        this.file1 = file1;
    }

    public MultipartFile getFile2() {
        return file2;
    }

    public void setFile2(MultipartFile file2) {
        this.file2 = file2;
    }

    public MultipartFile getFile3() {
        return file3;
    }

    public void setFile3(MultipartFile file3) {
        this.file3 = file3;
    }

    public MultipartFile getNot_file() {
        return not_file;
    }

    public void setNot_file(MultipartFile not_file) {
        this.not_file = not_file;
    }
}
