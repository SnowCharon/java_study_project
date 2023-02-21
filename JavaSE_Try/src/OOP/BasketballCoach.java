package OOP;

/**
 * @author MOYU
 * @File JavaSE_Study-OOP
 * @Date 2022/6/7 10:43
 **/
public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教技巧！");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练喝东鹏特饮！");
    }
}
