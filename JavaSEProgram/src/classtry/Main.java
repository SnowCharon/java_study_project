package classtry;

import java.util.Scanner;

/**
 * @title: Main
 * @Author 竹玄羽
 * @Date: 2022/10/23 19:42
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = scanner.nextLine();
        s=s.substring(a);
        int b = scanner.nextInt();
        System.out.println(s.substring(b));
    }
}
