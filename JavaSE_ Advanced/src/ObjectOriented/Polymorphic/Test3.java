package ObjectOriented.Polymorphic;

/**
 * @author 竹玄羽
 * @File Polymorphic
 * @date 2022/5/25  15:52
 **/
public class Test3 {
    public static void main(String[] args) {
        //1.自动类型转换
        Animal a = new Dog();
        a.run();
        //a.eat();

        //2.强制类型转换
        Dog d = (Dog) a;
        d.eat();

        /*
        注意：多态下直接强制类型转换，可能出现类型转换异常
        规定：有继承或者实现关系的2个类型就可以强制转换
         */
        //Tortoise t = (Tortoise) a;    狗不能强制转换为乌龟，不安全
        if(a instanceof Tortoise){
            Tortoise t = (Tortoise) a;
            t.breed();
        }else if(a instanceof Dog){
            Dog dg = (Dog) a;
            dg.eat();
        }

        Animal tt = new Tortoise();
        go(tt);

    }

    public static void go(Animal a) {
        System.out.println("预备！");
        if(a instanceof Tortoise){
            Tortoise t = (Tortoise) a;
            t.breed();
        }else if(a instanceof Dog){
            Dog dg = (Dog) a;
            dg.eat();
        }
        System.out.println("结束！");
    }
}
