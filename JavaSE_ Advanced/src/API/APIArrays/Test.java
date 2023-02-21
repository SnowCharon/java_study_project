package API.APIArrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author MOYU
 * @File JavaSE_Study-Arrays_Study
 * @Date 2022/5/30 15:43
 **/
public class Test {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student("李红华",23,175.6);
        s[1] = new Student("李华",22,172);
        s[2] = new Student("李涛",19,174);
        s[3] = new Student("邢彦龙",20,175);
        s[4] = new Student("好耶",18,176);
        System.out.println(Arrays.toString(s));

        /*拿年龄进行比较
        Arrays.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(Arrays.toString(s));
        */

        Arrays.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getHeight() , o1.getHeight());
            }
        });
        System.out.println(Arrays.toString(s));

    }
}
