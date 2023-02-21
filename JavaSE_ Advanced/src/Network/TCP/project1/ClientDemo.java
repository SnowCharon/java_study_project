package Network.TCP.project1;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.project1
 * @Date 2022/6/21 20:25
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello".getBytes(StandardCharsets.UTF_8));
//       outputStream.close(); --直接在这里关闭会导致整个Socket用不了
        //仅仅关闭输出流，并写一个结束标记，对Socket无影响
        socket.shutdownOutput();

        /*InputStream inputStream = socket.getInputStream();
        int b;
        while ((b = inputStream.read()) != -1) {
            System.out.print((char) b);
        }*/

        //用字符流防汉字转码成乱码
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();
        outputStream.close();
        socket.close();
    }
}
