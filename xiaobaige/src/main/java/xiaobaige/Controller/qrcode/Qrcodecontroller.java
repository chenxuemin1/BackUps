package xiaobaige.Controller.qrcode;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/21 0021 下午 2:58
 */

//@Controller
//@RequestMapping("qrcode")
//public class Qrcodecontroller  {
//
//    @Autowired
//    private Qrcodeservice qrcodeservice;
//
//    @PostMapping("createTempTicket")
//    public Map<String, Object> createTempTicket(Map<String, Object> params){
//        Map<String, Object> result = new HashMap<>();
//        String accessToken = "";
//        if(org.springframework.util.StringUtils.isEmpty(params.get("sceneId"))) {
//            result.put("code", -1);
//            result.put("msg", "参数为空");
//            return result;
//        } else {
//            try {
//                String ticket = qrcodeservice.createTempTicket(accessToken, 2592000, (int)params.get("sceneId"));
//                String url = qrcodeservice.showQrcode(accessToken, ticket);
//                result.put("code", 0);
//                result.put("msg", "生成临时二维码成功");
//                result.put("data", url);
//            } catch (Exception e) {
//                result.put("code", -1);
//                result.put("msg", "生成临时二维码失败");
//            }
//            return result;
//        }
//    }
//}
