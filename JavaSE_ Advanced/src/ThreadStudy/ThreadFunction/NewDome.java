package ThreadStudy.ThreadFunction;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.ThreadFunction
 * @Date 2022/6/16 15:39
 **/
public class NewDome {
    public static void main(String[] args) {
        //1.线程有专门的名字，格式：Thread-编号
        //Thread自带参数可以设置名字，不过在自己继承的方法不能直接使用
        MyThreadNew t1 = new MyThreadNew("好耶");
        MyThreadNew t2 = new MyThreadNew();

        //设置线程名称
     /*   t1.setName("好耶");
        t2.setName("好哦");*/

        t1.start();
        t2.start();
    }
}
