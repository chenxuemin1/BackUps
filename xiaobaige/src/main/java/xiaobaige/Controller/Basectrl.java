package xiaobaige.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 8:09
 */

@SessionAttributes(names={Basectrl.LOGIN_ACCOUNT})
public class Basectrl {
    /**
     * 日志
     */
    protected Log log = LogFactory.getLog("log");

    public static final String LOGIN_ACCOUNT = "image";


}
