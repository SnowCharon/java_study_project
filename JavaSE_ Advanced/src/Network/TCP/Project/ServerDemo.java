package Network.TCP.Project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.Project
 * @Date 2022/6/22 16:55
 **/
public class ServerDemo {
    //定义一个静态List集合存储当前全部在线的socket管道
    public static List<Socket> allOnlineSockets = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动成功~~~");
        //1.端口注册
        ServerSocket serverSocket = new ServerSocket(9000);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                3,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        //循环接收客户端的socket管道请求
        while (true) {
            //2.接收客户端的socket管道连接请求
            Socket accept = serverSocket.accept();
            System.out.println(accept.getRemoteSocketAddress() + "上线了!");
            allOnlineSockets.add(accept);
            //3.创建一个独立线程来处理这个Socket管道
            poolExecutor.submit(new ServerReaderThread(accept));
        }
    }
}
