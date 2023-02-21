package ThreadStudy.RunnableStudy;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/15 21:22
 **/
public class Realize {
    public static void main(String[] args) {
        //创建参数对象
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 =  new MyRunnable();
        //创建一个线程对象，并把参数传递给这个线程
        //线程起动后，执行的就是参数里面的run方法
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        thread1.start();
        thread2.start();
    }
}
