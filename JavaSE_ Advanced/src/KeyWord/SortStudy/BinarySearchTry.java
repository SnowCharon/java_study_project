package KeyWord.SortStudy;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Sort_Study
 * @Date 2022/5/30 16:01
 **/
public class BinarySearchTry {
    public static void main(String[] args) {
        //1.定义一个排好序的数组
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,6,10,12,16,19,24,29,34,36,45};
        System.out.println("请输入要查找的数：");
        int chose = sc.nextInt();
        int index = search(arr,chose);
        if (index != -1){
            System.out.println("您要查找的数在数组第" + index + "位！");
        }else{
            System.out.println("查无此元素！");
        }

    }

    public static int search(int[] arr,int data){
        //1.定义左边位置和右边位置
        int left = 0,right = arr.length - 1;
        //2.循环查找
        while (left <= right){
            //取中间索引
            int middleIndex = (left + right) / 2;
            //3.判断当前中间位置的元素是否是要查找的
            if (data > arr[middleIndex]){
                //如果当前值比要查找的小，则移动left
                left = middleIndex + 1;
            }else if(data < arr[middleIndex]){
                //如果当前值比要查找的大，则移动right
                right = middleIndex - 1;
            }else{
                return middleIndex;
            }
        }
        return -1;
    }
}
