package API.APIDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MOYU
 * @File JavaSE_Study-API_date
 * @Date 2022/5/29 15:18
 **/
public class APISimpleDateFormat2 {
    public static void main(String[] args) throws ParseException {
        //解析字符串
        //1.把字符串拿到程序中
        String dateStr = "2022年5月29日 15:19:26";
        //2.解析成时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        Date d = sdf.parse(dateStr);
        //3.往后走2天14小时49分06秒
        long time = d.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;
        //4.格式化
        System.out.println(sdf.format(time));
    }
}
