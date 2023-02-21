package ObjectOriented.LambDa_Expression;

/**
 * @author MOYU
 * @File JavaSE_Study-LambDa_Expression
 * @Date 2022/5/30 16:20
 **/
public class LambdaDemo2 {
    public static void main(String[] args) {
        /*Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("鱼游泳很快！");
            }
        };*/

        Swimming s = () -> System.out.println("鱼游泳很快！");

        go(s);

        System.out.println("======================");

        go(() -> System.out.println("学生游得很开心~"));

    }

    public static void go(Swimming s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

@FunctionalInterface   //加上这个注解必须是函数式接口，里面只能有一个抽象方法
interface Swimming {
    void swim();
}