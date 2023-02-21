package array;

/**
 * @author 竹玄羽
 * @File array
 * @date 2022/5/14  18:54
 **/
public class static_array {
    public static void main(String[] args) {

        int[] a = {1,2,5,96,63,8};
        int m[] = {2,9,5,86,39,9,56,54};
        String[] ch = {"haoyr","hdaio","dhawi"};
        double[] d = {15.6,26006.2,26.9};

        for (int j : a) {
            System.out.println(j);
        }
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
}
