package IO.ObjectOperationFlow;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ObjectOperationFlow
 * @Date 2022/6/10 22:16
 **/
public class User implements Serializable {
    /*
    serialVersionUID  序列号，若过自己没生成，JVM会自动根据类的信息自动·计算出一个，
    问题： 如果类的信息被修改，JVM会在算出一个，导致本地文件保存的UID和再次算出的UID不符合

    解决方法：1.每次修改javabean(对象)后，重新对象输出流操作，使UID一致
            2.自己创建UID序列号，不用JVM创建就好了
     */
    @Serial
    private static final long serialVersionUID = -1413435151830185965L;
    /*
        如果想要类的对象被序列化---即可以被对象操作流操作，那么这个类必须实现一个接口   Serializable
        Serializable接口是一个标记性接口，啥都没有，仅仅用来进行标记类，表示该类可以被对象操作流操作
         */
    private String name;
    //transient   修饰的变量不被序列化
    private  String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
