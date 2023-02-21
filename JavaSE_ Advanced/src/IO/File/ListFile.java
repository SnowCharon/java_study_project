package IO.File;

import java.io.File;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.File
 * @Date 2022/6/8 19:19
 **/
public class ListFile {
    public static void main(String[] args) {
        /*
        注意：
            1.当调用者是一个文件时：返回一个null
            2.当调用者是一个空文件夹时：返回一个长度为0的数组
            3.当调用者是一个有内容的文件夹：---返回文件夹下的所有
            4.当调用者是一个有权限才能进入的文件夹时：也返回一个null
         即：
            1.当调用者不存在或者是文件，或者文件夹有权限才能访问时，返回null
            2.当调用者是一个空文件夹，返回一个长度为0的数组
            3.当有内容则返回内容，包括隐藏内容
         */
        //listFiles返回路径下的所有文件和文件夹，存储在一个数组中
        //包括隐藏文件和隐藏文件夹
        File file = new File("E:\\Desktop\\test");
        File[] files = file.listFiles();
        System.out.println(files.length);
        for (File path : files) {
            System.out.println(path);
        }
    }
}
