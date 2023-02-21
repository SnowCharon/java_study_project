package ThreadStudy.mythreadpool;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.mythreadpool
 * @Date 2022/6/18 21:39
 **/
public class MyRunnable extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "在执行了");
    }
}
