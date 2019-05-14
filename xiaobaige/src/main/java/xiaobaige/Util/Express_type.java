package xiaobaige.Util;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/14 0014 下午 4:08
 */
public class Express_type {

    String shippercode;

    String express_state;

    public String exp_type(String i){

        switch (i){
            case "韵达快递":
               shippercode="YD";
               break;

            case "顺丰快递":
                shippercode="SF";
                break;

            case "申通快递":
                shippercode="STO";
                break;

            case "中通快递":
                shippercode="ZTO";
                break;

            case "圆通快递":
                shippercode="YTO";
                break;

            case "邮政快递":
                shippercode="YZPY";
                break;

            case "EMS":
                shippercode="EMS";
                break;

            case "京东物流":
                shippercode="JD";
                break;

            case "优速快递":
                shippercode="UC";
                break;

            case "德邦":
                shippercode="DBL";
                break;

            case "快捷快递":
                shippercode="FAST";
                break;

            case "宅寄送":
                shippercode="ZJS";
                break;

            case "TNT快递":
                shippercode="TNT";
                break;

            case "UPS":
                shippercode="UPS";
                break;

            case "DHL":
                shippercode="DHL";
                break;
        }
        return shippercode;
    }

    public String exp_state(int state){
        switch (state){
            case 0:
                express_state="无状态";
                break;

            case 2:
                express_state="在途中";
                break;

            case 3:
                express_state="已签收";
                break;

            case 4:
                express_state="问题件";
                break;
        }
        return express_state;
    }

}
