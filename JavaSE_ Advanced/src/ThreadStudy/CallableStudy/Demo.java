package ThreadStudy.CallableStudy;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.CallableStudy
 * @Date 2022/6/15 22:19
 **/
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启后执行里面的call方法
        MyCallable mc1 = new MyCallable();
        //可以获取线程执行完毕的结果，也可以作为参数传递给Thread对象
        FutureTask<String> ft1 = new FutureTask<>(mc1);
        //创建线程对象
        Thread thread1 = new Thread(ft1);

        MyCallable mc2 = new MyCallable();
        FutureTask<String> ft2 = new FutureTask<>(mc2);
        Thread thread2 = new Thread(ft2);

        //        不能在线程开启前获取线程运行结果
        //        如果线程没有结束，则get方法就会一直死等
        //        String s = ft1.get();

        //开启线程
        thread1.start();
        thread2.start();

        String s = ft1.get();
        System.out.println(s);
    }
}
