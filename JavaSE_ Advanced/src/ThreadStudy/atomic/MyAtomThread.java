package ThreadStudy.atomic;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.atomic
 * @Date 2022/6/19 20:46
 **/
public class MyAtomThread implements Runnable{
    private volatile int count = 0;
    private final Object lock = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //1.从共享数据中读取数据到本线程栈中
            //2.修改本线程栈中变量副本的值
            //3.会把本线程栈中变量副本的值赋值给共享数据
            synchronized (lock) {
                count++;
                System.out.println("已经送了" + count + "个冰淇淋！");
            }
        }
    }
}
