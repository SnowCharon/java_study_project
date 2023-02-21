package ThreadStudy.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.blockingqueue
 * @Date 2022/6/18 14:06
 **/
public class Demo {
    //阻塞队列基本写法
    public static void main(String[] args) throws InterruptedException {
        //创建阻塞队列对象，并表示大小为1
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        //存储元素
        arrayBlockingQueue.put("汉堡");

        //取元素
        System.out.println(arrayBlockingQueue.take());
        //存一个只能取一个，取完了就只能等待
        System.out.println(arrayBlockingQueue.take());
        System.out.println("程序结束");
    }
}
