package ThreadStudy.LockStudy;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.LockStudy
 * @Date 2022/6/16 20:50
 **/
public class DieLock {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        new Thread(() -> {
            while (true) {
                synchronized (object1){
                    synchronized (object2){
                        System.out.println("小康在走路！");
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (object2){
                    synchronized (object1){
                        System.out.println("小芳在走路！");
                    }
                }
            }
        }).start();

        //以上代码就会出现死锁，程序依旧没有结束，却没有输出
        //解决死锁方法：别写锁的嵌套

    }
}
