package reflection_study.reflect_role;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author MOYU
 * @File JavaSE_Study-reflection_study.reflect_role
 * @Date 2022/6/27 13:53
 * 编译成class文件进入运行阶段时，泛型被自动擦除
 **/
public class Demo {
    public static void main(String[] args) throws Exception {
        //反射实现泛型擦除，加入其他类型的元素
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());

        //存储在同一个ArrayList集合
        System.out.println(list1.getClass() == list2.getClass());

        System.out.println("=========================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(22);
        //list3.add("好耶");
        Class<?> c = list3.getClass();
        //定位c类中的add方法
        Method add = c.getDeclaredMethod("add", Object.class);
        boolean result = (Boolean) add.invoke(list3, "好耶");
        System.out.println(list3);
        System.out.println(result);

        ArrayList list4 = list3;
        list4.add("哦哦哦！");
        System.out.println(list3);
    }
}
