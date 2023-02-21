package API;

import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-API
 * @Date 2022/5/29 11:21
 **/
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始~");
        //  System.exit(0);//JVM终止

        //197-1-1到现在的毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);
        //作用
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + "s");
        //数组拷贝
        // 3、做数组拷贝（了解）
        /**
         arraycopy(Object src,  int  srcPos,
         Object dest, int destPos,
         int length)
         参数一：被拷贝的数组
         参数二：从哪个索引位置开始拷贝
         参数三：复制的目标数组
         参数四：粘贴位置
         参数五：拷贝元素的个数
         */
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr2 = new int[6]; // [0, 0, 0, 0, 0, 0] ==>  [0, 0, 40, 50, 60, 0]
        System.arraycopy(arr1, 3, arr2, 2, 3);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------------");
        double i = 10.0;
        double j = 3.0;

        //        System.out.println(k1);

        System.out.println("程序结束！");
    }
}
