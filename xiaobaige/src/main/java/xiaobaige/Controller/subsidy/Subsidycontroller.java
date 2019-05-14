package xiaobaige.Controller.subsidy;

import xiaobaige.Pojo.subsidy.Subsidytable;
import xiaobaige.Service.subsidy.Subsidyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 5:07
 */

@Controller

@RequestMapping("/subsidy")
public class Subsidycontroller {

    @Autowired
    private Subsidyservice subsidyservice;

    @RequestMapping("/add")
    public Map<String,Object> add(Subsidytable subsidy){
        Map<String,Object> result = new HashMap<String,Object>();
//        subsidyservice.add(subsidy);
        result.put("code",200);
        result.put("message","添加成功");
        return result;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(int express_number){
        Map<String,Object> result = new HashMap<String,Object>();
        subsidyservice.del(express_number);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    @RequestMapping("/edit")
    public Map<String,Object> edit(Subsidytable subsidy){
        Map<String,Object> result = new HashMap<String,Object>();
        subsidyservice.edit(subsidy);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",subsidyservice.findall());
        return result;
    }

    @RequestMapping("/sel")
    public Map<String,Object> sel(int express_number){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",subsidyservice.sel(express_number));
        return result;
    }

    @RequestMapping("/type")
    public Map<String, Object> type(int subsidycode){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",subsidyservice.type(subsidycode));
        return result;
    }
}
