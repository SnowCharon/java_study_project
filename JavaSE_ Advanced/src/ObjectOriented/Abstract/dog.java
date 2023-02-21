package ObjectOriented.Abstract;

/**
 * @author 竹玄羽
 * @File Abstract
 * @date 2022/5/24  11:11
 **/
public class dog extends Animal {
    @Override
    public void run() {
        System.out.println("狗跑得贼快！");
    }

    @Override
    public void swim() {
        System.out.println("小桥流水哗啦啦！");
    }
}
