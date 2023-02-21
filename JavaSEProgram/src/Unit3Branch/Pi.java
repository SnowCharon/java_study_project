package Unit3Branch;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 15:28
 **/
public class Pi {
    public static void main(String[] args) {
        int π,a,n,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        fun(a);
        fun(b);
    }

    private static void fun(int n) {
        int flag = 1;
        double sum = 0;
        for (int i = 1; i <= n; i++,i++) {
            sum += 1.0 / i * flag;
            flag = -flag;
        }
        System.out.println(sum);
    }
}
