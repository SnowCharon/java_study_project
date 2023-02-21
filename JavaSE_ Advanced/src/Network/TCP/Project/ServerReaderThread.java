package Network.TCP.Project;

import java.io.*;
import java.net.Socket;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.Project
 * @Date 2022/6/22 16:54
 **/
public class ServerReaderThread extends Thread{
    private Socket accept;

    public ServerReaderThread(Socket accept) {
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
                System.out.println(accept.getRemoteSocketAddress() + "发来了消息：" + line);
                //把这个消息转发给全部在线的socket管道
                sendMessageToAll(line);
            }
        } catch (Exception e) {
            System.out.println(accept.getRemoteSocketAddress() + "下线了！");
            ServerDemo.allOnlineSockets.remove(accept);
        }

    }

    private void sendMessageToAll(String line) throws Exception {
        for (Socket socket : ServerDemo.allOnlineSockets) {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            printStream.println(line);
            printStream.flush();
        }
    }
}
