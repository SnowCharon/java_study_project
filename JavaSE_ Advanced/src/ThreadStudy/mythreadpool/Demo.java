package ThreadStudy.mythreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.thethreadpool
 * @Date 2022/6/18 21:04
 **/
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //1.创建一个默认线程池对象，池子中默认是空的，默认容纳int类型的最大值  executor-执行者
        //Executros---帮助创建线程池
        //ExecutorService---帮助我们控制线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        Thread.sleep(2000);

        //当睡眠时，第一个线程执行完毕，并且返回给线程池，所以在第二次输出时依然是已经存在的线程，而不用在创建一个线程
        //当没有睡眠，第一个线程来不及归还给线程池，因此又创建了第二个线程
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        executorService.shutdown();
    }
}
