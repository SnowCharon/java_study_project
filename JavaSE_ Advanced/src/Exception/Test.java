package Exception;

/**
 * @author MOYU
 * @File JavaSE_Study-Exception
 * @Date 2022/5/31 22:11
 **/
public class Test {
    /*
    异常会导致JVM非正常运行
    注：语法错误不在异常体系中
               |-->Error：严重问题，通过代码无法处理
    Thowable  --                                   |-->除RuntimeException之外的所有异常---均是发生在编译时
               |-->Exception（程序本身可以处理的异常）--
                                                   |-->RuntimeException及其子类（运行时异常）
     */

    public static void main(String[] args) {
        //错误是谁打印的呢？
        int[] arr = {1,5,6,2,9};
        System.out.println(arr[10]);
        //当代码出现异常，那么JVM就在这里创建一个异常对象
        //new ArrayIndexOutOfBoundsException();
        /*
        1.看程序中有没有自己处理异常的方法
        2.如果没有处理方法，交给本方法调用者处理
        3.最终会交给虚拟机JVM处理
        JVM处理：
            1.将异常信息用红色字体展示在控制台
            2.哪里出现异常，程序就在那里停止运行，即下面的代码不会被执行
         */
        System.out.println("哈哈哈！");
    }

}
