package ldxht.Util;

import net.sf.json.JSONObject;

import java.util.ArrayList;

/**
 * @author xm@c.com    Administrator
 * @date 2018/6/2 0002 下午 4:42
 */
public class Say_data {

    /**
     * @用户总发布数曲线数据
     * @param jsonObject
     * @return
     */
    public static ArrayList user_public(JSONObject jsonObject){

        ArrayList list = new ArrayList();

        int time0 = jsonObject.getInt("time0");
        int time2 = jsonObject.getInt("time2");
        int time4 = jsonObject.getInt("time4");
        int time6 = jsonObject.getInt("time6");
        int time8 = jsonObject.getInt("time8");
        int time10 = jsonObject.getInt("time10");
        int time12 = jsonObject.getInt("time12");
        int time14 = jsonObject.getInt("time14");
        int time16 = jsonObject.getInt("time16");
        int time18 = jsonObject.getInt("time18");
        int time20 = jsonObject.getInt("time20");
        int time22 = jsonObject.getInt("time22");
        int time24 = jsonObject.getInt("time24");

        list.add(time0);
        list.add(time2);
        list.add(time4);
        list.add(time6);
        list.add(time8);
        list.add(time10);
        list.add(time12);
        list.add(time14);
        list.add(time16);
        list.add(time18);
        list.add(time20);
        list.add(time22);
        list.add(time24);

        return list;
    }

    /**
     * @用户总活跃数曲线数据
     * @param jsonObject
     * @return
     */
    public static ArrayList user_active_z(JSONObject jsonObject){

        ArrayList list = new ArrayList();
        int z_time0 = jsonObject.getInt("z_time0");
        int z_time2 = jsonObject.getInt("z_time2");
        int z_time4 = jsonObject.getInt("z_time4");
        int z_time6 = jsonObject.getInt("z_time6");
        int z_time8 = jsonObject.getInt("z_time8");
        int z_time10 = jsonObject.getInt("z_time10");
        int z_time12 = jsonObject.getInt("z_time12");
        int z_time14 = jsonObject.getInt("z_time14");
        int z_time16 = jsonObject.getInt("z_time16");
        int z_time18 = jsonObject.getInt("z_time18");
        int z_time20 = jsonObject.getInt("z_time20");
        int z_time22 = jsonObject.getInt("z_time22");
        int z_time24 = jsonObject.getInt("z_time24");

        list.add(z_time0);
        list.add(z_time2);
        list.add(z_time4);
        list.add(z_time6);
        list.add(z_time8);
        list.add(z_time10);
        list.add(z_time12);
        list.add(z_time14);
        list.add(z_time16);
        list.add(z_time18);
        list.add(z_time20);
        list.add(z_time22);
        list.add(z_time24);

        return list;

    }

    /**
     *@用户日活跃数曲线数据
     * @param jsonObject
     * @return
     */
    public static ArrayList user_active_r(JSONObject jsonObject){

        ArrayList list = new ArrayList();
        int r_time0 = jsonObject.getInt("r_time0");
        int r_time2 = jsonObject.getInt("r_time2");
        int r_time4 = jsonObject.getInt("r_time4");
        int r_time6 = jsonObject.getInt("r_time6");
        int r_time8 = jsonObject.getInt("r_time8");
        int r_time10 = jsonObject.getInt("r_time10");
        int r_time12 = jsonObject.getInt("r_time12");
        int r_time14 = jsonObject.getInt("r_time14");
        int r_time16 = jsonObject.getInt("r_time16");
        int r_time18 = jsonObject.getInt("r_time18");
        int r_time20 = jsonObject.getInt("r_time20");
        int r_time22 = jsonObject.getInt("r_time22");
        int r_time24 = jsonObject.getInt("r_time24");

        list.add(r_time0);
        list.add(r_time2);
        list.add(r_time4);
        list.add(r_time6);
        list.add(r_time8);
        list.add(r_time10);
        list.add(r_time12);
        list.add(r_time14);
        list.add(r_time16);
        list.add(r_time18);
        list.add(r_time20);
        list.add(r_time22);
        list.add(r_time24);

        return list;

    }

    /**
     * @用户停留时间曲线数据
     * @param jsonObject
     * @return
     */
    public static ArrayList user_stop(JSONObject jsonObject){
        ArrayList list = new ArrayList();
        double stop_time0 = jsonObject.getDouble("stop_time0");
        double stop_time1 = jsonObject.getDouble("stop_time1");
        double stop_time5 = jsonObject.getDouble("stop_time5");
        double stop_time10 = jsonObject.getDouble("stop_time10");
        double stop_time20 = jsonObject.getDouble("stop_time20");
        double stop_time30 = jsonObject.getDouble("stop_time30");
        double stop_time60 = jsonObject.getDouble("stop_time60");

        list.add(stop_time0);
        list.add(stop_time1);
        list.add(stop_time5);
        list.add(stop_time10);
        list.add(stop_time20);
        list.add(stop_time30);
        list.add(stop_time60);

        return list;
    }
}
