package IO.ObjectOperationFlow;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ObjectOperationFlow
 * @Date 2022/6/10 21:27
 **/
public class Property {
    /*
    把对象以字节形式写入本地文件，直接打开文件，人读不懂，需要再次用对象操作流读到内存中

        注意，每个被对象操作流操作的对象需要实现Serializable接口，它仅仅用于表示这个类是对象操作流操作的类

        InvalidClassException——————序列号不一致问题
        手动创建序列号解决问题

        对象操作流操作的对象中：transient   修饰的变量不被序列化

        ObjectInputStream  操作的文件，在读取时，当读取不到对象是，返回EOFException错误，应该用try...catch捕获
     */

}
