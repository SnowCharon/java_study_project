package CollectionStudy.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author MOYU
 * @File JavaSE_Study-Map.HashMap
 * @Date 2022/6/5 17:38
 **/
public class HashMapProject {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("Mike", 18);
        Student s2 = new Student("Michael", 18);
        Student s3 = new Student("Marry", 20);
        Student s4 = new Student("Michael", 21);

        hm.put(s1, "北京");
        hm.put(s2, "西安");
        hm.put(s3, "宝鸡");
        hm.put(s4, "深圳");

        //三种方法遍历
        //1.键找值
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }

        System.out.println("======================================");

        //2.键值对
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }

        System.out.println("======================================");

        //3.直接点用Map方法
        hm.forEach(
                (Student key, String value) -> {
                    System.out.println(key + "---" + value);
                }
        );


    }
}
