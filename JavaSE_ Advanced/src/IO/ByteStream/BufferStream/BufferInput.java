package IO.ByteStream.BufferStream;

import java.io.*;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream.BufferStream
 * @Date 2022/6/10 13:36
 **/
public class BufferInput {
    public static void main(String[] args) throws IOException {
//        利用缓冲流拷贝文件
//        创建字节缓冲输入流
//        在底层创建长度8192的字节数组
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\ByteStream\\a.txt"));
//        创建字节缓冲输入流
//        在底层创建长度8192的字节数组
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\ByteStream\\b.txt"));

        int r;
        while ((r = bufferedInputStream.read()) != -1){
            bufferedOutputStream.write(r);
        }

        //方法的底层会把字节流关闭
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
