package CollectionStudy.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author MOYU
 * @File JavaSE_Study-Map
 * @Date 2022/6/5 17:09
 **/
public class ErgodicMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //添加键值对
        map.put("1号丈夫","1号妻子");
        map.put("2号丈夫","2号妻子");
        map.put("3号丈夫","3号妻子");
        map.put("4号丈夫","4号妻子");
        map.put("5号丈夫","5号妻子");

        //第一种方法：通过键和值一一对应，先获取键在获取值

        //获取键
        Set<String> keys = map.keySet();
        //遍历键
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }

        System.out.println("======================================");

        //第二种方法：获取所有键值对，然后站到每个键值对中的键和值

        //获取所有键值对
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //得到每一个键值对对象
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }

        System.out.println("======================================");

        //直接点用Map方法
        map.forEach(
                (String key,String value) -> {
                    System.out.println(key + "---" + value);
                }
        );
    }
}
