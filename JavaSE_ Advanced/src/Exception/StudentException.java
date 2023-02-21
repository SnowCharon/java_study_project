package Exception;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Exception
 * @Date 2022/6/1 10:22
 **/
public class StudentException {
    public static void main(String[] args) {
        //规定年龄得是18-25，不在此范围的需要重新录入

        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        s.setName(name);

        while (true) {
            System.out.println("请输入年龄：");
            String ageStr = sc.nextLine();
            int age;
            try {
                age = Integer.parseInt(ageStr);
                s.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数！");
            }catch (AgeOutBoundsException e){
                System.out.println(e);
                System.out.println("请输入一个符合范围的年龄！");
            }

        }
        System.out.println(s);
    }
}
