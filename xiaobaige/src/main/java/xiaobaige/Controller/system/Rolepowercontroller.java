package xiaobaige.Controller.system;

import xiaobaige.Service.system.Rolepowerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 5:28
 */

@Controller

@RequestMapping("/rolepower")
public class Rolepowercontroller {
    @Autowired
    private Rolepowerservice rolepowerservice;

    @RequestMapping("/add")
    public Map<String,Object> add(int roleid, int[] powerids){
        Map<String,Object> result = new HashMap<String,Object>();
        rolepowerservice.add(roleid, powerids);
        result.put("code",200);
        result.put("message","添加成功");
        return result;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(int powerid){
        Map<String,Object> result = new HashMap<String,Object>();
        rolepowerservice.del(powerid);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    @RequestMapping("/edit")
    public Map<String,Object> edit(int roleid){
        Map<String,Object> result = new HashMap<String,Object>();
        rolepowerservice.edit(roleid);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("finds",rolepowerservice.findall());
        return result;
    }

    @RequestMapping("/sel")
    public Map<String,Object> sel(int powerid){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("sels",rolepowerservice.sel(powerid));
        return result;
    }
}
