package CollectionStudy.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MOYU
 * @File JavaSE_Study-Map
 * @Date 2022/6/5 16:15
 **/
public class MyMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //map.add()  错误使用
        map.put("12138","Marry");
        map.put("251314","Mike");
        map.put("123456","Michael");

        System.out.println(map);
    }
}
