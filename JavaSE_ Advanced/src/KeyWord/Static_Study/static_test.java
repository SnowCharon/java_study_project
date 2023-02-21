package KeyWord.Static_Study;

/**
 * @author 竹玄羽
 * @File Static_Study
 * @date 2022/5/21  21:38
 **/
public class static_test {
    //静态成员
    public static int onlineNumber = 10;
    //静态方法
    public static void test2(){
        System.out.println("==========test2========");
    }

    //实例成员
    private String name;
    private int age;
    //实例方法
    public void run(){
        System.out.println(name + "跑得快");
    }


    //1.静态方法只能访问静态成员，不能直接访问实例成员
    public static void test(){
        System.out.println(onlineNumber);
        test2();
        //System.out.println(name);  无法直接访问实例成员
    }

    //2.实例方法可以访问静态成员，也可以访问实例成员
    public void go(){
        System.out.println(static_test.onlineNumber);
        System.out.println(onlineNumber);
        test2();
        System.out.println(name);
    }

    //3.静态方法中不可以使用this关键字：
    public static void jkl(){
        //System.out.println(this);   this代表对象
    }

    public static void main(String[] args) {


    }
}
