package KeyWord.RegularExpression;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Regular_Expression
 * @Date 2022/5/29 20:35
 **/
public class ProjectTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //检查电话号码
        checkphone(sc);
        checkTel(sc);
        checkEM(sc);
        sc.close();
    }

    public static void checkphone(Scanner sc){
        //1.让用户输入

        while (true) {
            System.out.println("请输入手机号码：");
            String tel = sc.next();
            //2.进行检查
            if (tel != null && tel.matches("1[3-9]\\d{9}")){
                System.out.println("手机号码正确！");
                break;
            }else{
                System.out.println("手机号码错误！");
            }
        }
    }
    public static void checkTel(Scanner sc){
        //1.让用户输入

        while (true) {
            System.out.println("请输入电话号码：");
            String tel = sc.next();
            //2.进行检查
            if (tel != null && tel.matches("0\\d{2,6}-?\\d{5,20}")){
                System.out.println("电话号码正确！");
                break;
            }else{
                System.out.println("电话号码错误！");
            }
        }
    }

    public static void checkEM(Scanner sc){
        //1.让用户输入
        while (true) {
            System.out.println("请输入邮箱：");
            String tel = sc.next();

            //2.进行检查
            //邮箱格式要正确
            if (tel != null && tel.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){
                System.out.println("邮箱正确！");
               break;
            }else{
                System.out.println("邮箱错误！");
            }
        }
    }

}
