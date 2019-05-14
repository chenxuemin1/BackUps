package xiaobaige.Controller.product;

import xiaobaige.Pojo.product.Clothestable;
import xiaobaige.Service.product.Clothesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/16 0016 下午 6:59
 */

@Controller

@RequestMapping("/clothes")
public class Clothescontroller {

    @Autowired
    private Clothesservice clothesservice;

    /**
     * @新增
     * @param clothes
     * @return
     */
    @RequestMapping("/add")
    public Map<String,Object> add(Clothestable clothes, MultipartFile logoFile){
        Map<String,Object> result = new HashMap<String,Object>();
        clothesservice.add(clothes,logoFile);
        result.put("code",200);
        result.put("message","添加成功");
        return result;
    }

    /**
     * @删除
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public Map<String,Object> del(int id){
        Map<String,Object> result = new HashMap<String,Object>();
        clothesservice.del(id);
        result.put("code",200);
        result.put("message","删除成功");
        return result;
    }

    /**
     * @修改
     * @param clothes
     * @return
     */
    @RequestMapping("/edit")
    public Map<String,Object> edit(Clothestable clothes, MultipartFile logoFile){
        Map<String,Object> result = new HashMap<String,Object>();
        clothesservice.edit(clothes,logoFile);
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
        result.put("finds",clothesservice.findall());
        result.put("code",200);
        return result;
    }

    /**
     * @查询指定数据
     * @param id
     * @return
     */
    @RequestMapping("/sel")
    public Map<String,Object> sel(int id){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("sels",clothesservice.sel(id));
        result.put("code",200);
        return result;
    }

}
