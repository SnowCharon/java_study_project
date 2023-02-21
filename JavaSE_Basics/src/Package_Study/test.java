package Package_Study;

/**
 * @author 竹玄羽
 * @File Package_Study
 * @date 2022/5/23  18:55
 **/
public class test {
    /*
    1.同一个包下的类可以互相访问（之前一直这样）
    2.不同包下的类，必须先导包才能使用
     */
    People p = new People();      //导入

    //3.如果这个类中使用不同包下的相同类名，此时默认只能导入一个类的包，另一个要用全名访问---包名.类名
}
