package MyGenerics;

import java.util.ArrayList;

/**
 * @author MOYU
 * @File JavaSE_Study-MyGenerics
 * @Date 2022/6/2 21:50
 **/
public class GenericsFunction {
    public static void main(String[] args) {
        /*
        自定义泛型方法：
            格式：修饰符<类型> 返回值类型 方法名（类型 变量名）{}
            eg: public<T> void fun(T t){}
         */
        ArrayList<String> strings = addElement(new ArrayList<String>(), "aaa", "好耶", "bbb", "xxx");
        System.out.println(strings);
    }

    public static <T> ArrayList<T> addElement(ArrayList<T> list,T t1,T t2,T t3,T t4){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        return list;
    }
}
