package Network.UDP.multicast;

import java.io.IOException;
import java.net.*;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.UDP.multicast
 * @Date 2022/6/21 19:16
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String s = "组播学习！";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("224.0.1.0");
        int port = 10000;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,address,port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
