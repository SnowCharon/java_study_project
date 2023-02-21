package ThreadStudy.mythreadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.mythreadpool
 * @Date 2022/6/18 21:34
 **/
public class Demo3 {
    public static void main(String[] args) {
//    参数一：核心线程数量
//    参数二：最大线程数
//    参数三：空闲线程最大存活时间
//    参数四：时间单位
//    参数五：任务队列
//    参数六：创建线程工厂
//    参数七：任务的拒绝策略
//                    --什么时候拒绝：当提交的任务 > 池子中的最大线程数 + 阻塞队列的容量
//                    --如何拒绝：见
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,5,2, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        System.out.println(pool.getPoolSize());

        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        System.out.println(pool.getPoolSize());

        pool.shutdown();
    }
}
