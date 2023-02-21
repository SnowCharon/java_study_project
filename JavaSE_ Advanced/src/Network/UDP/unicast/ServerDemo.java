package Network.UDP.unicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.UDP.project
 * @Date 2022/6/21 15:42
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建载体
        DatagramSocket datagramSocket = new DatagramSocket(8090);

        while (true) {
            //2.创建箱子
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);

            //3.接收数据
            datagramSocket.receive(datagramPacket);

            //4.获取数据
            int length = datagramPacket.getLength();
            System.out.println(new String(bytes,0,length));
        }

        //5.关闭载体
      //  datagramSocket.close();
    }
}
