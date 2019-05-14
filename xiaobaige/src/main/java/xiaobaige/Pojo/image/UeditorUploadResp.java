package xiaobaige.Pojo.image;

/**
 * 图片编辑器
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:46
 */
public class UeditorUploadResp {
    private String state;
    private String url;
    private long size;
    private String original;
    private String title;
    private String type;

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public long getSize() {
        return size;
    }
    public void setSize(long size) {
        this.size = size;
    }
    public String getOriginal() {
        return original;
    }
    public void setOriginal(String original) {
        this.original = original;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
