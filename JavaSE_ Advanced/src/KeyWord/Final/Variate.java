package KeyWord.Final;

/**
 * @author 竹玄羽
 * @File Final
 * @date 2022/5/24  10:14
 **/
public class Variate {
    /*
    final变量，总规则：变量有且仅能被赋值一次
    变量有两种：
    1.局部变量
    2.成员变量
             ----实例成员变量
             ----静态成员变量
     */

    /**
     *   2.修饰静态成员变量 == 常量
     */
     public static final String SCHOOL_NAME = "华清";
    /**
     * 3.修饰实例成员变量(几乎不用，废物)
     */
    private final String name = "孙悟空";



    public static void main(String[] args) {
        //1.局部变量
        final double pi = 3.14;
        //pi = 26;    报错    保护数值
    }

    public static void buy(final double z){
       // z = 0.1;      传参是已经赋值
    }

}
