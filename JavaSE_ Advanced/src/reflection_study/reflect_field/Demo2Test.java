package reflection_study.reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author MOYU
 * @File JavaSE_Study-reflection_study.reflect_field
 * @Date 2022/6/27 13:35
 **/
public class Demo2Test {
    @Test
    public void getDeclaredField() throws Exception {
        //a.定位Class对象
        Class<?> c = Student.class;
        //b.根据名称定位某个成员变量
        Field field = c.getDeclaredField("age");

        //暴力反射，更改权限
        field.setAccessible(true);

        //c.赋值
        Student s = new Student();
        //s.setAge(18);
        field.set(s,10);

        System.out.println(s);

        //d.取值
        int age = (int)field.get(s);
        System.out.println(age);
    }
}
