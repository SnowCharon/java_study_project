package Network.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP
 * @Date 2022/6/21 19:57
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //客户端即发送端,需要有接收端，否则报错
        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1",10000);

        //2.获取一个IO流开始写数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello World!".getBytes(StandardCharsets.UTF_8));

        //3.释放资源
        outputStream.close();
        socket.close();
    }
}
