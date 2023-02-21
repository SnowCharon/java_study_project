package ObjectOriented.Interface_Study;

/**
 * @author 竹玄羽
 * @File API_interface
 * @date 2022/5/24  20:09
 **/
public interface AddInterface {
    /*
    1.必须default 修饰，默认public修饰   默认方法等于实例方法
    ---默认方法，接口不能创建对象，只能过继给实现类，有实现类的对象调用
     */
    default void run() {
       // ShuiDaJiao();
        System.out.println("跑得快，不一定赢，不跌跟头，才是硬道理！");
    }

    ;

    /*
    2.静态方法，static修饰，默认还是public
    ----必须静态接口名才能调用
     */
    static void HaoYe() {
        System.out.println("我在游泳！");
    }

    /*
    3.----1.9之后才行
    ---私有方法：private 修饰
    ---接口内才能访问
     */
    //private void ShuiDaJiao() {
      //  System.out.println("遇到困难睡大觉！");
    //}
}


class P implements AddInterface {

}

class Test2 {
    public static void main(String[] args) {
        P peo = new P();
        peo.run();

        AddInterface.HaoYe();
    }
}