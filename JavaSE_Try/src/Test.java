/**
 * @title: test
 * @Author 竹玄羽
 * @Date: 2022/9/22 19:49
 */

public class Test {
    public static void main(String[] args) {
        int a = 2, b = 60;
        long r=1L;

        long start1 = System.nanoTime();
        while (b-- != 0) {
            r *= a;
        }
        long end1 = System.nanoTime();
        System.out.println(r);
        System.out.println("花费时间：" + (end1 - start1));


       b = 60;
       r=1L;
        long base = a;
        long start2 = System.nanoTime();
        while (b != 0) {
            if (b%2 == 0){
                r *= base;
            }
            base *= base;
            b /= 2;
        }
        long end2 = System.nanoTime();
        System.out.println(r);
        System.out.println("花费时间：" + (end2 - start2));
    }
}

