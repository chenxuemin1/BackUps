package xiaobaige.Controller.product;

import xiaobaige.Pojo.product.Producttable;
import xiaobaige.Service.product.Productservice;
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

@RequestMapping("/product")
public class Productcontroller {

    @Autowired
    private Productservice productservice;

    /**
     * @新增
     * @param product
     * @return
     */
    @RequestMapping("/add")
    public Map<String,Object> add(Producttable product, MultipartFile logoFile){
        Map<String,Object> result = new HashMap<String,Object>();
        productservice.add(product,logoFile);
        result.put("code","200");
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
        productservice.del(id);
        return result;
    }

    /**
     * @修改
     * @param product
     * @return
     */
    @RequestMapping("/edit")
    public Map<String,Object> edit(Producttable product, MultipartFile logoFile){
        Map<String,Object> result = new HashMap<String,Object>();
        productservice.edit(product,logoFile);
        return result;
    }

    /**
     * @查询所有
     * @return
     */
    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        productservice.findall();
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
        productservice.sel(id);
        return result;
    }
}
