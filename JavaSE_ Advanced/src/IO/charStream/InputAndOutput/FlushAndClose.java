package IO.charStream.InputAndOutput;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.charStream
 * @Date 2022/6/10 17:18
 **/
public class FlushAndClose {
    public static void main(String[] args) throws IOException {
        //flush 刷新流：即将程序运行的缓存写入文件，刷新后还能继续写数据
        //close 关闭流：释放资源，关闭后无法写入

        FileWriter file = new FileWriter("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\charStream\\b.txt");

        file.write("好耶！");

        //如果不关闭文件，写入的数据会一直在缓存空间，而不会写入文件
        //file.close();

        //刷新缓存区，将缓存区数据写入文件，然后继续执行程序
        file.flush();

        file.write("好耶！");
        file.close();
    }
}
