package ThreadStudy.MyCountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.MyCountDownLatch
 * @Date 2022/6/20 17:42
 **/
public class MotherThread extends Thread{
    private CountDownLatch count;

    public MotherThread(CountDownLatch count) {
        this.count = count;
    }

    @Override
    public void run() {
        //1.等待
        try {
            count.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2.收拾
        System.out.println("收拾碗筷");
    }
}
