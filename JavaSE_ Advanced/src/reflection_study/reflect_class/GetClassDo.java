package reflection_study.reflect_class;

/**
 * @author MOYU
 * @File JavaSE_Study-reflection_study.reflect_class
 * @Date 2022/6/26 20:42
 **/
public class GetClassDo {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        反射第一步，获取class
         */
        //1.class类中的一个静态方法：forName
        Class<?> c = Class.forName("reflection_study.reflect_class.Student");
        //Student.class
        System.out.println(c);

        //2.通过 类名.class
        Class<?> c1 = Student.class;
        System.out.println(c1);

        //3.对象.getClass 获取对象对应的Class对象
        Student s = new Student();
        Class<?> c2 = s.getClass();
        System.out.println(c2);
    }
}
