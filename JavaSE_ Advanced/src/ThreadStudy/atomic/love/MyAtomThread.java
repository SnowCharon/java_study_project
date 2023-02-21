package ThreadStudy.atomic.love;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.atomic
 * @Date 2022/6/19 20:46
 **/
public class MyAtomThread implements Runnable{
        AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //1.从共享数据中读取数据到本线程栈中
            //2.修改本线程栈中变量副本的值
            //3.会把本线程栈中变量副本的值赋值给共享数据
            int count = atomicInteger.incrementAndGet();
                System.out.println("已经送了" + count + "个冰淇淋！");

        }
    }
}
