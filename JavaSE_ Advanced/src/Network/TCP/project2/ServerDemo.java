package Network.TCP.project2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.project2
 * @Date 2022/6/21 20:52
 **/
public class ServerDemo {
//    private static int i;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        while (true) {
            Socket accept = serverSocket.accept();

            //多线程处理

            ThreadSocket threadSocket = new ThreadSocket(accept);
            new Thread(threadSocket).start();
        }
        //serverSocket.close();
    }
}
