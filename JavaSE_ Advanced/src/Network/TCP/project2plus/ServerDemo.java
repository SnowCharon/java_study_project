package Network.TCP.project2plus;

import Network.TCP.project2.ThreadSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.project2
 * @Date 2022/6/21 20:52
 **/
public class ServerDemo {
    //    private static int i;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                3,  //核心线程数量
                10, //线程池总数量
                60, //临时线程空闲时间
                TimeUnit.SECONDS, //临时线程空闲时间的单位
                new ArrayBlockingQueue<>(5), //阻塞队列
                Executors.defaultThreadFactory(), //创建线程方法
                new ThreadPoolExecutor.AbortPolicy() //拒绝线程的处理方式
        );

        while (true) {
            Socket accept = serverSocket.accept();

            //多线程处理

            ThreadSocket threadSocket = new ThreadSocket(accept);
//            new Thread(threadSocket).start();
            poolExecutor.submit(threadSocket);
        }
        //serverSocket.close();
    }
}
