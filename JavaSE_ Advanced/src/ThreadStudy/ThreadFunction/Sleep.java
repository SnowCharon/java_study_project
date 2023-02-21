package ThreadStudy.ThreadFunction;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.ThreadFunction
 * @Date 2022/6/16 15:50
 **/
public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        /*System.out.println("睡觉前！");
        Thread.sleep(3000);
        System.out.println("睡醒了！");*/

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.start();
        t2.start();
    }
}
