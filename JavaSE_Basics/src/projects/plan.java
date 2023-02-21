package projects;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File projects
 * @date 2022/5/15  20:07
 **/
public class plan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入飞机票原价：");
        double money = sc.nextDouble();
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        System.out.print("请输入仓位类型：");
        String type = sc.next();
        double price = calc(money,month,type);
        System.out.println("您的飞机票需要支付：" + price);
    }
//1.定义一个方法，形参（原价，月价，头等舱经济舱） 返回值为：double
    public static double calc(double money,int month,String type) {
        //2.判断旺季还是淡季
        if (month >= 5 && month <= 10) {
            //旺季
            switch (type) {
                case "经济舱":
                    money *= 0.85;
                    break;

                case "头等舱":
                    money *= 0.9;
                    break;

                default:
                    System.out.println("您输入的仓位不正确！");
                    money = -1;
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            //淡季
            switch (type) {
                case "经济舱":
                    money *= 0.65;
                    break;

                case "头等舱":
                    money *= 0.7;
                    break;

                default:
                    System.out.println("您输入的仓位不正确！");
                    money = -1;
            }
        }

        return money;
    }
}
