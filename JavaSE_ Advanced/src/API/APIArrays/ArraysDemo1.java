package API.APIArrays;

import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-Arrays_Study
 * @Date 2022/5/30 15:18
 **/
public class ArraysDemo1 {
    //目标：学会Arrays类的API
    public static void main(String[] args) {
        int[] arr = {1, 26, 28, 29, 39, 24, 36, 25, 95, 5};
        System.out.println(arr);

        // 1.返回数组内容toString
        //String r = Arrays.toString(arr);
        //System.out.println(r);
        System.out.println(Arrays.toString(arr));

        //2.排序的API
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3.二分搜索技术
        int index = Arrays.binarySearch(arr, 30);
        //如果搜索的数据不存在，则返回：-（该数据在排序的数组中应该插入的索引）-1
        System.out.println(index);

        int[] arr2 = {2, 9, 58, 26, 31, 4, 3};
        //未排序会引起bug
        System.out.println(Arrays.binarySearch(arr2, 4));

    }

}
