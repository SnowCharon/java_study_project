package ThreadStudy.productionandconsumptionplus;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.productionandconsumption
 * @Date 2022/6/17 18:50
 **/
public class Foodie extends Thread{
    private final Desk desk;

    public Foodie(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
      /*消费者步骤：
        1，判断桌子上是否有汉堡包。
        2，如果没有就等待。
        3，如果有就开吃
        4，吃完之后，桌子上的汉堡包就没有了
                叫醒等待的生产者继续生产
        汉堡包的总数量减一*/

        while (true){
            synchronized (desk.getLock()){
                if (desk.getCount() == 0){
                    break;
                }else {
                    if (desk.isFlag()) {
                      //有汉堡
                        System.out.println("吃货吃下汉堡！");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();
                        desk.setCount(desk.getCount() - 1);
                        System.out.println("还能再吃" + desk.getCount() + "个汉堡！");
                    } else {
                        //没有就等待
                        //使用什么对象作为锁，就必须用这个对象去调用等待和唤醒的方法
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
