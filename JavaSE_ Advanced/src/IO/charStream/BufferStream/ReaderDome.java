package IO.charStream.BufferStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.charStream.BufferStream
 * @Date 2022/6/10 17:47
 **/
public class ReaderDome {
    /*
    同样不能直接传文件，只能传字符输入/输出流
     */
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\charStream\\a.txt"));

        //读取数据
       /* char[] chars = new char[1024];
        int length;
        while ((length = br.read(chars)) != -1){
            System.out.println(new String(chars,0,length));
        }*/

        //读不到数据就返回null，而直接读取读不到返回-1
        String line1 = br.readLine();
        String line2 = br.readLine();
        String line3 = br.readLine();

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        br.close();
    }
}
