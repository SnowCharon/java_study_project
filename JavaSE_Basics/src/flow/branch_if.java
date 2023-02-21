package flow;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File flow
 * @date 2022/5/14  11:29
 **/

/*
 * 与C语言相同
 *
 * */

public class branch_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println(x+"是偶数。");
        }else{
            System.out.println(x+"不是偶数。");
        }
    }
}
