package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author MOYU
 * @File JavaSE_Study-Network
 * @Date 2022/6/21 14:42
 **/
public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("moyu");

        String hostName = address.getHostName();
        System.out.println("主机名为" + hostName);

        String hostAddress = address.getHostAddress();
        System.out.println("IP为" + hostAddress);
    }
}
