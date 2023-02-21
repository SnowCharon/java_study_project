package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File ArrayList
 * @date 2022/5/20  11:16
 **/
public class scoreTry {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
        ArrayList<Integer> scoreDel = new ArrayList<>();
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        for (int i = 0; i < 10; i++) {
            score.add(sc.nextInt());
        }
        System.out.println("现在将成绩低于八十的删除！");
        /*for (int i = 0; i < score.size(); i++) {
           if(score.get(i) < 80){
               scoreDel.add(score.remove(i));
               i--; //删除成功后退后一次，因为后一个元素会前冲
           }
        }*/

        for (int i = score.size() - 1; i >= 0 ; i--) {
            if(score.get(i) < 80){
                scoreDel.add(score.remove(i));
            }
        }


        System.out.println(score);
        System.out.print("被删除的成绩有：" + scoreDel);
    }
}
