package experiment;

/**
 * @title: InputArray
 * @Author 竹玄羽
 * @Date: 2022/9/15 8:13
 */

public class InputArray {
    public static void main(String[] args) {
        int[] a = {100, 200, 300};
        //输出数组a的长度
        System.out.println(a.length);
        //输出数组a的引用
        System.out.println(a);
        int b[][] = {{1},{1,1} ,{1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        //输出二维数组b的一维数组个数
        System.out.println(b.length);
        System.out.println(b[4][2]);
        //将数组a的引用赋给b[4];
        b[4] = a;
        System.out.println(b[4][2]);
    }
}
