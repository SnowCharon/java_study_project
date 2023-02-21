package MyGenerics.GenericsInterfacePackAge;

/**
 * @author MOYU
 * @File JavaSE_Study-MyGenerics
 * @Date 2022/6/3 15:37
 **/
public class Genericity1<E> implements Generics<E> {
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
