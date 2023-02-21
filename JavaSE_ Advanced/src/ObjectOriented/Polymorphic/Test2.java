package ObjectOriented.Polymorphic;

/**
 * @author 竹玄羽
 * @File Polymorphic
 * @date 2022/5/25  11:29
 *
 **/
public class Test2 {
    public static void main(String[] args) {
        Animal d = new Dog();
        go(d);
        //d.eat();   多态缺点：无法使用子类独有的方法

        Animal t = new Tortoise();
        go(t);

    }


    /*
希望这个方法可以接受一切子类对象
 */
    public static void go(Animal a) {
        System.out.println("预备！");
        a.run();
        System.out.println("结束！");
    }
}

