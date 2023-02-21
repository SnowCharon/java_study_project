package array;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File array
 * @date 2022/5/14  19:22
 **/
public class array_guess {
    public static void main(String[] args) {
        //定义数组  5个单元
        int[] data = new int[5];

        //动态生成随机数
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(20) + 1;
        }

        //用户猜测数输入
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.println("请输入一个1到20的数据：");
            int guessnumber = sc.nextInt();
            //遍历数组，猜测数据与数组数据比较
            for (int i = 0;i < data.length;i++){
                if (data[i] == guessnumber) {
                    System.out.println("恭喜你猜中了，666！");
                    break OUT;
                }
            }
            System.out.println("没猜对，小傻蛋！");
            }
        for (int i = 0;i < data.length;i++) {
            System.out.println(data[i] + "\t");
        }
    }
}
