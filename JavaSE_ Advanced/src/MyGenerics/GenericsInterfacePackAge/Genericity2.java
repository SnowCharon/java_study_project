package MyGenerics.GenericsInterfacePackAge;

/**
 * @author MOYU
 * @File JavaSE_Study-MyGenerics.GenericsInterfacePackAge
 * @Date 2022/6/3 15:46
 **/
public class Genericity2 implements Generics<String> {

    @Override
    public void method(String string) {
        System.out.println(string);
    }
}
