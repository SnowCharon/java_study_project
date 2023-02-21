package ObjectOriented.InnerClass;

/**
 * @author MOYU
 * @File JavaSE_Study-InnerClass
 * @Date 2022/5/26 20:57
 **/
public class Test4 {
    public static void main(String[] args) {

        /*
        局部内部类
         */
        class Cat {
            private String name;
            public static int age = 10;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Cat c = new Cat();
        c.setName("叮当猫");
        System.out.println(c.getName());
    }

    /*
    这种定义，可以，但没必要，因为一切都在这个static类中
     */
    static{
        //接口
        interface a{

        }

        //抽象类
        abstract class ab{

        }

        class Dog{

        }

    }
}
