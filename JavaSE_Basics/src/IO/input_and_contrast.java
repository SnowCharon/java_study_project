package IO;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File IO
 * @date 2022/5/14  11:11
 **/
public class input_and_contrast {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();


        //输出数据
        System.out.println("最大值："+((a>b)?((a>c?a:c)):(b>c)?b:c));

    }
}
