package ThreadStudy.CallableStudy;

import java.util.concurrent.Callable;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.CallableStudy
 * @Date 2022/6/15 22:17
 **/
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("跟女孩表白的第" + i + "次！");
        }

        //返回值表示线程运行完毕之后的结果
        return "答应";
    }
}
