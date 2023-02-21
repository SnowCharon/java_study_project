package ThreadStudy.LockStudy;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.Project
 * @Date 2022/6/16 20:35
 **/
public class Demo2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("一号窗口");
        t2.setName("二号窗口");

        t1.start();
        t2.start();
    }
}
