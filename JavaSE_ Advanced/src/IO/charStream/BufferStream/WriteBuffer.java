package IO.charStream.BufferStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.charStream.BufferStream
 * @Date 2022/6/10 17:53
 **/
public class WriteBuffer {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\charStream\\b.txt"));

        //写出数据
        bw.write(97);
        char[] chars = {98,99,102,111};
        bw.write(chars);
        //换行
        bw.newLine();
        bw.write(chars,0,3);
        bw.write("好耶！");

        bw.close();
    }
}
