package ThreadStudy.productionandconsumptionplus;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.productionandconsumption
 * @Date 2022/6/17 18:47
 **/
public class Desk {
    /**
     * 定义一个标记
     *     true表示桌子上有汉堡，允许吃货执行
     *     false表示桌子上没有，允许厨师执行
     */
//    public static boolean flag = false;
    public boolean flag;

    /**
     * 汉堡数量
     */
//    public static int count = 10;
    public int count;

    /**
     * 锁对象
     */
//   public static final Object lock = new Object();
   public final Object lock = new Object();

    public Desk() {
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}
