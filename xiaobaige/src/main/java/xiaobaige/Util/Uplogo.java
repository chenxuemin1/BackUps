package xiaobaige.Util;

/**
 * @author xm@c.com    Administrator
 * @date 2018/5/15 0015 下午 2:07
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Uplogo {

    /**
     * 模拟form表单的形式 ，上传文件 以输出流的形式把文件写入到url中，然后用输入流来获取url的响应
     *
     * @param url 请求地址 form表单url地址
     * @param filePath 文件在服务器保存路径
     * @return String url的响应信息返回值
     * @throws IOException
     */
    public static String send(String url, String filePath) throws IOException {


        String result = null;


        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            throw new IOException("文件不存在");
        }


        /**
         * 第一部分
         */
        URL urlObj = new URL(url);
        // 连接
        HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();


        /**
         * 设置关键值
         */
        con.setRequestMethod("POST"); // 以Post方式提交表单，默认get方式
        con.setDoInput(true);
        con.setDoOutput(true);
        con.setUseCaches(false); // post方式不能使用缓存


        // 设置请求头信息
        con.setRequestProperty("Connection", "Keep-Alive");
        con.setRequestProperty("Charset", "UTF-8");


        // 设置边界
        String BOUNDARY = "----------" + System.currentTimeMillis();
        con.setRequestProperty("Content-Type", "multipart/form-data; boundary="+ BOUNDARY);


        // 请求正文信息


        // 第一部分：
        StringBuilder sb = new StringBuilder();
        sb.append("--"); // 必须多两道线
        sb.append(BOUNDARY);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data;name=\"file\";filename=\""
                + file.getName() + "\"\r\n");
        sb.append("Content-Type:application/octet-stream\r\n\r\n");


        byte[] head = sb.toString().getBytes("utf-8");


        // 获得输出流
        OutputStream out = new DataOutputStream(con.getOutputStream());
        // 输出表头
        out.write(head);


        // 文件正文部分
        // 把文件已流文件的方式 推入到url中
        DataInputStream in = new DataInputStream(new FileInputStream(file));
        int bytes = 0;
        byte[] bufferOut = new byte[1024];
        while ((bytes = in.read(bufferOut)) != -1) {
            out.write(bufferOut, 0, bytes);
        }
        in.close();


        // 结尾部分
        byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// 定义最后数据分隔线


        out.write(foot);


        out.flush();
        out.close();


        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = null;
        try {
            // 定义BufferedReader输入流来读取URL的响应
            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                buffer.append(line);
            }
            if(result==null){
                result = buffer.toString();
            }
        } catch (IOException e) {
            System.out.println("发送POST请求出现异常！" + e);
            e.printStackTrace();
            throw new IOException("数据读取异常");
        } finally {
            if(reader!=null){
                reader.close();
            }

        }

        JSONObject jsonObj = JSONObject.fromObject(result);
        String url1 = jsonObj.getString("url");
        return url1;
    }


//    public static void main(String[] args) throws IOException {
//        String filePath = "D:/tomcat/apache-tomcat-6.0.37/webapps/Allianture_frame/upload/test3_20140117094014814.jpg";
//        String sendUrl = "http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=yeQEu_OrXQanGC_G56BZ7IKJDCQCaO0ryDWKX2N2JDzGRGuiZACTGjsQXW-S-K1fgm_MViG_R5AwIEBhKKCNmUevg0H3ksfzlIfkFcP1y8g2st2LYwloL_iPqhedlT5_Z1zSM2mZSmu6cI54sayMPw&type=image";
//        String result = null;
//        FileUpload fileUpload = new FileUpload();
//        result = fileUpload.send(sendUrl, filePath);
//        System.out.println(result);
//
//    }
}
