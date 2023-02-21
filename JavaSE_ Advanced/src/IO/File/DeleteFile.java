package IO.File;

import java.io.File;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.File
 * @Date 2022/6/8 18:58
 **/
public class DeleteFile {
    public static void main(String[] args) {
   /* delete注意：
        1.不走回收站，直接删除
        2.删除文件，直接删除，删除文件夹，只能删除空的文件夹
        3.如果删除有内容的文件夹只能先进文件夹把内容删除
        */
//       method1();
        File file = new File("C:\\Users\\zhuxuanyu\\Desktop\\test");
        boolean result = file.delete();
        System.out.println(result);


    }

    private static void method1() {
        File file = new File("C:\\Users\\zhuxuanyu\\Desktop\\a.txt");
        boolean result = file.delete();
        System.out.println(result);
    }
}
