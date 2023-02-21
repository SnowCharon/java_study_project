package OOP;

/**
 * @author MOYU
 * @File JavaSE_Study-OOP
 * @Date 2022/6/7 10:57
 **/
public class Test {
    public static void main(String[] args) {
        //创建对象
        PingPangAthletes pp = new PingPangAthletes("王浩" ,20);
        pp.eat();
        pp.study();
        pp.speak();

        BasketballCoach bac = new BasketballCoach("李蓉",26);
        bac.teach();
        bac.eat();

    }
}
