package Network.UDP.unicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.UDP.project
 * @Date 2022/6/21 15:37
 **/
public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        //从键盘输入，故需要扫描器
        Scanner scanner = new Scanner(System.in);

        //1.创建发送载体
        DatagramSocket datagramSocket = new DatagramSocket();

        while (true) {
            //2.创建箱子装数据
            String s = scanner.nextLine();
            if ("886".equals(s)){
                break;
            }
            byte[] bytes = s.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 8090;
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,address,port);

            //3.发送
            datagramSocket.send(datagramPacket);
        }

        //4.关闭载体
        datagramSocket.close();
    }
}
