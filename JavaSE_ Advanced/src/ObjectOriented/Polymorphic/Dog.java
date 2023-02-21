package ObjectOriented.Polymorphic;

/**
 * @author 竹玄羽
 * @File Polymorphic
 * @date 2022/5/25  11:13
 **/
public class Dog extends Animal {
    public String name = "狗";

    @Override
    public void run() {
        System.out.println("狗跑的很快！");
    }

    public void eat(){
        System.out.println("吃狗粮！");
    }
}
