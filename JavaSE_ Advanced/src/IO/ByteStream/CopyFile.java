package IO.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream
 * @Date 2022/6/10 0:57
 **/
public class CopyFile {
   /*
   复制文件：
            1.复制文件其实就是把文件从一个文件中（数据源）读取出来，写到另一个文件中（目的地）
            2.数据源-----读数据：FileInputStream
            3.目的地-----写数据：FileOutputStream
   */
    public static void main(String[] args) throws IOException {
        //读文件
        FileInputStream fileInputStream = new FileInputStream("E:\\Desktop\\a.txt");

        //写文件
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\ByteStream\\a.txt");

        int b;
        while ((b = fileInputStream.read()) != -1){
            System.out.print((char)b);
            fileOutputStream.write(b);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
