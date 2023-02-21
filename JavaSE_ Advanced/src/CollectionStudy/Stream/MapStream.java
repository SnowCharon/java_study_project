package CollectionStudy.Stream;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 9:24
 **/
public class MapStream {
    public static void main(String[] args) {
        //双列集合
        HashMap<String,Integer> hm = new HashMap<>(Map.ofEntries(Map.entry("张三",19), Map.entry("李四",20), Map.entry("邢彦龙",20)));

        //获取Stream流，双列集合不可以直接获取，
        //keySet：先获取所有的键，再把Set集合中的所有键放到Stream流中
        hm.keySet().stream().forEach(System.out::println);

        //entrySet:现货区键值对对象，再把Set集合中的键值对对象放到Stream流中
        hm.entrySet().stream().forEach(System.out::println);
    }
}
