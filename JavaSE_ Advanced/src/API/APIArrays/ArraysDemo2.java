package API.APIArrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author MOYU
 * @File JavaSE_Study-Arrays_Study
 * @Date 2022/5/30 15:32
 **/
public class ArraysDemo2 {
    public static void main(String[] args) {
        //比较器：Comparator
        //1.默认排序
        int[] arr1 = {26, 59, 26, 4, 36, 9, 58};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //2.降序排序(自定义比较器对象，只能支持引用类型)
        Integer[] arr2 = {26, 59, 26, 4, 36, 9, 16};
        //参数一：被排序的数组   参数二：匿名内部类对象，代表一个比较器对象
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //指定比较规则
                // return o1 - o2;  //升序
                return o2 - o1;  //降序
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}
