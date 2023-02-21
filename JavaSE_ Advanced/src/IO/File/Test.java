package IO.File;

import java.io.File;
import java.io.IOException;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.File
 * @Date 2022/6/8 19:40
 **/
public class Test {
    public static void main(String[] args) {
        //要求：在模块下的aaa文件夹创建a.txt
        File file = new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\File\\aaa");
        if (!file.exists()){
            //如果不存在则创建出来
            file.mkdirs();
        }
        File newFile = new File(file,"a.txt");
        try {
            boolean result = newFile.createNewFile();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
