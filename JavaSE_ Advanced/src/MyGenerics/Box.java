package MyGenerics;

/**
 * @author MOYU
 * @File JavaSE_Study-MyGenerics
 * @Date 2022/6/2 21:38
 **/
public class Box<E> {
    private E element;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
