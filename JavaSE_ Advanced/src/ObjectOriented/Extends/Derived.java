package ObjectOriented.Extends;

/**
 * @title: NoteTest
 * @Author 竹玄羽
 * @Date: 2022/10/1 15:46
 */

class Base {
    public Base() {
        System.out.println("Base--默认构造方法");
    }

    public Base(int c){
        System.out.println("Base--有参构造方法--" + c);
    }
}

public class Derived extends Base {
    public Derived() {
        // super(); //系统会自动隐式先调用父类的无参构造函数 super(); //必须是第一行，否则不能编译
        System.out.println("Derived--默认构造方法");
    }

    public Derived(int c) {
        // super(); //系统会自动隐式先调用父类的无参构造函数 super(); //必须是第一行，否则不能编译
        System.out.println("Derived--有参构造方法" + c);
    }

    public Derived(int a, int b) {
        super(a); //如果子类构造方法第一行显式调用了父类构造方法，系统就不再调用无参的super()了。
        System.out.println("Derived--有参构造方法--" + b);
    }

    public static void main(String[] args) {
        System.out.println("============子类无参============");
        Derived no = new Derived();
        System.out.println("============子类有参============");
        Derived have = new Derived(33);
        System.out.println("============子类有参============");
        Derived have2 = new Derived(33, 55);
    }
}