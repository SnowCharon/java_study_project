package IO.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream
 * @Date 2022/6/10 1:08
 **/
public class CopyArray {
    public static void main(String[] args) throws IOException {
        //将数据源的数据存储在一个字节数组中
        FileInputStream fileInputStream = new FileInputStream("E:\\Desktop\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\ByteStream\\a.txt");

        byte[] bytes = new byte[1024];
        //length表示从数据源读取到的字符数量
        int length;

        while ((length = fileInputStream.read(bytes)) != -1){
            System.out.print(length);
            fileOutputStream.write(bytes,0,length);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
