package IO.PropertiesStudy;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.PropertiesStudy
 * @Date 2022/6/11 19:08
 **/
public class Dome {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //增
        properties.put(1, "好耶！");
        properties.put(2, "哈哈哈！");
        properties.put(3, "邢彦龙");
        properties.put(4, "代静酉");
        properties.put(5, "季宇晗");
        properties.put(6, "黄晨");
        System.out.println(properties);
        //删
        properties.remove(1);
        System.out.println(properties);
        //改
        //put--当键不存在则添加，存在则覆盖
        properties.put(2,"哈哈");
        System.out.println(properties);
        //查
        //1.通过键找
        Object value = properties.get(5);
        System.out.println(value);
            //2.通过遍历查找----键找值
        Set<Object> keys = properties.keySet();
        for (Object key : keys) {
            Object o = properties.get(key);
            System.out.println(key + "=" + o);
        }
             //2.通过遍历查找----键值对
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
