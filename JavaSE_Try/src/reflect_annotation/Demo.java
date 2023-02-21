package reflect_annotation;

import java.lang.reflect.Method;

/**
 * @author MOYU
 * @File JavaSE_Study-reflect_annotation
 * @Date 2022/7/8 11:22
 **/
public class Demo {
    public static void main(String[] args) throws Exception {
        //1.获得类对象
        Class<UseTest> testClass = UseTest.class;
        //创建对象
        UseTest useTest = new UseTest();

        //2.获取所有方法
        Method[] methods = testClass.getDeclaredMethods();

        //3.遍历判断方法是否有该注解
        for (Method method : methods) {
            //判断
            if (method.isAnnotationPresent(Test.class)){
                method.invoke(useTest);
            }

        }

    }
}
