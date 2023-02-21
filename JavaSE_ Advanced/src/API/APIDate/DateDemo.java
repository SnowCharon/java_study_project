package API.APIDate;

import java.util.Date;

/**
 * @author MOYU
 * @File JavaSE_Study-dateDemp
 * @Date 2022/5/29 15:00
 **/
public class DateDemo {
    public static void main(String[] args) {
        //1.创建一个时间对象
        Date d = new Date();
        System.out.println(d);

        //2.获取毫秒值
        long time = d.getTime();
        System.out.println(time);
        long time1 = System.currentTimeMillis();
        System.out.println(time1);

        System.out.println("============================");
        //1.得到当前时间
        Date d1 = new Date();
        System.out.println(d1);

        //2.时间加
        long time2 = System.currentTimeMillis();
        time2 += (60 * 60 + 121) * 1000;

        //3.把时间转置为当前日期
        Date d2 = new Date(time2);
        System.out.println(d2);

        Date d3 =new Date();
        d3.setTime(time2);
        System.out.println(d3);
    }
}
