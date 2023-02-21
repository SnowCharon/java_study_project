package KeyWord.RegularExpression;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Regular_Expression
 * @Date 2022/5/29 20:02
 **/
public class TestQQ {
    //校验qq号
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的qq号：");
        String s = sc.next();
        if (checkQQ2(s)){
            System.out.println("您的qq号输入正确！");
        }else{
            System.out.println("您的qq号输入错误！");
        }

        sc.close();
    }

    public static boolean checkQQ2(String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }


    //手写方法实现
    public static boolean checkQQ(String qq) {
        //1.判断长度
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        //2. 判断是否全是数字
        for (int i = 0; i < qq.length(); i++) {
            //获取每位
            char ch = qq.charAt(i);
            //判断
            if (ch < '0' || ch > '9'){
                return false;
            }

        }
        return true;
    }

}