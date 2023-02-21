package Network.TCP;

/**
 * @author MOYU
 * @File JavaSE_Study-Network.TCP
 * @Date 2022/6/21 20:12
 **/
public class Property {
    /*
    1.accept是阻塞的
    2.必须先执行服务端，在执行客户端，否则客户端报错
    3.客户端创建对象并连接服务器，此时是通过三次握手协议保证跟服务器之间的连接
    4.针对客服端，是往外写数据，OutputStream
      针对服务端，是往里读数据，InputStream
    5.read也是阻塞的
    6.关流时，往服务器写入一个结束标记的动作
    7.最后一步断开，通过四次挥手协议保证连接终止
     */
}
