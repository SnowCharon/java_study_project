package classtry;

import java.util.Random;
import java.util.Scanner;

/**
 * @title: test
 * @Author 竹玄羽
 * @Date: 2022/9/19 19:55
 */
public class GuessNumber {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("给你一个1至100之间的整数,请猜测这个数");
        int realNumber = random.nextInt(100) + 1; //random.nextInt(100)是[0,100)中的随机整数
        int yourGuess = 0;
        System.out.print("输入您的猜测:");
        yourGuess = reader.nextInt();
        while (yourGuess != realNumber) //循环条件
        {
            if (yourGuess > realNumber)   //猜大了的条件代码
            {
                System.out.print("猜大了,再输入你的猜测:");
                yourGuess = reader.nextInt();
            } else if (yourGuess < realNumber) //猜小了的条件代码
            {
                System.out.print("猜小了,再输入你的猜测:");
                yourGuess = reader.nextInt();
            }
        }
        System.out.println("猜对了!");
    }
}
