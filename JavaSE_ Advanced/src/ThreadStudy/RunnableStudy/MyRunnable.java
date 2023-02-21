package ThreadStudy.RunnableStudy;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/15 21:22
 **/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        //表示线程启动后执行的代码
        for (int i = 0; i < 100; i++) {
            //在实现接口的情况下，没有继承Thread类，因此需要使用方法时需要额外引入
            System.out.println("第二种方式实行多线程：" + Thread.currentThread().getName() + i);
        }
    }
}
