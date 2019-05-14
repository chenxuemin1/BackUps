package xiaobaige.Controller.system;

import xiaobaige.Service.system.Roleuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/14 0014 下午 5:27
 */

@Controller

@RequestMapping("/roleusere")
public class Roleusercontroller {

    @Autowired
    private Roleuserservice roleuserservice;

    @RequestMapping("/add")
    public Map<String,Object> add(int roleid, int[] userids){
        Map<String,Object> result = new HashMap<String,Object>();
        roleuserservice.add(roleid, userids);
        result.put("code",200);
        result.put("message","添加成功");
        return result;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(int userid){
        Map<String,Object> result = new HashMap<String,Object>();
        roleuserservice.del(userid);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    @RequestMapping("/edit")
    public Map<String,Object> edit(int userid){
        Map<String,Object> result = new HashMap<String,Object>();
        roleuserservice.edit(userid);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",roleuserservice.findall());
        return result;
    }

    @RequestMapping("/sel")
    public Map<String,Object> sel(int userid){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",roleuserservice.sel(userid));
        return result;
    }
}
