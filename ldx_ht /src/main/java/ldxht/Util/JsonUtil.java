package ldxht.Util;//package ldx.Util;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import org.apache.commons.lang3.StringUtils;
//
//
///**
// * @author xm@c.com    Administrator
// * @date 2018/4/21 0021 下午 6:11
// */
//public class JsonUtil {
//
//    private static Gson gson = null;
//
//    static {
//        if(gson==null){
//            gson = new GsonBuilder().serializeNulls().create();
//        }
//    }
//
//    /**
//     * @讲对象转成json字符串
//     * @param obj
//     * @return
//     */
//    public static String toJsonString(Object obj){
//        if(obj == null){
//            return "{}";
//        }
//        if (obj instanceof String){
//            if(StringUtils.isEmpty(obj.toString())){
//                return "{}";
//            }
//        }
//        String json = "";
//        try{
//            if(gson != null){
//                json = gson.toJson(obj);
//            }
//        }catch(Exception e){
//            return "{}";
//        }
//        return json;
//    }
//    /**
//     * 转成bean
//     *
//     * @param json
//     * @param classOfT
//     * @return
//     */
//    public static <T> T fromJsonString(String json, Class<T> classOfT) {
//        T t = null;
//        if (gson != null) {
//            t = gson.fromJson(json, classOfT);
//        }
//        return t;
//    }
//
//}
