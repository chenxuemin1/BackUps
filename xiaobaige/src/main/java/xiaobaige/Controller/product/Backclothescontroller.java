package xiaobaige.Controller.product;

import xiaobaige.Pojo.product.Backclothestable;
import xiaobaige.Pojo.query.Coupontable;
import xiaobaige.Pojo.record.Recordtable;
import xiaobaige.Service.product.Backclothseservice;
import xiaobaige.Service.query.Couponservice;
import xiaobaige.Service.record.Recordservice;
import xiaobaige.Service.subsidy.Subsidyservice;
import xiaobaige.Service.system.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 收衣表
 * @author xm@c.com    Administrator
 * @date 2018/4/16 0016 下午 6:59
 */

@Controller
@RequestMapping("backclothes")
public class Backclothescontroller {

//    protected Log log = LogFactory.getLog("backclothes");
    @Autowired
    private Backclothseservice backclothseservice;

    @Autowired
    private Couponservice couponservice;

    @Autowired
    private Userservice userservice;

    @Autowired
    private Recordservice recordservice;

    @Autowired
    private Subsidyservice subsidyservice;

    /**
     * @新增
     * @param backclothes
     * @return
     */

    @RequestMapping(value = "/add")
    public String add(Backclothestable backclothes, HttpServletRequest request){



        Recordtable record = new Recordtable();
        String openid = (String)request.getSession().getAttribute("openid");
        Map<String,Object> result = new HashMap<String,Object>();
        backclothes.setOpenid(openid);
        backclothes.setBack_loca("广东省 深圳市 南山区");
        backclothes.setBack_state(0);
        backclothseservice.add(backclothes);
        userservice.edit3(openid);

//        创建优惠券
        Coupontable coupontable = new Coupontable();
        coupontable.setOpenid(openid);
        coupontable.setExpress_number(backclothes.getExpress_number());
        coupontable.setCoupon_state(0);
        couponservice.add(coupontable);

//        添加反赠
        subsidyservice.add(backclothes.getExpress_number());


        if(8<=(userservice.jz_number(openid))&&(userservice.jz_number(openid))<15){
            userservice.edit_grade(1,openid);
            if((userservice.jz_number(openid))==8){
                record.setTitle("等级提升通知");
                record.setFirst_grade("普会");
                record.setNow_grade("青铜");
                record.setOpenid(openid);
                recordservice.add(record);
            }

        }else if (15<=(userservice.jz_number(openid))&&(userservice.jz_number(openid))<25){
            userservice.edit_grade(2,openid);
            if((userservice.jz_number(openid))==15){
                record.setTitle("等级提升通知");
                record.setFirst_grade("青铜");
                record.setNow_grade("白银");
                record.setOpenid(openid);
                recordservice.add(record);
            }

        }else if (25<=(userservice.jz_number(openid))&&(userservice.jz_number(openid))<35){
            userservice.edit_grade(3,openid);
            if((userservice.jz_number(openid))==25){
                record.setTitle("等级提升通知");
                record.setFirst_grade("白银");
                record.setNow_grade("黄金");
                record.setOpenid(openid);
                recordservice.add(record);
            }

        }else if (35<=(userservice.jz_number(openid))){
            userservice.edit_grade(4,openid);
            if((userservice.jz_number(openid))==35){
                record.setTitle("等级提升通知");
                record.setFirst_grade("黄金");
                record.setNow_grade("铂金");
                record.setOpenid(openid);
                recordservice.add(record);
            }

        }else {
            return "index";
        }
        result.put("code",200);
        result.put("message","添加成功");
        //backclothseservice.findall();
        return "index";
    }

    /**
     * @删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/del")
    public Map<String,Object> del(int id){
        Map<String,Object> result = new HashMap<String,Object>();
        backclothseservice.del(id);
        result.put("code",200);
        result.put("message","删除成功");
        return result;

    }

    /**
     * @修改
     * @param backclothes
     * @return
     */
    @RequestMapping(value = "/edit")
    public Map<String,Object> edit(Backclothestable backclothes){
        Map<String,Object> result = new HashMap<String,Object>();
        backclothseservice.edit(backclothes);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    /**
     * @快递信息补充
     * @param backclothes
     * @return
     */
    @RequestMapping(value = "/edit2")
    public Map<String,Object> edit2(Backclothestable backclothes){
        Map<String,Object> result = new HashMap<String,Object>();
        backclothseservice.edit2(backclothes);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    /**
     * @查询所有
     * @return
     */
    @RequestMapping(value = "/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("finds",backclothseservice.findall());
        return result;
    }

    /**
     * @查询指定数据
     * @param id
     * @return
     */
    @RequestMapping(value = "/sel")
    public Map<String, Object> sel(int id){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("sels",backclothseservice.sel(id));
        return result;
    }


}
