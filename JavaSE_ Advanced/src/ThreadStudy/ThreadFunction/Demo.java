package ThreadStudy.ThreadFunction;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/15 21:14
 * run():封装线程执行的代码，直接调用，相当于普通方法的调用，并没有开启线程
 * start():启动线程，然后由JVM调用线程的run()方法
 **/
public class Demo {
    public static void main(String[] args) {
        //创建线程对象
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

      /*  //仅仅表示对象调用run方法
        myThread1.run();
        myThread2.run();*/


        //开启一条线程
        myThread1.start();
        //开启另外一条线程
        myThread2.start();
    }
}
