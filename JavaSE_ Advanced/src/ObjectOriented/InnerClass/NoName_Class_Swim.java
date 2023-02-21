package ObjectOriented.InnerClass;

/**
 * @author MOYU
 * @File JavaSE_Study-InnerClass
 * @Date 2022/5/28 17:20
 * 掌握匿名类使用语法
 **/
public class NoName_Class_Swim {
    public static void main(String[] args) {
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("学生快乐泳~");
            }
        };
        go(s);
        s.swim();
    }
    //学生老师都会游泳
    public static void go(Swim s){
        System.out.println("开始~");
        s.swim();
        System.out.println("结束~");
    }
}

/*class Student implements Swim{
    @Override
    public void swim() {
        System.out.println("学生快乐泳~");
    }
}

class Teach implements Swim{
    @Override
    public void swim() {
        System.out.println("老师快乐泳~");
    }
}*/

interface Swim{
    void swim();
}