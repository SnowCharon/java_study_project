package CollectionStudy.Collection.MySet.TreeSet;

import java.util.TreeSet;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet
 * @Date 2022/6/3 22:26
 **/
public class TreeSetStu {
    public static void main(String[] args) {
        TreeSet<StudentTry> ts = new TreeSet<>();

        StudentTry s1 = new StudentTry("mike",15);
        StudentTry s2 = new StudentTry("sear",18);
        StudentTry s3 = new StudentTry("fuck",19);
        StudentTry s4 = new StudentTry("bool",24);
        StudentTry s5 = new StudentTry("michael",19);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);
    }
}
