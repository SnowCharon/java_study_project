package ThreadStudy;

import java.util.concurrent.Callable;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/16 16:09
 **/
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
        return "线程执行完毕";
    }
}
