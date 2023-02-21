/**
 * @title: FastPower
 * @Author 竹玄羽
 * @Date: 2022/9/23 0:58
 * 快速幂运算，且该方法求得是结果的最后三位
 */

public class FastPower {
    public static void main(String[] args) {
        int x = 2;
        int n = 100000;
         long result = 1L;

        long start = System.nanoTime();

        while (n > 0){
            if (n % 2 == 1){
                result = result * x % 1000;
            }
            n = n /2;
            x =x * x % 1000;
        }

        long end = System.nanoTime();

        System.out.println(result);
        System.out.println("用时：" + (end - start));
    }
}
