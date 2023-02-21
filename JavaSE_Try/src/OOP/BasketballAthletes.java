package OOP;

/**
 * @author MOYU
 * @File JavaSE_Study-OOP
 * @Date 2022/6/7 10:53
 **/
public class BasketballAthletes extends Athletes{
    public BasketballAthletes(String name, int age) {
        super(name, age);
    }

    public BasketballAthletes() {
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习技巧！");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员喝冰峰！");
    }

}
