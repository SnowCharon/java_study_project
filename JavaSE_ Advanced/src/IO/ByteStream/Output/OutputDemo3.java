package IO.ByteStream.Output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream
 * @Date 2022/6/9 8:48
 **/
public class OutputDemo3 {
    public static void main(String[] args) throws IOException {
        //append是续写开关，默认为false,若果是true续写
        FileOutputStream fos = new FileOutputStream("E:\\Desktop\\a.txt",true);

        fos.write(98);
        fos.write(97);
        //换行： win：\r\n  linux:\n  mac:\r
        fos.write("\r\n".getBytes());
        fos.write("我爱中国".getBytes(StandardCharsets.UTF_8));
        fos.write("\r\n".getBytes());
        fos.write(68);
        fos.write(75);


        fos.close();
    }
}
