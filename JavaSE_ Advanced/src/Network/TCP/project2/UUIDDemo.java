package Network.TCP.project2;

import java.util.UUID;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP.project2
 * @Date 2022/6/21 21:14
 **/
public class UUIDDemo {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString().replace("-","");
        System.out.println(s);
    }
}
