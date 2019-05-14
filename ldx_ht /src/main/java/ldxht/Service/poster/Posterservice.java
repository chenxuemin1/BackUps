package ldxht.Service.poster;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/5 0005 下午 1:49
 */
public interface Posterservice {

    /**
     * 更换首页海报
     * @param file
     * @param id
     */
    public void edit_sy(MultipartFile file,String filename);

    /**
     * 更换捐赠登记海报
     * @param file
     * @param id
     */
    public void edit_dj(MultipartFile file,String filename);

    /**
     * 更换捐赠达人海报
     * @param file
     * @param id
     */
    public void edit_dr(MultipartFile file,String filename);
}
