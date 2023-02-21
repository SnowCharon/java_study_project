package Exception;

/**
 * @author MOYU
 * @File JavaSE_Study-Exception
 * @Date 2022/5/31 22:47
 **/
public class TryCatch {
    /*
    好处：   1.解决异常
            2.让程序继续运行
     */
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4};
        int[] arr = null;
        //接收到异常反馈，然后处理
        try {
            //放的是有可能出现异常的代码
            printArr(arr);
        }catch (NullPointerException e){
            //如果出现异常，执行如下操作
            System.out.println("参数不能为null!");
        }

        System.out.println("hhh!");
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr == null) {
                throw new NullPointerException();
            }else{
                System.out.println(arr[i]);
            }
        }
    }
}
