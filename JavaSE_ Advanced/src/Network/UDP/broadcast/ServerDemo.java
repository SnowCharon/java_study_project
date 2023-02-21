package Network.UDP.broadcast;

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
        DatagramSocket datagramSocket = new DatagramSocket(10000);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024],1024);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        System.out.println(new String(data,0,length));

        datagramSocket.close();
    }
}
