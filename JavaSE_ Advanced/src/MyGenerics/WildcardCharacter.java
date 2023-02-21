package MyGenerics;

import java.util.ArrayList;

/**
 * @author MOYU
 * @File JavaSE_Study-MyGenerics
 * @Date 2022/6/3 15:51
 **/
public class WildcardCharacter {
    /**
     * 类型通配符：<?>
     *      ArrayList<?>：表示元素类型未知的ArrayList，它的元素可以匹配任何的类型
     *      但是并不能把元素添加到ArrayListList中了，获取出来的也是Object类型
     *
     * 类型通配符上限：<? extends 类型>
     *      ArrayList<? extends Number>：它表示的类型是Number或者其子类型
     *
     * 类型通配符下限：<? super 类型>
     *      ArrayList<? super Number>：它表示的类型是Number或者其父类型
     */

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        printList(list1);
        printList(list2);

        //method1(list1);
        method1(list2);
        method1(list3);
       // method1(list4);    这两个都不属于Number或者他的子类

        //method2(list1);
        //method2(list2);
        method2(list3);
        method2(list4);
    }

    //传入的类型只要是数组集合就行
    private static void printList(ArrayList<?> list) {

    }

    //传入的数组类型还必须是Number类型或者是继承了Number的类
    public static void method1(ArrayList<? extends Number> list){

    }

    //传入的数组类型还必须是Number类型或者是Number的父类
    public static void method2(ArrayList<? super Number> list){

    }
}
