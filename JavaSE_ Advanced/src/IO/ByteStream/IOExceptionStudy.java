package IO.ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream
 * @Date 2022/6/9 10:04
 **/
public class IOExceptionStudy {
    public static void main(String[] args) {
//      try...catch...finally操作，try，catch之后的finally一定执行

        FileOutputStream file = null;
        try {
            file = new FileOutputStream("E:\\Desktop\\b.txt");
            file.write(98);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
