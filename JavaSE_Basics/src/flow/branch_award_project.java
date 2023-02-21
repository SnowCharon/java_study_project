package flow;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File flow
 * @date 2022/5/14  11:37
 **/
public class branch_award_project {
    public static void main(String[] args) {
        //输入成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int score = sc.nextInt();
        if(score > 100 || score <= 0) {
            System.out.println("成绩无效！");
            return;
        }

        //判断分支
        if(score >= 95 && score <= 100){
            System.out.println("奖励一个自行车！");
        }else if(score >= 90 && score <= 94){
            System.out.println("奖励去游乐园！");
        }else if(score >= 80 && score <= 89){
            System.out.println("奖励变形金刚！");
        }else{
            System.out.println("奖励大嘴巴子！");
        }
    }
}
