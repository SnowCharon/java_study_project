package String;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File String
 * @date 2022/5/18  22:30
 **/
public class Equals {
    public static void main(String[] args) {
        //1.正确登录名和密码
        String okName = "竹玄羽";
        String okPassword = "123456";

        //2.请您输入登录名和密码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = sc.next();
        System.out.print("请输入密码：");
        String password = sc.next();

        System.out.println();

        //3.判断输入是否与保存的匹配
        if(okName.equals(name)  && okPassword.equals(password)){
            System.out.println("登陆成功！");
        }else{
            System.out.println("用户名或密码错误！");
        }

        //4.判断验证码（不在乎大小写）
        String sysCode = "23dJj";
        String code1 = "23djj";
        System.out.println(sysCode.equalsIgnoreCase(code1));

    }
}
