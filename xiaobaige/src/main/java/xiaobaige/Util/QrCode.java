package xiaobaige.Util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;
import static xiaobaige.Util.MyTask.ACCESS_TOKEN;

//import static xiaobaige.Util.Access_token.ACCESS_TOKEN;


/**
 * @author xm@c.com    Administrator
 * @date 2018/4/21 0021 下午 10:16
 */
public class QrCode {


    /**
     * @生成永久二维码
     * @param scene_id
     * @return
     */
    public static String getQrcode(String scene_id){

        //获取数据的地址（微信提供）
        String url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+ACCESS_TOKEN;

        String jsonstr = "{\"action_name\":\"QR_LIMIT_SCENE\",\"action_info\":{\"scene\":{\"scene_id\":"+scene_id+"}}}";

        String respones = sendPost(jsonstr,url);

//        String Qrcodeloca = downloadFile(respones);

        return respones.toString();
    }

    /**
     * @生成临时二维码
     * @param scene_id
     * @return
     */
    public static String getTempQrcode(String scene_id){

        String url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+ACCESS_TOKEN;

        String jsonstr = "{\"expire_seconds\":\"2592000\",\"action_name\":\"QR_SCENE\",\"action_info\":{\"scene\":{\"scene_id\":"+scene_id+"}}}";

//        ticket
        String respones = sendPost(jsonstr,url);

        out.println(respones);
//        String Qrcodeloca = downloadFile(respones,);

        return respones.toString();


    }

    /**
     * @post请求
     * @param param
     * @param url
     * @return
     */
    public static String sendPost(String param, String url) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            // out = new PrintWriter(conn.getOutputStream());
            out = new PrintWriter(new OutputStreamWriter(
                    conn.getOutputStream(), "utf-8"));
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url
     *            发送请求的URL
     *
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url ;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定URL发送GET方法的请求
     *
     * @param openid
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet1(String openid) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="+ACCESS_TOKEN+"&openid="+openid+"&lang=zh_CN";
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }


    /**
     * @根据URL下载文件，
     * @param urlString 文件网址
     * @param filePath 存文件的本地地址
     * @return
     */
    public static String downloadFile(String urlString, String filePath){

//        String fileName = urlString.substring(urlString.lastIndexOf("/"));
        File files = new File(filePath);
        if(!files.exists()){
            files.mkdirs();
        }
        // 构造URL
        URL url;
        try {
            url = new URL(urlString);
            // 打开连接
            URLConnection con;
            try {
                con = url.openConnection();
                // 输入流
                InputStream is = con.getInputStream();

                long date = System.currentTimeMillis();

                String fileName = "qrcode"+date+".jpg";

                File file = new File(filePath,fileName);
//
//                FileOutputStream out = new FileOutputStream(file);
//
//                int i = 0;
//
//                while ((i=is.read()) !=-1){
//                    out.write(i);
//                }
//
//                is.close();
//                out.close();

                // 1K的数据缓冲
                byte[] bs = new byte[1024];
                // 读取到的数据长度
                int len;
                // 输出的文件流
                OutputStream os = new FileOutputStream(file);
                // 开始读取
                while ((len = is.read(bs)) != -1) {
                    os.write(bs, 0, len);
                }
                // 完毕，关闭所有链接
                os.close();
                is.close();
                //返回文件的存放地址
                return filePath+fileName;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "false";
            }

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }

    }

    /**
     * @将json格式的String转成map数据
     * @param strjson
     * @return
     */
    public static Map<String,String> strtomap(String strjson){

        Map<String,String> jsonmap = null;
        try{
            Gson gson = new Gson();
            jsonmap = gson.fromJson(strjson,new TypeToken<Map<String,String>>(){}.getType());
        }catch (JsonSyntaxException e){
            e.printStackTrace();
        }
        return jsonmap;
    }
}
