package ObjectOriented.Abstract;

/**
 * @author 竹玄羽
 * @File Abstract
 * @date 2022/5/24  11:43
 **/
public abstract class Module_function {
    /*
    模板方法：当有部分代码相同，又有部分无法确定，需要具体实现，则把无法确认的抽象化
    作用：提高代码复用性  给定通用架构，具体方法具体实现
     */
    public final void Know(){
        System.out.println("巴拉巴拉+++");   //已知模板   模板方法建议用final修饰
    }

    public abstract String DontKnow();   //未知，抽象方法

}
