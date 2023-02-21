package ObjectOriented;

/**
 * @author 竹玄羽
 * @File Object_Oriented
 * @date 2022/5/16  15:32
 **/
public class test_car {
    public static void main(String[] args) {
        //目标：自己涉及对象并使用
        //类名 对象名 = new 类名();
        Car c = new Car();
        System.out.println(c);
        c.name = "奔驰";
        c.price = 39.78;
        c.start();
        c.run();
    }
}
