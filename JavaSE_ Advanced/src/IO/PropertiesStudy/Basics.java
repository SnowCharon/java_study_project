package IO.PropertiesStudy;

import java.util.Properties;
import java.util.Set;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.PropertiesStudy
 * @Date 2022/6/11 19:22
 **/
public class Basics {
    public static void main(String[] args) {
        //1.设置集合的键和值，String类型，底层调用Hashtable方法  = put
        Properties properties = new Properties();
        properties.setProperty("陕西","西安");
        properties.setProperty("江苏","南京");
        properties.setProperty("安徽","西安");
        System.out.println(properties);

        //通过键获取值 = get
        String value = properties.getProperty("陕西");
        System.out.println(value);

        //从该属性列表中返回一个不可修改的键集 = keyset
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            System.out.println(properties.getProperty(key));
        }
    }
}
