package IO.ObjectOperationFlow;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ObjectOperationFlow
 * @Date 2022/6/10 21:29
 **/
public class ObjectOutputStreamStudy {
    public static void main(String[] args) throws IOException {
        User user = new User("zhuxuanyu","M1281409960");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\Desktop\\注册.txt"));

        objectOutputStream.writeObject(user);

        objectOutputStream.close();
    }
}
