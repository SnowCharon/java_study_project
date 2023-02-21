package reflection_study.reflect_framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    /**
     * 保存任意类型的对象
     *
     * @param obj
     */
    public static void save(Object obj) {
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\reflection_study\\reflect_framework\\a.txt",true));
            //1.提取这个对象的全部成员变量
            Class<?> c = obj.getClass();
            printStream.println("==========" + c.getSimpleName() + "==========");
            //2.提取他的全部成员变量
            Field[] fields = c.getDeclaredFields();
            //3.获取成员变量的信息
            for (Field field : fields) {
                String name = field.getName();
                //提取本成员变量在对象中的值
                field.setAccessible(true);
                String value = field.get(obj) + "";
                printStream.println(name + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
