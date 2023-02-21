package ThreadStudy.myvolatilebylockway;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/18 22:18
 **/
public class BoyThread extends Thread{
    @Override
    public void run() {
        synchronized (Money.lock) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Money.money = 90000;
    }
}
