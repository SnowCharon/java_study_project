package DateProject;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-DateProject
 * @Date 2022/6/7 10:23
 **/
public class CalendarTry {
    public static void main(String[] args) {
        //键盘录入任意年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

//        设置日历对象
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        //将三月往前推一天，就是二月
        c.add(Calendar.DATE,-1);

        //获取这天输出即可
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
}
