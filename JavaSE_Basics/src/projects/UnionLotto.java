package projects;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File projects
 * @date 2022/5/15  20:45
 **/
public class UnionLotto {
    public static void main(String[] args) {
        //1.随机6个红球号码（1-33）不重复，随机一个篮球号码（1-16），组成中奖号码
        int[] LuckNumbers = createLuckNumber();

        //2.调用一个方法，让用户输入7个号码，作为用户的号码
       int[] UserNumbers = userInputNumbers();

       //3.判断中奖情况
        judge(LuckNumbers,UserNumbers);

    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println(); //换行1
    }

    public static int[] createLuckNumber(){
        //a.定义一个动态数组存储数字串
        int[] numbers = new int[7];
        //b.遍历数组，生成6个不重复数字，范围 1-33
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                int data = r.nextInt(33) + 1;
                //c.判断当前号码是否重复！
                //定义flag 默认data没有重复。
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (data == numbers[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    numbers[i] = data;
                    break;
                }
            }
        }
        //d.为第七位生成篮球号码
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }

    public static int[] userInputNumbers(){
        //a.定义一个数组，存储7个号码
        int[] numbers = new int[7];
        //b.让用户录入六个红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33），要求不重复");
            int data = sc.nextInt();
            //c.把录入的数据存入数组
            numbers[i] = data;

        }
        //d.单独录入篮球号码
        System.out.println("请您录入篮球号码（1-16）：");
        numbers[6] = sc.nextInt();

        return numbers;
    }

    public static void judge(int[] LuckNumbers,int[] UserNumbers) {
        //判断是否中奖
        //a.定义两个变量分别存储红球命中的个数，以及判断篮球是否命中
        int RedHitNumbers = 0;

        //b.判断红球命中个数
        for (int i = 0; i < UserNumbers.length - 1; i++) {
            for (int j = 0; j < LuckNumbers.length - 1; j++) {
                if (UserNumbers[i] == LuckNumbers[j]) {
                    RedHitNumbers++;
                    break;
                }
            }
        }

        //判断篮球是否命中
        int BlueHitNumbers = LuckNumbers[6] == UserNumbers[6] ? 1 : 0;

        //根据中奖情况给出结果

        System.out.print("中奖号码是：");
        printArray(LuckNumbers);
        System.out.print("您的号码是：");
        printArray(UserNumbers);
        System.out.println("您命中了红球：" + RedHitNumbers + "个");
        System.out.println("您是否命中了篮球：" + (BlueHitNumbers == 1 ? "是" : "否"));

        if (BlueHitNumbers == 1 && RedHitNumbers < 3) {
            System.out.println("恭喜您，中奖5元！");
        } else if (BlueHitNumbers == 1 && RedHitNumbers == 3 || BlueHitNumbers == 0 && RedHitNumbers == 4) {
            System.out.println("恭喜您，中奖10元！");
        } else if (BlueHitNumbers == 1 && RedHitNumbers == 4 || BlueHitNumbers == 0 && RedHitNumbers == 5) {
            System.out.println("恭喜您，中奖200元！");
        } else if (BlueHitNumbers == 1 && RedHitNumbers == 5) {
            System.out.println("恭喜您，中奖3000元！");
        }else if (BlueHitNumbers == 0 && RedHitNumbers == 6) {
            System.out.println("恭喜您，中奖500万元！");
        }else if (BlueHitNumbers == 1 && RedHitNumbers == 6) {
            System.out.println("恭喜您，中奖1000万元！");
        }else{
            System.out.println("谢谢参与！");
        }
    }
}
