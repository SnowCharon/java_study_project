package Network.UDP.multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.UDP.multicast
 * @Date 2022/6/21 19:20
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket multicastSocket = new MulticastSocket(10000);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024],1024);

        //把当前计算机绑定一个组播地址，表示添加到这一组中
        multicastSocket.joinGroup(InetAddress.getByName("224.0.1.0"));

        multicastSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        System.out.println(new String(data,0,length));

        multicastSocket.close();
    }
}
