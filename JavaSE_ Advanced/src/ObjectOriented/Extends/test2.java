package ObjectOriented.Extends;

/**
 * @author 竹玄羽
 * @File Extends
 * @date 2022/5/23  15:31
 **/
public class test2 {
    public static void main(String[] args) {
        //1.子类不能继承父类的构造器
        //2.子类是否可以继承父类的私有成员？ 内存原理上是继承的，但是不能直接访问
        tiger t = new tiger();
        t.eat();    //公共方法可以直接访问
        //t.run();  //私有方法不能直接访问

        //3.子类是否可以继承父类的静态成员？  不算继承，静态成员只有一份，是共享的，不算继承
        System.out.println(tiger.location);

        //4.一个子类不能同时继承多个父类，可以多层继承，并且就近使用（父类和父类的父类有同一个方法，调用时用的是父类的）
        //5.所有类都是Object的子类
    }
}


class Animal{
    public void eat(){
        System.out.println("动物都会吃!");
    }

    private void run(){
        System.out.println("动物都会跑！");
    }

    public static String location = "动物园";
}

class tiger extends Animal {

}