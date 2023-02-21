package ObjectOriented.Abstract.Abstract_project;

/**
 * @author 竹玄羽
 * @File Abstract_project
 * @date 2022/5/24  11:23
 **/
public abstract class Card {
    private String userName;
    private double money;

    /*
    支付功能
     */
    public abstract void pay(double money);


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
