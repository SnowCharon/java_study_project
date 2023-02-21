package ThreadStudy.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.atomic
 * @Date 2022/6/19 20:56
 **/
public class StudyDome1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger);

        AtomicInteger atomicInteger1 = new AtomicInteger(10);
        System.out.println(atomicInteger1);
    }
}
