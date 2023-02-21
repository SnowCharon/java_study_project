package Unit3Branch;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 19:05
 **/
public class SellerConsistency {
    /**
     * 泽勒一致性，用于计算某天是星期几
     * 公式是 H = (q + 26*(m + 1)/10 + k + k/4 + j/4 + 5*j)%7
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.获取用户输入
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        System.out.println("Enter a month:");
        int month = scanner.nextInt();

        System.out.println("Enter a day of the month:");
        int day = scanner.nextInt();

        //一月二月记作上一年的13,14月
        int tempMonth = month;
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        //世纪数
        int century = year / 100;
        //该世纪的第几年
        int yearOfCentury = year % 100;

        int weekDay = (day + 26 * (month + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
        switch (weekDay) {
            case 0 -> System.out.println("Day of the week is Saturday");
            case 1 -> System.out.println("Day of the week is Sunday");
            case 2 -> System.out.println("Day of the week is Monday");
            case 3 -> System.out.println("Day of the week is Tuesday");
            case 4 -> System.out.println("Day of the week is Wednesday");
            case 5 -> System.out.println("Day of the week is Thursday");
            case 6 -> System.out.println("Day of the week is Friday");
        }
    }
}
