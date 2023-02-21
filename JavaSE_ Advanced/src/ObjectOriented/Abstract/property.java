package ObjectOriented.Abstract;

/**
 * @author 竹玄羽
 * @File Abstract
 * @date 2022/5/24  11:32
 **/
public class property {
    /*
    1.类有的，抽象都有
    2.抽象类可以没有抽象方法，但是有抽象方法必有是抽象类
    3.如果继承抽象类，就必须重写抽象类的全部抽象方法，否则这个类也必须定义为抽象类
    4.不能用abstract修饰变量，代码块，构造器
    5.（重点：有的有失）：抽象类得到了抽象方法，但是失去了创造对象的能力
     */
    //Animal a = new Animal();
    /*
    为什么抽象类无法创建对象
    反证法：假如抽象类可以创建对象
    Animal a = new Animal();
    a.run();   run方法无方法体，无法运行，报错，所以抽象类不能创建

    final 和 abstract 是互斥关系
    final修饰类不能继承，修饰方法，方法不能重写
    abstract修饰的类和方法，必须被继承和重写，不然无法使用

     */
}
