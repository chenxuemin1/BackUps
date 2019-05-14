package xiaobaige.Controller.system;

import xiaobaige.Service.system.Powerplayservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 5:29
 */

@Controller

@RequestMapping("/powerplay")
public class Powerplaycontroller {

    @Autowired
    private Powerplayservice powerplayservice;

    @RequestMapping("/add")
    public Map<String,Object> add(int powerid, int[] playids){
        Map<String,Object> result = new HashMap<String,Object>();
        powerplayservice.add(powerid, playids);
        result.put("code",200);
        result.put("message","添加成功");
        return result;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(int playid){
        Map<String,Object> result = new HashMap<String,Object>();
        powerplayservice.del(playid);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    @RequestMapping("/edit")
    public Map<String,Object> edit(int powerid){
        Map<String,Object> result = new HashMap<String,Object>();
        powerplayservice.edit(powerid);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",powerplayservice.findall());
        return result;
    }

    @RequestMapping("/sel")
    public Map<String,Object> sel(int powerid){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",powerplayservice.sel(powerid));
        return result;
    }
}
