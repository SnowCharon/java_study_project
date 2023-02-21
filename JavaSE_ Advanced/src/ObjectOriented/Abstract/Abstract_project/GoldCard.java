package ObjectOriented.Abstract.Abstract_project;

/**
 * @author 竹玄羽
 * @File Abstract_project
 * @date 2022/5/24  11:25
 **/
public class GoldCard extends Card {
    @Override
    public void pay(double money) {
        System.out.println("您当前消费：" + money);
        System.out.println("您卡片当前余额：" + getMoney());
        //优惠价
        double rs = money * 0.8;
        System.out.println("您实际支付：" + rs);
        //更新余额
        setMoney(getMoney() - rs);
        System.out.println("卡片余额：" + getMoney());
    }
}
