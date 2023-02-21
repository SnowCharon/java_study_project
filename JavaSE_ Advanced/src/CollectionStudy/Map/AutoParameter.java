package CollectionStudy.Map;

/**
 * @author MOYU
 * @File JavaSE_Study-Map
 * @Date 2022/6/5 20:13
 **/
public class AutoParameter {
    //可变参数
    //格式：修饰符 返回值类型 方法名（数据类型...变量名）{}   --本质是数组
    //如果含有可变参数方法有多个参数，其他参数应该放在可变参数前面
    public static void main(String[] args) {
        //1.求两个数之和
        //2.求三个数之和
        //3.求N个数的和
        int a = 10;
        int b = 5;
        int c = 6;

        //1.
        int sum1 = getSum(a, b);
        System.out.println(sum1);

        //2.
        int sum2 = getSum(a, b, c);
        System.out.println(sum2);

        //3.
        int sum = getSum(1,2,6,9,6,9,58,6);
        System.out.println(sum);
    }

    private static int getSum(int a, int b) {
        return a + b;
    }

    private static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * public static int getSum(int...arr,int number)----错误
     * public static int getSum(int number,int...arr)----正确
     */
    public static int getSum(int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
