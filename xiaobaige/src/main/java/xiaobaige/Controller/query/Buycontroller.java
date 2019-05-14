package xiaobaige.Controller.query;

import xiaobaige.Pojo.query.Buytable;
import xiaobaige.Service.query.Buyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


/**
 * 订单表
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 上午 11:23
 */
@Controller

@RequestMapping("/buy")
public class Buycontroller {

    @Autowired
    private Buyservice buyservice;

    /**
     * @新增
     * @param buy
     * @return
     */
    @RequestMapping("/add")
    public Map<String,Object> add(Buytable buy){
        Map<String,Object> result = new HashMap<String,Object>();
        buyservice.add(buy);
        result.put("code",200);
        result.put("message","添加成功");
        return result;
    }

    /**
     * @删除
     * @param express_number
     * @return
     */
    @RequestMapping("/del")
    public Map<String,Object> del(int express_number){
        Map<String,Object> result = new HashMap<String,Object>();
        buyservice.del(express_number);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    /**
     * @修改
     * @param buy
     * @return
     */
    @RequestMapping("/edit")
    public Map<String,Object> edit(Buytable buy){
        Map<String,Object> result = new HashMap<String,Object>();
        buyservice.edit(buy);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    /**
     * @查询所有
     * @return
     */
    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("finds",buyservice.findall());
        return result;
    }

    /**
     * @查询指定数据
     * @param express_number
     * @return
     */
    @RequestMapping("/sel")
    public Map<String,Object> sel(int express_number){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("sels",buyservice.sel(express_number));
        return result;
    }
}
