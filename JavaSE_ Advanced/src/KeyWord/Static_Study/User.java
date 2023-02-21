package KeyWord.Static_Study;

/**
 * @author 竹玄羽
 * @File Static_Study
 * @date 2022/5/21  21:01
 **/
public class User {
    //在线人数  static修饰：静态成员变量，内存中只有一份
    //静态变量属于类
    //同一个类中，静态方法访问可以不加类名   不在同一个类要用类名访问
    public static int onlineNumber = 1556;

    //实例成员变量属于对象
    //实例方法访问只能用对象触发访问z
    private String name;
    private int age;

    public static void main(String[] args) {
        //static修饰的静态变量访问： 类名.静态成员变量
        System.out.println(User.onlineNumber);

        //非static(private)修饰的成员变量属于对象
        //访问方法： 对象名.实例成员变量
        User u1 = new User();
        u1.name = "张三";
        System.out.println(u1.name);
    }
}
