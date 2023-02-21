package OOP;

/**
 * @author MOYU
 * @File JavaSE_Study-OOP
 * @Date 2022/6/7 10:55
 **/
public class PingPangAthletes extends Athletes implements English{
    public PingPangAthletes(String name, int age) {
        super(name, age);
    }

    public PingPangAthletes() {
    }

    @Override
    public void study() {
        System.out.println("乒乓远动员学习接球发球！");
    }

    @Override
    public void speak() {
        System.out.println("乒乓运动员说英语！");
    }

    @Override
    public void eat() {
        System.out.println("乒乓运动员吃牛排！");
    }
}
