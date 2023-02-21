package CollectionStudy.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author MOYU
 * @File JavaSE_Study-Map
 * @Date 2022/6/5 20:28
 **/
public class StaticCollection {
    public static void main(String[] args) {
/*
        创建不可变集合，方便批量添加几何元素；
*/

//        Method1();

//        Method2();

//        Method3();

//        Method4();
    }

    private static void Method4() {
        //以键值对的形式创建不可变Map集合
        Map<String, String> map = Map.ofEntries(Map.entry("邢彦龙", "宝鸡"), Map.entry("季雨涵", "临潼"));
        System.out.println(map);
    }


    private static void Method3() {
        //普通创建不可变Map集合
        Map<String, Integer> map = Map.of("张三", 18, "Mike", 20, "Jhon", 26);
        System.out.println(map);
    }

    private static void Method2() {
        //注意，set集合元素不能重复，因此在创建是不能重复元素，不然会报错
        Set<String> set = Set.of("a","b","c");
        System.out.println(set);
    }

    private static void Method1() {
        //创建不可变集合List,默认是static修饰的
        List<String> s = List.of("a", "b", "c");
        System.out.println(s);
        /*s.add("q");
        s.remove("a");
        不可变集合不能在添加或者删除
        */

        //作用：集合的批量添加
        //list.of创建一个不可变集合，作为可编辑和的元素
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        System.out.println(list);
        list.add("好耶！");
        System.out.println(list);
    }
}
