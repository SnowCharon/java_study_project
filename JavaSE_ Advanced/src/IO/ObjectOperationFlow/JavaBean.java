package IO.ObjectOperationFlow;

import java.io.*;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ObjectOperationFlow
 * @Date 2022/6/11 0:40
 **/
public class JavaBean {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        method1();
        //反序列化
        method2();
    }

    private static void method2() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\ObjectOperationFlow\\注册.txt"));

        User o = (User) objectInputStream.readObject();

        System.out.println(o);

        objectInputStream.close();
    }

    private static void method1() throws IOException {
        User user = new User("竹玄羽", "M1281409960");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\ObjectOperationFlow\\注册.txt"));

        objectOutputStream.writeObject(user);

        objectOutputStream.close();
    }
}
