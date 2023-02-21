package ThreadStudy.productionandconsumptionplus;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.productionandconsumption
 * @Date 2022/6/17 19:12
 **/
public class Cooker extends Thread{
    private final Desk desk;

    public Cooker(Desk desk) {
        this.desk = desk;
    }
       /*生产者步骤：
        1，判断桌子上是否有汉堡包
        如果有就等待，如果没有才生产。
        2，把汉堡包放在桌子上。
        3，叫醒等待的消费者开吃。*/

    @Override
    public void run() {
        while (true){
            synchronized (desk.getLock()){
                if (desk.getCount() == 0){
                    break;
                }else{
                    if (!desk.isFlag()){
                        //生产
                        System.out.println("做了一个汉堡");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    }else{
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
