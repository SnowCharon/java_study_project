package ThreadStudy.ThreadFunction;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/15 21:22
 **/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        //表示线程启动后执行的代码
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}
