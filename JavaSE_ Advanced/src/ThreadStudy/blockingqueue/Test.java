package ThreadStudy.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.blockingqueue
 * @Date 2022/6/18 14:10
 **/
public class Test {
    public static void main(String[] args) {
        //创建一个阻塞队列
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        //创建线程
        Cooker cooker = new Cooker(arrayBlockingQueue);
        Foodie foodie = new Foodie(arrayBlockingQueue);

        /*
        打印出来会出现两个连续做汉堡或者吃汉堡的情况，是因为put和take方法自带加锁
        但是输出的sout没有带锁，所以会看到连续输出的情况
         */

        cooker.start();
        foodie.start();
    }
}
