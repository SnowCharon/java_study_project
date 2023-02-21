package reflection_study.reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author MOYU
 * @File JavaSE_Study-reflection_study.reflect_constructor
 * @Date 2022/6/27 13:10
 **/
public class StudentNewTest {
    /**
     * A.调用无参构造器得到一个类的返回对象
     */
    @Test
    public void getDeclaredConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1.获取类对象
        Class<?> c = Student.class;

        //2.定位某个构造器对象（安早餐书定位无参构造器）
        Constructor<?> constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());

        //如果遇到私有的构造器，可以暴力反射，即强行打开权限
        constructor.setAccessible(true);

        Student s1 = (Student)constructor.newInstance();
        System.out.println(s1);

        //3.定位某个有参构造器
        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor.getName() + "===>" + declaredConstructor.getParameterCount());
       Student s2 = (Student) declaredConstructor.newInstance("小明",10);
        System.out.println(s2);
    }
}
