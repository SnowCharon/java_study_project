package array;

import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File array
 * @date 2022/5/14  22:20
 **/
public class array_sort {
    public static void main(String[] args) {
        //1.定义数组，存储数据
        int[] array = new int[5];
        int temp;

       //2.输入数据
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < array.length;i++){
           array[i] = sc.nextInt();
        }

        //3.开始比较
        //外部循环控制轮数
       for (int i = 1; i <= array.length - 1; i++) {
            //内部循环控制每轮次数
            for (int j = 0; j < array.length - i; j++) {
                //判断当前arr[i]是否大于后一个
                if (array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        //4.输出排序好的数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
