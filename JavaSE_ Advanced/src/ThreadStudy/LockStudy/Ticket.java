package ThreadStudy.LockStudy;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.Project
 * @Date 2022/6/16 19:35
 **/
public class Ticket implements Runnable {
    //总票数数目
    private int ticket = 100;
    private final Object object = new Object();
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //加锁，保护多线程安全，但是效率降低
            //小括号任意一个锁对象，加锁的线程必须是同一个锁对象
//           synchronized (object){
            //手动上锁
            try {
                lock.lock();
                if (ticket == 0) {
                    break;
                } else {
                    ticket--;
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "在买票，还剩下" + ticket + "张票。");
                }
// }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //手动释放锁
                lock.unlock();
            }
        }
    }
}
