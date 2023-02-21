package Network.TCP.project1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.project1
 * @Date 2022/6/21 20:27
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        int b;
        while ((b = inputStream.read()) != -1){
            System.out.print((char) b);
        }

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("我爱你！".getBytes(StandardCharsets.UTF_8));

        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
