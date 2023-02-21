package ThreadStudy.myvolatilebylockway;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy
 * @Date 2022/6/18 22:15
 **/
public class GirlThread extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Money.lock){
                if (Money.money != 100000){
                    System.out.println("结婚基金已经不是100000");
                    break;
                }
            }
        }
    }
}
