package IO.File;

import java.io.File;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.File
 * @Date 2022/6/8 17:07
 **/
public class Creat {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
    }

    private static void method3() {
        //        创建多级文件夹,在不存在的文件夹中创建文件夹
        //        直接调用mkdirs，mkdir没用
        File file = new File("C:\\Users\\zhuxuanyu\\Desktop\\test\\aaa\\bbb");
        boolean result = file.mkdirs();
        System.out.println(result);
    }

    private static void method2() {
        //        创建一个单级文件夹
        //        不管有没有后缀，创建的都是文件夹，即使有后缀也是文件夹的名字
        File file = new File("C:\\Users\\zhuxuanyu\\Desktop\\test");
        /*
        File file = new File("E:\\Desktop\\test\\aaa\\bbb");
        创建失败，因为bbb不存在，aaa也不存在，不能在不存在的文件夹中创建文件夹
        * */
        boolean result = file.mkdir();
        System.out.println(result);
    }


    private static void method1() {
        //        创建新的空的文件
        File file1 = new File("C:\\Users\\zhuxuanyu\\Desktop\\b.mp4");
        boolean result = false;
        try {
            //如果创建成功返回true,创建失败返回false
            //createNewFile方法不管调用者有没有文件名后缀，都会创建
            result = file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
