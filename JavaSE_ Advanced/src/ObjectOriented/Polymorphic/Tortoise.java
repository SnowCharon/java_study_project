package ObjectOriented.Polymorphic;

/**
 * @author 竹玄羽
 * @File Polymorphic
 * @date 2022/5/25  11:14
 **/
public class Tortoise extends Animal {
    public String name = "乌龟";

    @Override
    public void run() {
        System.out.println("乌龟跑的非常慢");
    }

    public void breed(){
        System.out.println("乌龟在沙滩下蛋！");
    }
}
