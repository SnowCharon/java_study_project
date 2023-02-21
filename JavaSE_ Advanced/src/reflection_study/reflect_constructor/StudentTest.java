package reflection_study.reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author MOYU
 * @File JavaSE_Study-reflection_study.reflect_constructor
 * @Date 2022/6/27 12:53
 **/
public class StudentTest {
    /**
     * 获取构造器，只能获取public修饰的构造器
     */
    @Test
    public void getConstructors() {
        //1.获取类队象
        Class<?> c = Student.class;
        //2.提取类中的全部的构造器对象
        Constructor<?>[] constructors = c.getConstructors();
        //3.遍历构造器
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    /**
     * 获取全部的构造器，无论权限
     */
    @Test
    public void getDeclaredConstructors() {
        //1.获取类队象
        Class<?> c = Student.class;
        //2.提取类中的全部的构造器对象
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        //3.遍历构造器
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    /**
     * 获取某个构造器，只能那public修饰的某个构造器
     */
    @Test
    public void getConstructor() throws NoSuchMethodException {
        //1.获取类队象
        Class<?> c = Student.class;
        //2.定位单个构造器对象(按照参数定位无参数构造器)
        Constructor<?> constructor = c.getConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
    }

    /**
     * 获取某个构造器，无论权限
     */
    @Test
    public void getDeclaredConstructor() throws NoSuchMethodException {
        //1.获取类队象
        Class<?> c = Student.class;
        //2.提取类中的无参构造器对象
        Constructor<?> constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());

        //3.提取类中的有参构造器对象
        Constructor<?> cons = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(cons.getName() + "===>" + cons.getParameterCount());
    }
}

