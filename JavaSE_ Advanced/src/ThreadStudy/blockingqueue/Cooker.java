package ThreadStudy.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.blockingqueue
 * @Date 2022/6/18 14:13
 **/
public class Cooker extends Thread {
    private final ArrayBlockingQueue<String> arrayBlockingQueue;

    public Cooker(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                arrayBlockingQueue.put("汉堡包");
                System.out.println("厨师做了一个汉堡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
