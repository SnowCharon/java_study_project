package ObjectOriented;

/**
 * @author 竹玄羽
 * @File Object_Oriented
 * @date 2022/5/16  15:28
 **/
public class Car {
    //属性（成员变量）
    String name;
    double price;

    //行为（方法）
    public void start(){
        System.out.println(name + "，价格是：" + price + "启动了~~");
    }

    public void run(){
        System.out.println(name + "，价格是：" + price + "跑得很快~");
    }

}