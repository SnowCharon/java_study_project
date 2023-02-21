package ThreadStudy.Timing;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.Timing
 * @Date 2022/6/26 15:48
 **/
public class ScheduleDemo {
    public static void main(String[] args) {
        /*
        ScheduledExecutorService--基于线程池的定时器,某个任务的异常不会影响到其他线程
         */
        //1.创建ScheduledExecutorService
        ScheduledExecutorService poll = Executors.newScheduledThreadPool(3);

        //2.开启定时任务
        poll.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  AAA在执行");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 2, 2, TimeUnit.SECONDS);

        poll.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run () {
            System.out.println(Thread.currentThread().getName() + "  BBB在执行");
            System.out.println(10 / 0);
        }
    },2,2,TimeUnit.SECONDS);

        poll.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run () {
            System.out.println(Thread.currentThread().getName() + "  CCC在执行");
        }
    },0,2,TimeUnit.SECONDS);
}
}
