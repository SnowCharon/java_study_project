package ThreadStudy.myvolatilebylockway;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/18 22:14
 **/
public class Money {
    public static Object lock = new Object();
    public static int money = 100000;
}
