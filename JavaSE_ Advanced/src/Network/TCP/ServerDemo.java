package Network.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP
 * @Date 2022/6/21 20:03
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建服务器端的Socket对象
        ServerSocket serverSocket = new ServerSocket(10000);

        //2.监听客户端连接，返回一个Socket对象
        //如果没有客户端连接，就会阻塞
        System.out.println("等待客户端连接");
        Socket accept = serverSocket.accept();
        System.out.println("客户端连接成功");

        //3.获取输入流，读数据，并把数据显示在控制台上
        InputStream inputStream = accept.getInputStream();
        int number;
        while ((number = inputStream.read()) != -1){
            System.out.print((char) number);
        }

        //4.释放资源
        inputStream.close();
        serverSocket.close();
    }
}
