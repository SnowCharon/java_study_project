package annotations.project;

import java.lang.reflect.Method;

/**
 * @author MOYU
 * @File JavaSE_Study-annotations.project
 * @Date 2022/6/29 21:28
 **/
public class Test {
    @MyTest
    public void test1(){
        System.out.println("=====test1=====");
    }

    public void test2(){
        System.out.println("=====test2=====");
    }

    @MyTest
    public void test3(){
        System.out.println("=====test3=====");
    }

    /**
     * 启动菜单
     * @param args 数组参数
     */
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        //a.获取类对象
        Class<Test> testClass = Test.class;
        //2.提取全部方法
        Method[] methods = testClass.getDeclaredMethods();
        //3.遍历方法，看是否有注解---想跑谁就给谁标记
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                //run
                method.invoke(test);
            }
        }
    }
}
