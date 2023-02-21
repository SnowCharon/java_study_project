package IO.charStream.InputAndOutput;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.charStream
 * @Date 2022/6/10 17:03
 **/
public class WriteBasic {
    public static void main(String[] args) throws IOException {
        /*
        1.创建字符输出流的对象：
                        a.如果文件不存在则创建，但父级路径得存在
                        b.如果文件存在则清空
                        c.追加就在文件路径后面加true
         */
        FileWriter fw = new FileWriter("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\charStream\\a.txt",true);

        /*
        2.写数据:
                a.int类型整数直接转化为字符型
                b.写出字符串数据，是把字符串本身原样输出
         */

       //一次写一个
        fw.write(97);
        fw.write(98);
        fw.write(99);

       //一次写入一个字符数组
        char[] chars1 = {97,98,99,100,101};
        fw.write(chars1);

       //一次写入一个字符数组的一部分
        char[] chars2 = {97,98,99,100,101};
        fw.write(chars2,0,3);

        fw.write("\n");

       //写入一个字符串
        String line1 = "我爱中国！";
        fw.write(line1);

        //写入一个字符串的一部分
        String line2 = "我爱中国！";
        fw.write(line2,0,4);

        //3.关闭文件，释放资源
        fw.close();
    }
}
