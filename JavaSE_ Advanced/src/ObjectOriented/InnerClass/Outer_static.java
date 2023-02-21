package ObjectOriented.InnerClass;

public class Outer_static {
    //静态成员变量可以被内部类访问
    public static String moon = "荷塘月色";
    //私有成员变量不可以被访问
    private int data = 5;

    /*
    学习静态内部类
     */
    public static class inner {
        private static String schoolName;
        private String name;
        private int age;

        public inner() {
        }

        public inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            inner.schoolName = schoolName;
        }

        public void show() {
            System.out.println("好耶！");
            System.out.println(moon);
            //直接访问不行
            // System.out.println(data);
            //新建一个外部类对象，通过对象访问
            Outer_static o = new Outer_static();
            System.out.println(o.data);
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
    }
}
