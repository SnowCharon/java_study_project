package API.APIObject;

import java.util.Objects;

/**
 * @author MOYU
 * @File JavaSE_Study-API
 * @Date 2022/5/29 1:09
 **/
public class TestEquals {
    public static void main(String[] args) {
        /*
        equals比较两者的地址
         */
        Student s1 = new Student("hello",15,'男');
        Student s2 = new Student("hello",15,'男');
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));  //重写前，new出来的对象地址根本不同，冲重写后内容可以比较
        System.out.println(Objects.equals(s1, s2));
        System.out.println(s1 == s2);
    }

}
