package function;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File function
 * @date 2022/5/15  16:21
 **/
public class Fibonacci_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = Fib(n);
        System.out.println(sum);
    }

    public static int Fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return Fib(n- 1) + Fib(n-2);
        }
    }
}

