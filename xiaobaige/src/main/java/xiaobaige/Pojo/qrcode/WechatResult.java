package xiaobaige.Pojo.qrcode;

import xiaobaige.Pojo.Entity;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/21 0021 下午 5:21
 */
public class WechatResult extends Entity {

    private static final int NEWSMSG = 1;//图文信息

    private boolean success;

    private int type;

    private Object object;

    private String msg;

    public static int getNEWSMSG() {
        return NEWSMSG;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
