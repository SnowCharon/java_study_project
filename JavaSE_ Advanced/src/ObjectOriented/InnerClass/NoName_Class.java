package ObjectOriented.InnerClass;

/**
 * @author MOYU
 * @File JavaSE_Study-InnerClass
 * @Date 2022/5/28 17:10
 * 作用:方便创建子类对象，简化了代码编写
 **/
public class NoName_Class {
    /*
    new 类|抽象类名|接口名（） {
        重写方法；
    }
     */
    public static void main(String[] args) {
        Animal a = new Animal() {   //1.匿名类没有名字，直接属于创建出来的对象
            @Override
            public void run() {
                System.out.println("老虎跑得快~");
            }
        };
        a.run();
    }
}

/*class Tiger extends Animal{
    @Override
    public void run() {
        System.out.println("老虎跑得快~");
    }
}*/


abstract class Animal{
    public abstract void run();
}