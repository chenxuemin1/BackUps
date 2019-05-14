package xiaobaige.Controller.query;

import xiaobaige.Pojo.query.Coupontable;
import xiaobaige.Service.image.Imageservice;
import xiaobaige.Service.query.Couponservice;
import xiaobaige.Util.Card_json;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;
import static xiaobaige.Util.MyTask.ACCESS_TOKEN;

//import static xiaobaige.Util.Access_token.ACCESS_TOKEN;

/**
 * 优惠券表
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 2:45
 */

@Controller

public class Couponcontroller {

    protected Log log = LogFactory.getLog(Couponcontroller.class);
    @Autowired
    private Couponservice couponservice;

    @Autowired
    private Imageservice imageservice;

    @RequestMapping("/add")
    public Map<String,Object> add(Coupontable coupon){
        Map<String,Object> result = new HashMap<String,Object>();
        couponservice.add(coupon);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(long express_number){
        Map<String,Object> result = new HashMap<String,Object>();
        couponservice.del(express_number);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/edit")
    public Map<String,Object> edit(Coupontable coupon){
        Map<String,Object> result = new HashMap<String,Object>();
        couponservice.edit(coupon);
        result.put("code",200);
        result.put("message","修改成功");
        return result;
    }

    @RequestMapping("/findall")
    public Map<String,Object> findall(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("finds",couponservice.findall());
        return result;
    }

    @RequestMapping("/sel")
    public Map<String,Object> sel(int express_number){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("sels",couponservice.sel(express_number));
        return result;
    }

    @RequestMapping("/type")
    public Map<String,Object> type(int couponcode){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code",200);
        result.put("types",couponservice.type(couponcode));
        return result;
    }

    /**
     * @我的优惠券
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/my_yhq")
    public ModelAndView myyhq(Model model, HttpServletRequest request){
        String openid = (String)request.getSession().getAttribute("openid");
//        log.info(openid);
        List<Coupontable> coupon0 = couponservice.sel_coupon_0(openid);
        List<Coupontable> coupon1 = couponservice.sel_coupon_1(openid);

        if(coupon0==null||coupon0.isEmpty()){
            int message0 = 1;
            model.addAttribute("number0",message0);

        }
        if(coupon1==null||coupon1.isEmpty()){
            int message1 = 1;
            model.addAttribute("number1",message1);

        } else {

            model.addAttribute("coupon0", coupon0);
            model.addAttribute("coupon1", coupon1);
            return new ModelAndView("my_yhq");
        }

        return new ModelAndView("my_yhq");
    }

    @RequestMapping("/card")
    public String card(){

        String logourl = "http://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token="+ACCESS_TOKEN+"&type=image";
        String buyurl = "https://api.weixin.qq.com/card/paycell/set?access_token="+ACCESS_TOKEN;
        String hxurl = "https://api.weixin.qq.com/card/selfconsumecell/set?access_token="+ACCESS_TOKEN;

        String filepath = "C:/config_file/apache-tomcat-7.0.85/webapps/xiaobaige/resource/resource/img/YHQ.jpg";
//        门店url
        String shopurl = imageservice.uplogo(logourl, filepath);
        out.println(shopurl);
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONObject jsonObject4 = new JSONObject();
        JSONObject jsonObject5 = new JSONObject();
//        优惠券库存数量
        jsonObject1.put("quantity","卡券库存数量");
//        优惠券使用的时间类型
        jsonObject2.put("type","DATETYPE FIX_TERM");
//        优惠券的开始时间（0表示当天）
        jsonObject2.put("fixed_begin_term",0);
//        优惠券的有效时间（按天算）
        jsonObject2.put("fixed_term",20);
//        优惠券的统一过期时间（建议写23：59:59）按秒算
        jsonObject2.put("end_timestamp",15300000);


//        商户logo的url
        jsonObject3.put("logo_url",shopurl);
//        优惠券类型
        jsonObject3.put("card_type","CASH");
//        优惠券的码型
        jsonObject3.put("code_type","CODE_TYPE_QRCODE/CODE_TYPE_BARCODE");
//        商户名称
        jsonObject3.put("brand_name","小白鸽");
//        优惠券标题
        jsonObject3.put("title","5元代金券");
//        优惠券背景色
        jsonObject3.put("color","Color050");
//        优惠券使用提醒
        jsonObject3.put("notice","请出示二维码");
//        优惠券使用说明
        jsonObject3.put("description","不可与其他优惠券共享");
//        商品信息（库存数量）
        jsonObject3.put("sku",jsonObject1);
//        优惠券的使用日期
        jsonObject3.put("date_info",jsonObject2);
//        是否自定义优惠券的code码
        jsonObject3.put("use_custom_code",false);
//        代金券的使用门槛
        jsonObject3.put("least_cost",10);
//        代金券的优惠金额
        jsonObject3.put("reduce_cost",5);


//        需要提交的json数据
        jsonObject4.put("card",jsonObject3);
//        创建卡券
        String card_id = Card_json.post(jsonObject4);

        out.println("card_id："+card_id.toString());

        jsonObject5.put("card_id",card_id);
        jsonObject5.put("is_open",true);

//        买单接口
        String msg = Card_json.post1(jsonObject5,buyurl);
//        自助核销
        String msg1 = Card_json.post1(jsonObject5,hxurl);

        out.println("买单接口调用返回信息："+msg);

        out.println("自助核销接口调用返回信息："+msg1);

        return null;
    }

}
