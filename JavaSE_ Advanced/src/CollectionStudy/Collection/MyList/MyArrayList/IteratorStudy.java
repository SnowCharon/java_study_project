package CollectionStudy.Collection.MyList.MyArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author MOYU
 * @File JavaSE_Study-MyCollection
 * @Date 2022/5/31 20:02
 **/
public class IteratorStudy {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        //1.获取迭代器对象，一旦被创建指向集合0索引
        Iterator<String> it = list.iterator();
        //利用迭代器方法遍历集合
        //当前位置是否有元素可以被去除
        //System.out.println(it.hasNext());
        //去除当前未知的数据，再把迭代器指向下一个索引
        //System.out.println(it.next());
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(it.hasNext());
            System.out.println(it.next());
        }*/

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
