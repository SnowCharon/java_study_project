package Network.UDP.broadcast;

import java.io.IOException;
import java.net.*;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.UDP.broadcast
 * @Date 2022/6/21 19:29
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        String s = "Hello,广播";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 10000;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,address,port);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
