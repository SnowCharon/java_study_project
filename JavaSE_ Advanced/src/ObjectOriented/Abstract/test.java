package ObjectOriented.Abstract;

/**
 * @author 竹玄羽
 * @File Abstract
 * @date 2022/5/24  11:06
 **/
public class test {
    public static void main(String[] args) {
        /*
        1.抽象方法只有方法签名，不能声明方法体
        2.一个类中如果定义了抽象方法，这个类必须声明成抽象类，否则报错
        作用：抽象方法，具体实现交给子类，成抽象类可以声明成员变量，因此还是便于代码复用
        注意：如果继承抽象类，就必须重写抽象类的全部抽象方法，否则这个类也必须定义为抽象类
         */
        dog d = new dog();
        d.run();
        d.swim();
    }
}
