package xiaobaige.Controller.stock;

import xiaobaige.Pojo.stock.Cleartable;
import xiaobaige.Service.stock.Clearservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 4:32
 */

@Controller

@RequestMapping("/clear")
public class Clearcontroller {

    @Autowired
    private Clearservice clearservice;

    @RequestMapping("/add")
    public Map<String,Object> add(Cleartable clear){
        Map<String,Object> result = new HashMap<String,Object>();
        clearservice.add(clear);
        result.put("code",200);
        result.put("message","添加成功");
        return result;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(String buyer){
        Map<String,Object> result = new HashMap<String,Object>();
        clearservice.del(buyer);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    @RequestMapping("/edit")
    public Map<String,Object> edit(Cleartable clear){
        Map<String,Object> result = new HashMap<String,Object>();
        clearservice.edit(clear);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",clearservice.findall());
        return result;
    }

    @RequestMapping("/sel")
    public Map<String,Object> sel(String buyer){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",clearservice.sel(buyer));
        return result;
    }

}
