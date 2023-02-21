package flow;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File flow
 * @date 2022/5/14  16:19
 **/
public class branch_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入是周几：");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("上课！");
                break;
            case 6:
            case 7:
                System.out.println("自由安排！");
                break;
            default:
                System.out.println("输入错误！");
        }

        String ch = sc.next();
        switch (ch){
            case "abc":
                System.out.println("好耶！");
        }
    }
}
