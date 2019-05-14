package xiaobaige.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/19 0019 上午 9:54
 */
public class Data_formate {

    public Date format(Date date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String datestr = simpleDateFormat.format(date);

        Date dd = simpleDateFormat.parse(datestr);

        return dd;
    }


}
