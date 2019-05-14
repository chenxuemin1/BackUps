package ldxht.Util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/23 0023 上午 11:03
 */

public class List2Json1 {

    /**
     * @list转成jsonarray
     * @param list
     * @return
     */
    public static JSONArray List2Json(List<?> list){
        JSONArray json = JSONArray.fromObject(list);
        return json;
    }

    /**
     * @ARRAYTOOBJECT
     * @param array
     * @return
     */
    public static JSONObject ArraytoObject(JSONArray array){

        JSONObject jsonObject = array.toJSONObject(array);

        return jsonObject;

    }

    public static Map<String, String> JsontoMap(JSONObject jsonObject) {
        Map<String, String> result = new HashMap<String, String>();
        Iterator<String> iterator = jsonObject.keys();
        String key = null;
        String value = null;
        while (iterator.hasNext()) {
            key = iterator.next();
            value = jsonObject.getString(key);
            result.put(key, value);
        }
        return result;
    }
}