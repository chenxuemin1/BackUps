package xiaobaige.Controller.stock;

import xiaobaige.Pojo.stock.Couponclothestype;
import xiaobaige.Service.stock.Couponclothestypeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 4:50
 */
@Controller

@RequestMapping("/cctc")
public class Couponclothestypecontroller {

    @Autowired
    private Couponclothestypeservice couponclothestypeservice;

    @RequestMapping("/add")
    public Map<String,Object> add(Couponclothestype couponclothestype){
        Map<String,Object> result = new HashMap<String,Object>();
        couponclothestypeservice.add(couponclothestype);
        result.put("code",200);
        result.put("message","添加成功");
        return result;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(int id){
        Map<String,Object> result = new HashMap<String,Object>();
        couponclothestypeservice.del(id);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    @RequestMapping("/edit")
    public Map<String,Object> edit(Couponclothestype couponclothestype){
        Map<String,Object> result = new HashMap<String,Object>();
        couponclothestypeservice.edit(couponclothestype);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",couponclothestypeservice.findall());
        return result;
    }

    @RequestMapping("/sel")
    public Map<String,Object> sel(int id){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("message",couponclothestypeservice.sel(id));
        return result;
    }

}
