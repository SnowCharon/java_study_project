package Exception;

/**
 * @author MOYU
 * @File JavaSE_Study-Exception
 * @Date 2022/5/31 23:14
 **/
public class ExceptionPrint {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
           /* String message = e.getMessage();
            System.out.println(message);*/
           /* String s = e.toString();
            System.out.println(s);*/
            e.printStackTrace();
        }
        System.out.println("嘿嘿嘿！");
    }
}
