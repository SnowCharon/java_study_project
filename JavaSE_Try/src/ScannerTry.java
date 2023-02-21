import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-PACKAGE_NAME
 * @Date 2022/5/28 21:07
 **/
public class ScannerTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* System.out.println("next输入：");
        String ch1 = sc.next();
        System.out.println(ch1);*/

        System.out.println("nextLine输入：");
        String ch2 = sc.nextLine();
        System.out.println(ch2);
        sc.close();
    }
}
