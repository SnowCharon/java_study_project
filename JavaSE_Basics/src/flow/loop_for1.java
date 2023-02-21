package flow;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File flow
 * @date 2022/5/14  16:35
 **/
public class loop_for1 {
    public static void main(String[] args) {
        int i,sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("累加求和，从一开始，请输入终止数：");
        int x = sc.nextInt();

        for(i = 0;i < x;i++){
            sum+=i;
        }
        System.out.println("累加结果为：" + sum);

       /* for (int i = 0;i < 3;i++){
            System.out.println("Hello World!");
        }*/

    }
}
