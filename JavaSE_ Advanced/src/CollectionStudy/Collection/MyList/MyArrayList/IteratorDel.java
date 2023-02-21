package CollectionStudy.Collection.MyList.MyArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author MOYU
 * @File JavaSE_Study-MyCollection
 * @Date 2022/5/31 20:14
 *
 * 1.相对索引进行操作用原始for
 * 2.想删除用迭代器
 * 3.仅仅遍历用增强for
 *
 **/
public class IteratorDel {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list);

      /*  for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("b")){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);*/

       /* for (int i = list.size() - 1;i >= 0; i--) {
            String s = list.get(i);
            if (s.equals("b")){
                list.remove(i);
            }
        }
        System.out.println(list);*/

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.equals("b")){
                it.remove();
            }
        }
        System.out.println(list);

        //增强for循环----仅仅适用于实现了Iterable接口的类
        //1.该数据类型必须与集合或者数组的数据类型一样
        //2.str仅仅代表的当前元素，
        //3.list就是被便利的数组或者集合
        for(String str : list){
            System.out.println(str);
        }
        for (String s : list) {
            System.out.println(s);
        }

        //str如同创建了了一个新的容器来接收传过来的值，它改变不会影响原来数组或者集合的值
        for(String str : list){
            str = "q";
            System.out.println(str);
        }
        System.out.println(list);
    }
}
