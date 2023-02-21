package API.APIDate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MOYU
 * @File JavaSE_Study-API_date
 * @Date 2022/5/29 15:11
 **/
public class APISimpleDateFormat {
    public static void main(String[] args) {
        //1.日期对象
        Date d = new Date();
        System.out.println(d);

        //2.格式化这个日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        //3.格式化日期对象为字符串
        String rs = sdf.format(d);
        System.out.println(rs);
        //4.格式化时间毫秒值
        long time1 = System.currentTimeMillis() + 121 * 1000 ;
        String rs1 = sdf.format(time1);
        System.out.println(rs1);
    }
}
