package OOP;

/**
 * @author MOYU
 * @File JavaSE_Study-OOP
 * @Date 2022/6/7 10:50
 **/
public class PingPangCoach extends Coach implements English{
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public PingPangCoach() {
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教接球发球！");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃羊肉");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练会说英语");
    }
}
