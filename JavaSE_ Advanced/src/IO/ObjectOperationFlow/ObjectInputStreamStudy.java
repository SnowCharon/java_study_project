package IO.ObjectOperationFlow;

import java.io.*;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ObjectOperationFlow
 * @Date 2022/6/10 21:29
 **/
public class ObjectInputStreamStudy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new  ObjectInputStream(new FileInputStream("E:\\Desktop\\注册.txt"));

        User o = (User) objectInputStream.readObject();

        System.out.println(o);

        objectInputStream.close();

    }
}
