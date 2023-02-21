package ThreadStudy.LockStudy;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.Project
 * @Date 2022/6/16 20:26
 **/
public class MyRunnable implements Runnable {
    private static int ticket = 100;


    @Override
    public void run() {
        while (true) {
            if ("一号窗口".equals(Thread.currentThread().getName())) {
                //同步方法实现
                boolean result = synchronizedMethod();
                if (result) {
                    break;
                }
            }
            if ("一号窗口".equals(Thread.currentThread().getName())) {
                //同步代码块
                synchronized (MyRunnable.class){
                    if (ticket == 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "在买票，还剩下" + ticket + "张票。");
                    }
                }
            }
        }
    }

    private synchronized static boolean synchronizedMethod() {
        if (ticket == 0) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "在买票，还剩下" + ticket + "张票。");
            return false;
        }
    }
}
