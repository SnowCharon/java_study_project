package CollectionStudy.Collection.MySet.HashSet;

import java.util.HashSet;

/**
 * @author MOYU
 * @File JavaSE_Study-CollectionStudy.MySet.HashSet
 * @Date 2022/6/5 15:28
 **/
public class HashProject {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("Mike",18);
        Student s2 = new Student("Michael",18);
        Student s3 = new Student("Marry",20);
        Student s4 = new Student("Michael",18);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //没有重写HashCode方法，每个对象是new出来的，所以地址不同，所以都存入哈希表
        //重写方法后，根据成员变量计算，所以成员变量相同则是同一个对象
        System.out.println(hs);
    }
}
