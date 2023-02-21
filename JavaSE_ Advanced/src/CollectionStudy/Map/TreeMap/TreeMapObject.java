package CollectionStudy.Map.TreeMap;

import java.util.TreeMap;

/**
 * @author MOYU
 * @File JavaSE_Study-Map.TreeMap
 * @Date 2022/6/5 18:10
 **/
public class TreeMapObject {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("Mike", 24);
        Student s2 = new Student("Marry", 21);
        Student s3 = new Student("Michael", 21);

        tm.put(s1,"北京");
        tm.put(s2,"西安");
        tm.put(s3,"深圳");

       tm.forEach(
               (Student key, String value)->{
                   System.out.println(key + "---" + value);
               }
       );
    }
}
