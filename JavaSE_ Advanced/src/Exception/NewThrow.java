package Exception;

/**
 * @author MOYU
 * @File JavaSE_Study-Exception
 * @Date 2022/5/31 22:35
 **/
public class NewThrow {
    /*
    throws:  1.用在方法声明后面，跟的都是异常类名
             2.表示声明异常，调用该方法有可能会出现这样的异常
    throw:   1.用在方法体内，跟的是异常对象名
             2.表示手动抛出异常，由方法体内的语句处理
     */
    public static void main(String[] args) {
        System.out.println("好耶！");
        System.out.println("好棒！");
        System.out.println("好快乐！");
        System.out.println("放假真爽！");
        /*
        当代码执行到这里，就创建一个异常对象
        该异常创建后，暂时没有手动处理，抛给了调用者对象处理
        下面的代码不会再执行了
         */
        throw new RuntimeException();
        /*
        手动抛出异常得作用：
                1.在方法中，当传递的参数有误，没有继续运行的必要，则抛出异常，表示该方法结束
                2.告诉调用者方法中出现了问题
         */


        //System.out.println("放假只有三天！");
    }
}
