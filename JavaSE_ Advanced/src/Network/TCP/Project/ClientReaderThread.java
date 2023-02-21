package Network.TCP.Project;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.Project
 * @Date 2022/6/22 16:54
 **/
public class ClientReaderThread extends Thread{
    private Socket accept;

    public ClientReaderThread(Socket accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        try {
            //3.字节流输入
            InputStream inputStream = accept.getInputStream();
            //4.把低级的字节输入流包装成高级的缓冲字符输入流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            //5.按照行读取
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println("发来了消息：" + line);
            }
        } catch (Exception e) {
            System.out.println("服务端把你踢出群聊");
        }
    }
}
