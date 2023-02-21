package ThreadStudy.mythreadpool;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.thethreadpool
 * @Date 2022/6/18 20:49
 **/
public class Property {
    /*
    线程池：
        新建：创建线程对象--(start)--就绪：有执行权力--(抢到CPU执行权)--运行：有执行资格，有执行权--(run结束)--死亡：线程死亡，变成垃圾
        意外：1.其他线程在运行前抢走了执行权
             2.阻塞状态：无法获取锁
             3.等待状态：wait()等待，知道被notify唤醒
             4.计时等待状态：sleep睡眠
        线程的六种状态：
                    1.新建状态：NEW--创建
                    2.就绪状态：RUNNABLE--start
                    3.阻塞状态：BLOCKED--无法获得锁
                    4.等待状态：WAITING--wait
                    5.计时状态：TIMED_WAITING--sleep
                    6.结束状态：TERMINATED--全部代码执行完毕
     */
}
