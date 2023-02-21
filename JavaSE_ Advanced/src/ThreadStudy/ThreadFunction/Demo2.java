package ThreadStudy.ThreadFunction;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.ThreadFunction
 * @Date 2022/6/16 15:47
 **/
public class Demo2 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
