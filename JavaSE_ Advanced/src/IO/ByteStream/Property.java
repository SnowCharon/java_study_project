package IO.ByteStream;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.InputStream
 * @Date 2022/6/8 21:41
 **/
public class Property {
    /*
    字节流：操作所有类型的文件：包括音频视频图片等
            1.创建字节流输出对象：
                        没有就创建
                        有在第二个参数写上true
            2.写入数据
                        换行： win：\r\n  linux:\n  mac:\r
                        可以写一个字节，一次写一个字节数组的数据局，一次写一个字节数组的部分数据
                        可以通过"字符串“.getBytes(StandardCharsets.UTF_8)来写入字符串
            3.释放资源
                        file.close();

      字节缓冲流：
                字节缓冲输出流：BufferOutputStream
                字节缓冲输入流：BufferInputStream
      字节缓冲流构造方法需要字节流，而不是具体文件或者路径
      因为字节缓冲仅仅是提供缓冲流，真正的读写数据还得靠基本的字节流对象操作

      使用字节流读取文本文件是因为他每次只能读取一个字节的数据，而编码表对字符的编码是多个字节

     */
}
