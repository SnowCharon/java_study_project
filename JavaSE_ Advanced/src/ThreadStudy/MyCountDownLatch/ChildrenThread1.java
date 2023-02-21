package ThreadStudy.MyCountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.MyCountDownLatch
 * @Date 2022/6/20 17:43
 **/
public class ChildrenThread1 extends Thread{
    private CountDownLatch count;

    public ChildrenThread1(CountDownLatch count) {
        this.count = count;
    }
    @Override
    public void run() {
        //1.吃饺子
        for (int i = 0; i <= 10; i++) {
            System.out.println(getName() + "在吃第" + i + "个饺子");
        }
        //2.吃完说一声
        count.countDown();
    }
}
