package flow;


import java.util.Random;

/**
 * @author 竹玄羽
 * @File flow
 * @date 2022/5/14  17:03
 **/
public class random_number {
    public static void main(String[] args) {
        //学会使用随机数类Random
        //1.导包
        //2.创建随机数对象
        Random r = new Random();
        //3.调用nextInt功能（方法）可以返回一个整型的随机数给你
        for (int i = 0;i < 20;i++) {
            int data = r.nextInt(10) + 1;
            System.out.println(data);
        }
    }
}
