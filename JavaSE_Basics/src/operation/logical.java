package operation;

/**
 * @author 竹玄羽
 * @File operation
 * @date 2022/5/14  10:36
 **/
public class logical {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        //   & 有false则false
        System.out.println((i > j) & (i > k));  //false &  false
        System.out.println((i < j) & (i > k));  //true  &  false
        System.out.println((i > j) & (i < k));  //false &  true
        System.out.println((i < j) & (i < k));  //true  &  true

        System.out.println('\n');

        //   | 有true则true
        System.out.println((i > j) | (i > k));  //false |  false
        System.out.println((i < j) | (i > k));  //true  |  false
        System.out.println((i > j) | (i < k));  //false |  true
        System.out.println((i < j) | (i < k));  //true  |  true

        //   && 有false则false
        System.out.println((i > j) && (i > k));  //false &&  false
        System.out.println((i < j) && (i > k));  //true  &&  false
        System.out.println((i > j) && (i < k));  //false &&  true
        System.out.println((i < j) && (i < k));  //true  &&  true

        System.out.println('\n');

        //   || 有true则true
        System.out.println((i > j) || (i > k));  //false ||  false
        System.out.println((i < j) || (i > k));  //true  ||  false
        System.out.println((i > j) || (i < k));  //false ||  true
        System.out.println((i < j) || (i < k));  //true  ||  true

        //逻辑运算符 & 与短路逻辑运算符 && 的区别
        //System.out.println((i++ > 100) & (j++ > 100));  //false & false
        System.out.println((i++ > 100) && (j++ > 100));  //false & false

        // 当短路与逻辑运算符左边为false,就不在执行右边；同理，短路或的左边为真时，右边不执行

        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}


