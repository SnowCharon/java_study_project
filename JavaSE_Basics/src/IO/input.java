package IO;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File IO
 * @date 2022/5/14  11:03
 **/

public class input {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        int x = sc.nextInt();

        //输出数据
        System.out.println("x:"+x);
    }
}
