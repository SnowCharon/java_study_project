package Unit3Branch;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 17:42
 **/
public class Reverse {
    //倒序输出
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s1 = String.valueOf(num);
        StringBuffer  SB = new StringBuffer(s1);
        String s2 = String.valueOf(SB.reverse());
        if(s1.equals(s2)){
            //回文数，即左向右读和右向左读一样
            System.out.println(num + " is a palindrome.");
        }else{
            System.out.println(num + " is not a palindrome.");
        }

    }
}
