package Network.TCP.project2plus;

import java.io.*;
import java.net.Socket;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.project2
 * @Date 2022/6/21 20:46
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        //本地流，读取本地文件
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\Network\\TCP\\project2\\girl.jpg"));

        //写到服务器---网络中的流
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        int b;
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }
        //给服务器结束标记
        socket.shutdownOutput();
        System.out.println("传输完成");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedInputStream.close();
        socket.close();
    }
}
