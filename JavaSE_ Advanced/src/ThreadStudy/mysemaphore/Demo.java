package ThreadStudy.mysemaphore;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.MySemaphore
 * @Date 2022/6/20 17:55
 **/
public class Demo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        //一张通行证一个线程可以执行
        for (int i = 0; i < 100; i++) {
            new Thread(myRunnable).start();
        }
    }
}
