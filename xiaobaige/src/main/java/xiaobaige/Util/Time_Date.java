package xiaobaige.Util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.out;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/29 0029 上午 10:13
 */
public class Time_Date {

    public static String time_compare(long nowdate, long date){
        long size = nowdate-date;
        String strdate = null;
        if(size<25*60*1000){
            strdate = "刚刚";
        }
        else if(size>=25*60*1000&&size<45*60*1000){
            strdate = "25分钟前";
        }
        else if(size>=45*60*1000&&size<60*60*1000){
            strdate = "45分钟前";
        }
        else if(size>=60*60*1000&&size<120*60*1000){
            strdate = "1个小时前";
        }
        else if(size>=120*60*1000&&size<180*60*1000){
            strdate = "2个小时前";
        }
        else {
            return null;
        }
        return strdate;
    }


    public static JSONArray jsonArray(JSONArray jsonArray,String type){

        for (int i=0;jsonArray.size()>i;i++){
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String time = (String) jsonObject.get(type);

            SimpleDateFormat timepare1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat timepare2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = timepare1.parse(time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date date1 = new Date();
//                当前时间的时间戳
            long nowdate1 =  date1.getTime();
//                数据的时间戳
            long date2 = date.getTime();

            String timestate = time_compare(nowdate1,date2);
            if(timestate!=null){
                jsonObject.put("public_time",timestate);
                out.println(timestate);
            }else {
                String datestr = timepare2.format(date2);
                jsonObject.put("public_time",datestr);
                out.println(datestr);
            }

        }

        return jsonArray;
    }
}
