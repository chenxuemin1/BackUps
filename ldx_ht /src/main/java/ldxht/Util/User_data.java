package ldxht.Util;

import com.sun.xml.internal.ws.api.message.HeaderList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/2 0002 下午 5:42
 */
public class User_data {

    /**
     * @用户条形数据
     * @param jsonObject
     * @return
     */
    public static ArrayList user_bar(JSONObject jsonObject){

        ArrayList list = new ArrayList();

        int user_number = jsonObject.getInt("user_number");
        double back_money = jsonObject.getDouble("back_money");
        int coupon_give_number = jsonObject.getInt("coupon_give_number");
        int back_number = jsonObject.getInt("back_number");

        list.add(user_number);
        list.add(back_money);
        list.add(coupon_give_number);
        list.add(back_number);

        return list;
    }

    /**
     * @用户来源环形数据
     * @param jsonObject
     * @return
     */
    public static ArrayList user_from(JSONObject jsonObject){
        ArrayList list = new ArrayList();
        Map<String ,Object> map = new HashMap<>();
        Map<String ,Object> map1 = new HashMap<>();
        int zj_follow = jsonObject.getInt("zj_follow_proportion");
        int qt_follow = jsonObject.getInt("qt_follow_proportion");

        map.put("color","#ffc025");
        map.put("itemStyle",map);
        map.put("value",zj_follow);
        map.put("name","'"+zj_follow+"% "+"直接关注"+"'");

        map1.put("color","#5dc7f0");
        map1.put("itemStyle",map1);
        map1.put("value",qt_follow);
        map1.put("name","'"+qt_follow+"% "+"其他"+"'");

        list.add(map);
        list.add(map1);

        return list;
    }

    /**
     * @用户地区圆饼数据
     * @param jsonArray
     * @return
     */
    public static ArrayList user_loca(JSONArray jsonArray){
        ArrayList list = new ArrayList();

        for(int i=0;jsonArray.size()>i;i++){
            Map<String,Object> map = new HashMap<>();
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String loca = jsonObject.getString("location");
            int loca_number = jsonObject.getInt("location_proportion");
            String color = color(i);
            map.put("itemStyle",map.put("color",color));
            map.put("value",loca_number);
            map.put("name","'"+loca_number+"% "+loca+"'");
            list.add(map);
        }
        return list;

    }

    /**
     * @快递类型圆饼数据
     * @param jsonArray
     * @return
     */
    public static ArrayList user_express(JSONArray jsonArray){
        ArrayList list = new ArrayList();

        for(int i=0;jsonArray.size()>i;i++){
            Map<String,Object> map = new HashMap<>();
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String epxress = jsonObject.getString("logistics_type");
            int express_number = jsonObject.getInt("logistics_proportion");
            String color = color(i);
            map.put("itemStyle",map.put("color",color));
            map.put("value",express_number);
            map.put("name","'"+express_number+"% "+epxress+"'");
            list.add(map);
        }
        return list;
    }

    public static String color(int i){
        String color = null;
        switch (i){
            case 1 : color = "#ffc025";
            break;

            case 2 : color = "red";
            break;

            case 3 : color = "blue";
            break;

            case 4 : color = "yellow";
            break;

            case 5 : color = "green";
            break;

            case 6 : color = "black";
            break;

            case 7 : color = "brown";
            break;

            case 8 : color = "pink";
        }
        return color;
    }
}
