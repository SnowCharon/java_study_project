package MyGenerics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-MyGenerics
 * @Date 2022/6/2 21:29
 **/
public class GenericsClass {
    public static void main(String[] args) {
        //类后面有<E> ---> 泛型类
        ArrayList<String> list = new ArrayList<>();
        list.add("好耶！");
        list.add("好耶！");
        list.add("好耶！");
        //将list集合转换成数组并返回，如果时空参，则返回Object类型

        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
        //泛型方法
        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(strings));

        /*
        泛型类的定义格式：
                    格式： 修饰符 class 类名<类型>{}
                    eg:public class Generics<T>{}
                    T为任意标识符，还有T,E,K,V
         */

        Box<Integer> box = new Box();
        box.setElement(5);
        System.out.println(box.getElement());
    }
}
