package MyGenerics.GenericsInterfacePackAge;

/**
 * @author MOYU
 * @File JavaSE_Study-MyGenerics
 * @Date 2022/6/3 15:29
 **/
public class GenInterfaceMain {
    /*
    泛型接口使用方法：
            1.实现类不给泛型
            2.实现类给确定具体的数据类型
    泛型接口定义格式：
            格式：修饰符 interface 接口名<T>{}
            eg:public interface Generics<T>{}
    */
    public static void main(String[] args) {
        Genericity1<String> s = new Genericity1<>();
        s.method("好耶！");

        Genericity2 s2 = new Genericity2();
        s.method("噢噢噢噢！！！");
    }
}
