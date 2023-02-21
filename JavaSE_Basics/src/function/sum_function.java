package function;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File function
 * @date 2022/5/15  16:13
 **/
public class sum_function {
    public static void main(String[] args) {
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个n值：");
        int n =sc.nextInt();

        System.out.println(sum(n));
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

