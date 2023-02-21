package KeyWord.SortStudy;

import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-Sort_Study
 * @Date 2022/5/30 16:02
 **/
public class SelectionSort {
    public static void main(String[] args) {
        //1.定义数组
        int temp;
        int[] arr = {15,26,38,15,29,6,9,48,2,39,49,76};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1;j < arr.length;j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
