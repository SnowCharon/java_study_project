package CollectionStudy.Collection.MyList.MyArrayList;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author MOYU
 * @File JavaSE_Study-MyCollection
 * @Date 2022/5/31 19:46
 **/
public class Test2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //1.添加元素
        collection.add("a");
        collection.add("motion");
        collection.add("b");
        collection.add("moon");
        System.out.println(collection);

        //2.移除指定元素,删除成功返回true,删除失败返回false
        collection.remove("a");
        System.out.println(collection);

        //3.根据条件进行删除
        collection.removeIf(
                (String s) -> s.length() == 4);
        System.out.println(collection);

        //4.清空
       /* collection.clear();
        System.out.println(collection);*/

        //5.判断集合中是否有指定元素
        System.out.println(collection.contains("b"));

        //6.检测集合是否为空
        System.out.println(collection.isEmpty());
        /*collection.clear();
        System.out.println(collection.isEmpty());*/

        //7.集合的长度
        System.out.println(collection.size());
    }
}
