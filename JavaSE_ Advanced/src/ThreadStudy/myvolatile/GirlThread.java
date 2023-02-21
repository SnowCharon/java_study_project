package ThreadStudy.myvolatile;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.myvolatile
 * @Date 2022/6/18 22:15
 **/
public class GirlThread extends Thread{
    @Override
    public void run() {
        while (Money.money == 100000){

        }
        System.out.println("结婚基金已经不是100000");
    }
}
