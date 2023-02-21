package IO.File;

import java.io.File;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.File
 * @Date 2022/6/8 19:50
 **/
public class
DeleteFiles {
    public static void main(String[] args) {
        //delete只能删除文件和空文件夹
        //先删除里面在删除外面
        File file = new File("E:\\Desktop\\test");
        deleteDir(file);
    }

    private static void deleteDir(File file) {
        //delete只能删除文件和空文件夹，先删除里面
        //递归方法删除：可以解决所有文件夹和递归相结合的题目
        //1.进入
        File[] files = file.listFiles();
        for (File him : files) {
            System.out.println(him);
        }
        //2.遍历
        for (File path : files) {
            if(path.isFile()){
                //3.判断，如果遍历到的对象是一个文件，直接删除
                path.delete();
            }else {
                //4.判断：递归
                //参数一定要是file中的文件夹对象
                deleteDir(path);
            }
        }
        //最后删除外面的文件夹
        boolean result = file.delete();
        System.out.println(result);
    }
}
