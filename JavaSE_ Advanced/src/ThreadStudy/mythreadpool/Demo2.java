package ThreadStudy.mythreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.mythreadpool
 * @Date 2022/6/18 21:16
 **/
public class Demo2 {
    public static void main(String[] args) {
        //参数不是初始值，而是最大值
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor pool = (ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize());

            executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在执行了"));

            executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在执行了"));

            System.out.println(pool.getPoolSize());
            executorService.shutdown();
    }
}
