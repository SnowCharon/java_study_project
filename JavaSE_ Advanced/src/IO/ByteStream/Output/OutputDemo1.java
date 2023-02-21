package IO.ByteStream.Output;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream
 * @Date 2022/6/8 21:55
 **/
public class OutputDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输出流的对象---告诉虚拟机，要往哪个文件写数据
        //源码中自带三目判断   name != null ? new File(name) : null  如果不存在，自动创建
           FileOutputStream fos = new FileOutputStream("C:\\Users\\zhuxuanyu\\Desktop\\a.txt");
//        FileOutputStream fos = new FileOutputStream(new File("E:\\Desktop\\a.txt"));

        //2.写数据   写入整数实际上是ASCII码表对应的符号
        fos.write(97);

        //3.释放资源
        //如果不关闭文件，无法对文件手动删除，关闭后表示告诉操作系统，不再需要这个文件
        fos.close();
/*        while (true){

        }*/
    }
}
