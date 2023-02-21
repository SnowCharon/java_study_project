package ThreadStudy.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.atomic
 * @Date 2022/6/19 20:57
 **/
public class StudyDemo2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        //获取值
        System.out.println(atomicInteger.get());

        //以原子方式将当前值加1--返回的是自增前的值
        System.out.println(atomicInteger.getAndIncrement());

        //以原子方式将当前值加1--返回的是自增后的值
        System.out.println(atomicInteger.incrementAndGet());

        //以原子方式将参数与对象中的值相加并返回结果
        System.out.println(atomicInteger.addAndGet(20));

        //以原子方式设置为newValue的值，并返回旧值
        System.out.println(atomicInteger.getAndSet(26));
        System.out.println(atomicInteger.get());
    }
}
