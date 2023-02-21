package API.APIDate;

import java.util.Calendar;
import java.util.Date;

/**
 * @author MOYU
 * @File JavaSE_Study-API_date
 * @Date 2022/5/29 15:48
 **/
public class APICalendar {
    public static void main(String[] args) {
        /*
        日历可变，更改了就都改了
         */
        //1.拿到系统日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //2.获取日历信息
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int days = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        //3.修改日期中某个字段
        /*cal.set(Calendar.YEAR,2029);
        System.out.println(cal);*/

        //4.为某个字段加减
        cal.add(Calendar.DAY_OF_YEAR,25);
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        //5.拿到日期对象
        Date d = cal.getTime();
        System.out.println(d);

        //6.拿到时间毫秒值（fw）
        long time = cal.getTimeInMillis();
        System.out.println(time);
    }
}
