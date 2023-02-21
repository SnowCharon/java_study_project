package reflection_study.reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author MOYU
 * @File JavaSE_Study-reflection_study.reflect_field
 * @Date 2022/6/27 13:23
 **/
public class Demo1Test {
    /**
     * 1.获取全部的成员变量
     * 获得所有的成员变量对应的field对象，只要申明了就可以得到
     */
    @Test
    public void getDeclaredFields(){
        //a.定位Class对象
        Class<?> c = Student.class;
        //b.定位全部成员变量
        Field[] fields = c.getDeclaredFields();
        //c.遍历
        for (Field field : fields) {
            System.out.println(field.getName() + "===>" + field.getType());
        }
    }

    /**
     * 2.获取某个成员变量
     */
    @Test
    public void getDeclaredField() throws NoSuchFieldException {
        //a.定位Class对象
        Class<?> c = Student.class;
        //b.根据名称定位某个成员变量
        Field field = c.getDeclaredField("age");
        System.out.println(field.getName() + "===>" + field.getType());
    }
}
