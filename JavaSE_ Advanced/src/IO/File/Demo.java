package IO.File;

import java.io.File;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.File
 * @Date 2022/6/8 16:41
 **/
public class Demo {
    public static void main(String[] args) {
//      method1();
//      method2();
//        method3();

//        绝对路径从盘符开始
//        相对路径是相对于当前项目下的路径

//        绝对路径不变
        File file = new File("E:\\Desktop\\a.txt");

//        当前项目下的a.txt
        File file1 = new File("a.txt");

//        当前模块下的a.txt
        File file2 = new File("JavaSE_Advanced\\a.txt");
    }

    private static void method3() {
        //        从父抽象路径和子路径名字符串创建新的File实例
        File file1 = new File("E:\\Desktop");
        String path = "a.txt";
        File file = new File(file1, path);
        System.out.println(file);
    }


    private static void method2() {
        //从父路径名字符串和子路径字符串创建新的File实例
        String path1 = "E:\\Desktop";
        String path2 = "a.txt";
        File file = new File(path1, path2);
        //E:\Desktop\a.txt
        System.out.println(file);
    }

    private static void method1() {
        // 通过将给定的路径名字符串转换为抽象路径来创建新的File实例
        String path = "E:\\Desktop\\a.txt";
        File file = new File(path);
    }
}

