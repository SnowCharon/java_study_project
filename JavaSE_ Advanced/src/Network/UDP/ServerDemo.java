package Network.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.UDP
 * @Date 2022/6/21 15:11
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.找码头--参数表示是从该端口接收数据
        DatagramSocket datagramSocket = new DatagramSocket(10000);
        //2.创建新箱子
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        //3.接受礼物
        System.out.println("--------接收前----------");
        datagramSocket.receive(datagramPacket);
        System.out.println("--------接收后----------");
        //4.从新箱子获取礼物
//        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        System.out.println(new String(/*data*/ bytes,0,length));

        //5.拿完走人
        datagramSocket.close();
    }
}
