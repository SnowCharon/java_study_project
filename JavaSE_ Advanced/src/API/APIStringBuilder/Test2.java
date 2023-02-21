package API.APIStringBuilder;

/**
 * @author MOYU
 * @File JavaSE_Study-API_StringBuilder
 * @Date 2022/5/29 10:07
 **/
public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = null;
        System.out.println(fun(arr1));

        int[] arr2 = {15,36,39,15,28,69};
        System.out.println(fun(arr2));

        int[] arr3 = {};
        System.out.println(fun(arr3));
    }

    /*
    1.定义方法接收任意整形数组，返回数组内容格式
     */
    public static String fun(int[] arr){
        if (arr == null){
            return null;
        }else{
            //2.开始拼接内容
            StringBuilder s = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i]).append(i == arr.length-1 ? "" : ",");
            }
            s.append("]");
            return s.toString();
        }
    }
}
