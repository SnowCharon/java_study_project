package ThreadStudy.MyCountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.MyCountDownLatch
 * @Date 2022/6/20 17:42
 **/
public class Demo {
    public static void main(String[] args) {
        //1.创建CountDownLatch对象，需要传递四个线程
        //在底层创建计数器，在这个对象中就是参数3
        //每调用一次 countDown 方法，计数器就减一
        //当计数器归零，会自动唤醒 await 线程
        CountDownLatch count = new CountDownLatch(3);
        //2.创建四个线程并开启他们
        MotherThread motherThread = new MotherThread(count);
        motherThread.start();

        ChildrenThread1 childrenThread1 = new ChildrenThread1(count);
        childrenThread1.setName("小明");
        ChildrenThread2 childrenThread2 = new ChildrenThread2(count);
        childrenThread2.setName("小华");
        ChildrenThread3 childrenThread3 = new ChildrenThread3(count);
        childrenThread3.setName("小光");

        childrenThread1.start();
        childrenThread2.start();
        childrenThread3.start();
    }
}
