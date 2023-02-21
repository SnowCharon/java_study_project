package ThreadStudy.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.blockingqueue
 * @Date 2022/6/18 14:13
 **/
public class Foodie extends Thread{
    private final ArrayBlockingQueue<String> arrayBlockingQueue;

    public Foodie(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = arrayBlockingQueue.take();
                System.out.println("吃了一个" + take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
