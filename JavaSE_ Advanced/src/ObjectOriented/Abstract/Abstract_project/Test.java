package ObjectOriented.Abstract.Abstract_project;

/**
 * @author 竹玄羽
 * @File Abstract_project
 * @date 2022/5/24  11:23
 **/
public class Test {
    public static void main(String[] args) {
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("好耶!");

        c.pay(300);
    }
}
