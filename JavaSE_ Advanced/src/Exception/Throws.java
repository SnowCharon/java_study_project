package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author MOYU
 * @File JavaSE_Study-Exception
 * @Date 2022/5/31 22:24
 **/
public class Throws {
    public static void main(String[] args) throws ParseException{
        //fun();//调用者还是将异常交给虚拟机
        run();
        System.out.println("hhh!");
    }

    /*
    告诉调用者，你调用我会出现异常
    如果方法没有异常正常执行
    如果真的异常，其实也是将这个异常交给调用者处理；
     */
    //声明的是运行时异常，那么声明的代码可以不写
    private static void fun() /*throws NullPointerException*/{
        int[] arr = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
    告诉调用者，你调用我会出现异常
    如果方法没有异常正常执行
    如果真的异常，其实也是将这个异常交给调用者处理；
     */
    //如果声明的异常是编译时异常，必须声明，否则编译不成功
    private static void run() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse("2022-5-31");
    }

}
