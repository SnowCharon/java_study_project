package KeyWord.Static_Study;

/**
 * @author 竹玄羽
 * @File Static_Study
 * @date 2022/5/22  20:22
 * 饿汉单例实现
 **/
public class SingleInstance_1 {
    /*
    单例是在获取对象前，定义一个静态变量来存储对象，对象已经准备好
     */
    public static SingleInstance_1 instance = new SingleInstance_1();

    //1.构造器私有化
    private SingleInstance_1(){

    }
}
