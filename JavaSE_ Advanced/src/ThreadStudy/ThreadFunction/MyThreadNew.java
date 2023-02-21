package ThreadStudy.ThreadFunction;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.ThreadFunction
 * @Date 2022/6/16 15:38
 **/
public class MyThreadNew extends Thread{
    public MyThreadNew() {
    }

    public MyThreadNew(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@@@" + i);
        }
    }
}
