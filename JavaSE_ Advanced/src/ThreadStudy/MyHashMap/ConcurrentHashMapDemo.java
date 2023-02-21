package ThreadStudy.MyHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.MyHashMap
 * @Date 2022/6/20 16:54
 **/
public class ConcurrentHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String,String> hm = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 25; i++) {
                hm.put(i + "",i+"");
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 25; i < 51; i++) {
                hm.put(i + "",i+"");
            }
        });

        thread1.start();
        thread2.start();

        System.out.println("----------------");

//方便两个线程有时间把数据全部放回去
        Thread.sleep(1000);
        for (int i = 0; i < 51; i++) {
            System.out.println(hm.get(i + ""));
        }
    }
}
