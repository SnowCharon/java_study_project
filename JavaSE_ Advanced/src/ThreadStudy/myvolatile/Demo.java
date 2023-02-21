package ThreadStudy.myvolatile;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.myvolatile
 * @Date 2022/6/18 22:19
 **/
public class Demo {
    public static void main(String[] args) {
        GirlThread girlThread = new GirlThread();
        girlThread.setName("小鹿同学");
        girlThread.start();

        BoyThread boyThread = new BoyThread();
        boyThread.setName("小皮同学");
        boyThread.start();
    }
}
