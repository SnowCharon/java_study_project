package Network.TCP.project2;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.project2
 * @Date 2022/6/21 21:21
 **/
public class ThreadSocket implements Runnable {
    private Socket accept;

    public ThreadSocket(Socket accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //网络中的流
            BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());
            //从网络写入本地
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\Network\\TCP\\project2\\" + UUID.randomUUID().toString().replace("-", "") + ".jpg"));
//            i++;

            int b;
            while ((b = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(b);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bufferedWriter.write("上传成功");
            bufferedWriter.newLine();
            bufferedWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
