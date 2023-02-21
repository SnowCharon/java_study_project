package CollectionStudy.Stream;

import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 9:30
 **/
public class ArrayStream {
    public static void main(String[] args) {
        //数组Stream流
        int[] arr = {1,2,3,4,56,5};
        Arrays.stream(arr).forEach(System.out::println);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
