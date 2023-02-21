package CollectionStudy.Collection.MySet.TreeSet;

import java.util.TreeSet;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet
 * @Date 2022/6/4 0:52
 **/
public class TreeSetTea {
    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<>((Teacher o1, Teacher o2) -> o2.getAge() - o1.getAge() == 0 ? o2.getName().compareTo(o1.getName()) : o2.getAge() - o1.getAge());

        Teacher t1 = new Teacher("Mike",24);
        Teacher t2 = new Teacher("Michael",18);
        Teacher t3 = new Teacher("John",26);
        Teacher t4 = new Teacher("Right",26);
        Teacher t5 = new Teacher("Left",22);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        ts.add(t5);

        System.out.println(ts);
    }
}
