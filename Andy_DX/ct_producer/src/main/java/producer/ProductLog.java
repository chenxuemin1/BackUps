package producer;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Andy
 */
public class ProductLog {
    /**
     *起始时间、结束时间
     */
    private String startTime = "2018-01-01";
    private String endTime = "2018-12-31";

    /**
     * 用于存放电话号码 和 电话号码+姓名
     */
    private List<String> phoneList = new ArrayList<>();
    private Map<String, String> phoneNameMap = new HashMap<>();

    public void initPhone(){
        phoneList.add("17078388295");
        phoneList.add("13980337439");
        phoneList.add("14575535933");
        phoneList.add("19902496992");
        phoneList.add("18549641558");
        phoneList.add("17005930322");
        phoneList.add("18468618874");
        phoneList.add("18576581848");
        phoneList.add("15978226424");
        phoneList.add("15542823911");
        phoneList.add("17526304161");
        phoneList.add("15422018558");
        phoneList.add("17269452013");
        phoneList.add("17764278604");
        phoneList.add("15711910344");
        phoneList.add("15714728273");
        phoneList.add("16061028454");
        phoneList.add("16264433631");
        phoneList.add("17601615878");
        phoneList.add("15897468949");

        phoneNameMap.put("17078388295", "李雁");
        phoneNameMap.put("13980337439", "卫艺");
        phoneNameMap.put("14575535933", "仰莉");
        phoneNameMap.put("19902496992", "陶欣悦");
        phoneNameMap.put("18549641558", "施梅梅");
        phoneNameMap.put("17005930322", "金虹霖");
        phoneNameMap.put("18468618874", "魏明艳");
        phoneNameMap.put("18576581848", "华贞");
        phoneNameMap.put("15978226424", "华啟倩");
        phoneNameMap.put("15542823911", "仲采绿");
        phoneNameMap.put("17526304161", "卫丹");
        phoneNameMap.put("15422018558", "戚丽红");
        phoneNameMap.put("17269452013", "何翠柔");
        phoneNameMap.put("17764278604", "钱溶艳");
        phoneNameMap.put("15711910344", "钱琳");
        phoneNameMap.put("15714728273", "缪静欣");
        phoneNameMap.put("16061028454", "焦秋菊");
        phoneNameMap.put("16264433631", "吕访琴");
        phoneNameMap.put("17601615878", "沈丹");
        phoneNameMap.put("15897468949", "褚美丽");
    }

    /**
     * 数据形式：17526304161,17764278604,2018-09-09 04:51:15,0043
     * 数据形式对应字段名：caller,callee,buildTime,duration
     * @return
     */
    public String product(){
        //主叫、被叫电话号
        String caller = null;
        String callee = null;

        //主叫、被叫姓名
        String callerName = null;
        String calleeName = null;

        //取得主叫号码
        int callerIndex = (int) (Math.random() * phoneList.size());
        caller = phoneList.get(callerIndex);
        callerName = phoneNameMap.get(caller);

        while (true){
            //取得被叫号码
            int calleeIndex = (int) (Math.random() * phoneList.size());
            callee = phoneList.get(calleeIndex);
            calleeName = phoneNameMap.get(callee);
            if (!caller.equals(callee)) {
                break;
            }
        }

        //第三个参数:随机通话建立时间
        String buildTime = randomBuildTime(startTime, endTime);
        //第四个参数:0000
        DecimalFormat df = new DecimalFormat("0000");
        String duration = df.format((int) (30 * 60 * Math.random()));

        StringBuilder sb = new StringBuilder();
        sb.append(caller + ",").append(callee + ",").append(buildTime + ",").append(duration);
        return sb.toString();
    }
    /**
     * 时间形式:2018-01-18 22:38:51
     *
     */
    private String randomBuildTime(String startTime, String endTime) {
        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf1.parse(startTime);
            Date endDate = sdf1.parse(endTime);

            if (endDate.getTime() <= startDate.getTime()) {
                return null;
            }

            //随机通话建立时间得Long型
            long randomTS = startDate.getTime() + (long) ((endDate.getTime() - startDate.getTime()) * Math.random());
            Date resultDate = new Date(randomTS);
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String reultTimeString = sdf2.format(resultDate);
            return reultTimeString;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 写数据到文件中
     * @param filePath
     */
    public void writeLog(String filePath){
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath, true));
            while (true){
                Thread.sleep(500);
                String log = product();
                System.out.println(log);
                osw.write(log + "\n");
                //手动刷新
                osw.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //输出路径
        //args = new String[]{"C:\\Users\\杨钦振\\Desktop\\电信项目\\0126-电信项目(一)\\calllog.csv"};

        if(args == null || args.length<=0){
            System.out.println("没这个路径");
            return;
        }
        ProductLog productLog = new ProductLog();
        productLog.initPhone();
        productLog.writeLog(args[0]);
    }
}
