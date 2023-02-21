package API.APIDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MOYU
 * @File JavaSE_Study-API_date
 * @Date 2022/5/29 15:27
 **/
public class Try {
    public static void main(String[] args) throws ParseException {
        //1.定义小贾和小皮的下单时间为字符串
        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";
        String startTime = "2020年11月11日 0:0:0";
        String endTime = "2020年11月11日 0:10:0";

        //2.将二者都转化为毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        Date d1 = sdf.parse(jia);
        Date d2 = sdf.parse(pi);
        Date st = sdf.parse(startTime);
        Date et = sdf.parse(endTime);

        //3.判断是否超时
        System.out.print("小贾是否成功：");
       if(d1.after(st) && d1.before(et)){
           System.out.println("成功秒杀！");
       }else{
           System.out.println("秒杀失败！");
       }

        System.out.print("小皮是否成功：");
        if(d2.after(st) && d2.before(et)){
            System.out.println("成功秒杀！");
        }else{
            System.out.println("秒杀失败！");
        }

    }

}
