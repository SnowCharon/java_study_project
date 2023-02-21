package Network.UDP;

import java.io.IOException;
import java.net.*;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.UDP
 * @Date 2022/6/21 14:55
 **/
public class ClientDemo {
    /**
     * 发送端
     * @param args 鬼
     * @throws IOException 抛出异常
     */
    public static void main(String[] args) throws IOException {
        //1.找码头
        DatagramSocket datagramSocket = new DatagramSocket();

        //2.打包礼物
//      DatagramPacket(byte buf[]--要发的数据, int offset, int length--数据长度, InetAddress address--接收端地址, int port--端口号)
        String s = "送给福建舰的礼物！";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10000;
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,address,port);

        //3.由码头发送包裹
        datagramSocket.send(datagramPacket);

        //4.付钱走人--释放资源
        datagramSocket.close();
    }
}
