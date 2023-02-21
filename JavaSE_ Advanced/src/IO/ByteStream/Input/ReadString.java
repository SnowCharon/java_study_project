package IO.ByteStream.Input;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream.Input
 * @Date 2022/6/10 0:53
 **/
public class ReadString {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("E:\\Desktop\\a.txt");

        //循环读取多个字节
        int read;
        while ((read = file.read()) != -1){
            System.out.print((char)read);
        }

        file.close();
    }
}
