package CollectionStudy.Collection.MySet.TreeSet;

import java.util.TreeSet;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet.TreeSet
 * @Date 2022/6/5 1:17
 **/
public class TreeSetProject {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(/*(Student o1, Student o2) -> (int) (o2.getChinese() - o1.getChinese() == 0 ? o2.getMath() - o1.getMath() : o2.getEnglish() - o1.getEnglish())*/);

        Student s1 = new Student("Mike", 99, 68, 22);
        Student s2 = new Student("Michael", 100, 90, 95);
        Student s3 = new Student("Jhon", 54, 96, 75);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);
    }
}
