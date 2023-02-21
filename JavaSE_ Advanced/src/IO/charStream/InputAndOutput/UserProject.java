package IO.charStream.InputAndOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.charStream
 * @Date 2022/6/10 17:29
 **/
public class UserProject {
    public static void main(String[] args) throws IOException {
        //1.让用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名(不超过6位)：");
        String userName = scanner.next();
        System.out.println("请输入密码(不超过20位)：");
        String userPassword = scanner.next();

        //2.写入文件
        FileWriter fileWriter = new FileWriter("C:\\Users\\zhuxuanyu\\Desktop\\a.txt");
        FileReader fileReader = new FileReader("C:\\Users\\zhuxuanyu\\Desktop\\a.txt");

        fileWriter.write(userName + "\r\n");
        fileWriter.write(userPassword);

        //输入后刷新缓存
        fileWriter.flush();

        //读取数据向用户展示
        char[] chars = new char[20];
        int length;

        System.out.println("您的用户名和密码为：");
        while ((length = fileReader.read(chars)) != -1){
            System.out.println(new String(chars,0,length));
        }
      /*  System.out.println("您的密码为：");
        while ((lengthPassword = fileReader.read(charsPassword)) != -1){
            System.out.println(new String(charsPassword,0,lengthPassword));
        }*/

        System.out.println("请妥善保管您的隐私信息！");

        fileWriter.close();
        fileReader.close();
    }
}
