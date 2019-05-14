package ldxht.Prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:58
 */

@Component
public class SystemProperties {

    /**
     * 海报
     */
    @Value("${img.index_haibao.dir}")
    private String imgindex1Dir;
    @Value("${img.index_haibao.path}")
    private String imgindex1Path;

    public String getImgindex1Dir() {
        return imgindex1Dir;
    }

    public void setImgindex1Dir(String imgindex1Dir) {
        this.imgindex1Dir = imgindex1Dir;
    }

    public String getImgindex1Path() {
        return imgindex1Path;
    }

    public void setImgindex1Path(String imgindex1Path) {
        this.imgindex1Path = imgindex1Path;
    }

}
