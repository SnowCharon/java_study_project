package ObjectOriented.Polymorphic;

/**
 * @author 竹玄羽
 * @File Polymorphic
 * @date 2022/5/25  11:00
 * 多态：
 * 1.有继承/实现关系；   dog extends animal
 * 2.有弗雷引用指向子对象；Animal a = new Dog();
 * 3.有方法重写
 **/
public class Test {
    public static void main(String[] args) {
        //多态：父类 对象名称 = new 子类构造器（）；
        Animal a = new Dog();           //方法调用：编译看做，运行看右
        a.run();                        //变量调用：变易看左，运行看左
        System.out.println(a.name);

        Animal a1 = new Tortoise();
        a1.run();
        System.out.println(a1.name + "好耶！");
    }
}
