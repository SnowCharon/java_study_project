package ThreadStudy;

import java.util.concurrent.FutureTask;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/16 16:10
 **/
public class Demo {
    public static void main(String[] args) {
        MyCallable myCallable1 = new MyCallable();
        FutureTask<String> futureTask1 = new FutureTask<>(myCallable1);
        Thread t1 = new Thread(futureTask1);
        t1.setName("坦克");
        MyCallable myCallable2 = new MyCallable();
        FutureTask<String> futureTask2 = new FutureTask<>(myCallable2);
        Thread t2 = new Thread(futureTask2);
        t2.setName("飞机");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //默认优先级5，最大1，最小10
        t2.setPriority(2);
        t1.setDaemon(true);
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
    }
}
