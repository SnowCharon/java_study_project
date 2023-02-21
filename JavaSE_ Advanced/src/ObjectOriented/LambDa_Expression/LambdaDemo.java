package ObjectOriented.LambDa_Expression;

/**
 * @author MOYU
 * @File JavaSE_Study-LambDa_Expression
 * @Date 2022/5/30 16:16
 **/
public class LambdaDemo {
    public static void main(String[] args) {
        //学会利用Lambda表达式简化匿名内部类的代码格式
        /*
        Lambda表达式只能简化函数式接口的匿名内部类的写法形式
        1.首先必须是函数式接口----接口只有一个抽象方法
        2.加上@FunctionalInterface注解，标记该接口是满足函数式接口！
         */

        Animal a  = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑的很快！");
            }
        };
        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}
