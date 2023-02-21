package IO.charStream.InputAndOutput;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.charStream
 * @Date 2022/6/10 17:23
 **/
public class ReadBasic {
    public static void main(String[] args) throws IOException {
        //读文件
        FileReader file = new FileReader("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\charStream\\b.txt");

     /*  int ch;
       while ((ch = file.read()) != -1){
           System.out.print((char)ch);
       }*/

    /*    char[] chars = new char[1024];
        int len;
        while ((len = file.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }*/



        file.close();
    }
}
