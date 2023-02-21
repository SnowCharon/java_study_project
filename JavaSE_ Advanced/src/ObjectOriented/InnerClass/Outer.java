package ObjectOriented.InnerClass;

/**
 * @author MOYU
 * @File JavaSE_Study-InnerClass
 * @Date 2022/5/26 19:42
 **/
public class Outer {
    /*
    学习内部类，内部类不能加static修饰
     */

    public class motion {
        private String name;
        private int age;
        public static int num = 10;    //JDK16以后可以使用

        public motion() {
        }

        public motion(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static void test() {
            System.out.println(num);
        }

        public static int getNum() {
            return num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static void setNum(int num) {
            motion.num = num;
        }

        public void show() {
            System.out.println("姓名：" + name);
        }
    }

}
