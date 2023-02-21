package ObjectOriented.Extends;

/**
 * @author 竹玄羽
 * @File Extends
 * @date 2022/5/23  15:44
 **/
public class field_method {
    public static void main(String[] args) {
        //理解就近原则    this访问对象，super访问父类
        Dog d = new Dog();
        d.run();
        d.lookDoor();
        //d.go();   并不存在
        d.showName();
    }
}

class animals{
    public String name = "动物名";
    public void run(){
        System.out.println("动物会跑！");
    }
}

class Dog extends animals {
    public String name = "修狗";

    public void showName(){
        String name = "局部名";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void lookDoor(){
        System.out.println("修狗超可爱！");
    }

}
