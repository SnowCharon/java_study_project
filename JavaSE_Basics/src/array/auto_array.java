package array;

/**
 * @author 竹玄羽
 * @File array
 * @date 2022/5/14  19:05
 **/
public class auto_array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[5] = 25;
        System.out.println(arr[5]);
        System.out.println(arr[6]);

        String[] names = new String[100];
        names[0] = "董佳杰";
        names[2] = "小眠";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
