package ObjectOriented.Abstract;

/**
 * @author 竹玄羽
 * @File Abstract
 * @date 2022/5/24  11:07
 **/
public abstract class Animal {
    /*
    抽象方法：有abstract修饰  不能写方法体代码
     */
    public abstract void run();
    public void eat(){
        System.out.println("动物吃！");
    }

    public abstract void swim();
}
