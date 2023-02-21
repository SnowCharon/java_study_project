package IO.File;

import java.io.*;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.ByteStream
 * @Date 2022/6/10 13:53
 **/
public class FileBasic {
    public static void main(String[] args) throws FileNotFoundException {
        //文件操作的方法
        File file = new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\ByteStream\\b.txt");

        //获取文件名
        System.out.println(file.getName());
        System.out.println(file.lastModified());

        File fileList = new File(".");
        File[] files = fileList.listFiles();
        for (File path : files) {
            System.out.println(path);
        }

    }
}
