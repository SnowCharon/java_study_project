package ThreadStudy.ThreadFunction;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/15 21:12
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        //代码就是线程开启后执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开启了" + i);
        }
    }
}
