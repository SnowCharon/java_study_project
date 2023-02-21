package ObjectOriented.InnerClass;

/**
 * @author MOYU
 * @File JavaSE_Study-InnerClass
 * @Date 2022/5/26 19:42
 **/
public class Test2 {
    public static void main(String[] args) {
        Outer.motion h = new Outer().new motion();
        h.setName("小傻龙");
        System.out.println(h.getName());
        h.show();
        Outer.motion.test();
    }
}
