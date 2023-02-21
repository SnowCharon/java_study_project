package Network.TCP.Project;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.Project
 * @Date 2022/6/22 16:48
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("启动客户端成功~~");
        //1.连接与服务端的Socket管道连接
        Socket socket = new Socket("127.0.0.1",9000);

        //创建独立线程专门负责客户端的读消息（因为服务端随时会发消息过来）
        new ClientReaderThread(socket).start();

        //2.从Socket管道中得到一个字节输出流管道
        OutputStream outputStream = socket.getOutputStream();
        //3.把低级得输出流包装秤高级得打印流
        PrintStream printStream = new PrintStream(outputStream);
        //4.发送数据
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请说：");
            String message = scanner.nextLine();
            printStream.println(message);
            printStream.flush();
        }
    }
}
