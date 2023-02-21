package CollectionStudy.Collection.MyList.MyArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MOYU
 * @File JavaSE_Study-List.MyList
 * @Date 2022/6/1 16:48
 **/
public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        addByIndex(list);

        removeByIndex(list);

        setByIndex(list);

        //返回指定索引处元素
        String s  = list.get(0);
        System.out.println(s);

    }

    private static void setByIndex(List<String> list) {
        //根据索引修改元素，返回被修改的元素
        String result = list.set(0,"好耶");
        System.out.println(result);
        System.out.println(list);
    }


    private static void removeByIndex(List<String> list) {
        //根据索引删除元素，并把删除元素返回
        //list中有两个remove
        //1.删除指定元素，返回是否删除成功
      /*  boolean b = list.remove("aaa");
        System.out.println(b);*/
        //2.删除指定索引的元素，返回被删除的元素
        String s = list.remove(0);
        System.out.println(s);
        System.out.println(list);
    }

    private static void addByIndex(List<String> list) {
        //add----根据索引在集合中插入元素，原来元素往后靠
        list.add(0, "eee");
        System.out.println(list);
    }
}
