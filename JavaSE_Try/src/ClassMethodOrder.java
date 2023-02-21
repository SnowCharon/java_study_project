/**
 * @title: test
 * @Author 竹玄羽
 * @Date: 2022/9/18 0:37
 */

public class ClassMethodOrder {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.getName("hello");
    }
}

class Fruit {
    static {
        System.out.println("++++++++++++父类静态代码块+++++++++++++++");
    }

    {
        System.out.println("++++++++++父类普通代码块++++++++++");
    }

    public Fruit() {
        System.out.println("++++++父类构造方法+++++");
    }

    public void getName(String name) {
        System.out.println("+++父类普通方法+++");
    }
}

class Apple extends Fruit {
    static {
        System.out.println("++++++++++++子类静态代码块+++++++++++++++");
    }

    {
        System.out.println("++++++++++子类普通代码块++++++++++");
    }

    public Apple() {
        System.out.println("++++++子类构造方法+++++");
    }

    public void getName(String name) {
        System.out.println("+++子类普通方法+++");
    }
}
