package IO.ByteStream.Input;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream.Input
 * @Date 2022/6/10 0:40
 **/
public class Read {
    public static void main(String[] args) throws IOException {
        //创建一个字节输入流对象
        //文件不存在会报错--找不到文件
        FileInputStream file = new FileInputStream("C:\\Users\\zhuxuanyu\\Desktop\\a.txt");

        //read:一次读取一个字节  -- 返回第一个字符的ASCII码
        //可以通过强制转换输出字符
        int read = file.read();
        System.out.println((char) read);

        //释放资源
        file.close();
    }
}
