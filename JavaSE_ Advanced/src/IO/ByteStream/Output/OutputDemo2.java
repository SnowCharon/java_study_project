package IO.ByteStream.Output;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream
 * @Date 2022/6/8 23:06
 **/
public class OutputDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("E:\\Desktop\\a.txt");

        //写多个数据
        /*file.write(97);
        file.write(98);
        file.write(99);*/

        byte[] arr = {97,98,99};
        //写入一个数组的数据
        file.write(arr);
        //一次写一个字节数组的部分数据
        file.write(arr,1,2);

        file.close();
    }
}
