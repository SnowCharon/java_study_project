package practice7;

/**
 * @title: k
 * @Author 竹玄羽
 * @Date: 2022/11/17 8:14
 */

public class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {
            DangerException danger = new DangerException();
            throw danger;  //抛出danger
        } else {
            System.out.print(goods.getName() + "不是危险品! ");
        }
    }
}
