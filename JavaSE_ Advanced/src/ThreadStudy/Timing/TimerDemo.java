package ThreadStudy.Timing;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.Timing
 * @Date 2022/6/26 15:28
 **/
public class TimerDemo {
    public static void main(String[] args) {
        /*
        当程序出现异常，虚拟机会把程序干掉，因为是一个线程在处理，就会导致整个程序挂掉
        所以Timer定时器有问题
         */
        //1.创建Timer定时器--定时器本身就是单线程
        Timer timer = new Timer();
        //调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "在执行！");
                try {
                    //因为是同一个线程在处理，所以当这里睡觉，导致下面无法执行，等睡完了才能开始
                    //影响别人的执行
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },3000,2000);

        //调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "在执行！");
            }
        },3000,2000);
    }
}
