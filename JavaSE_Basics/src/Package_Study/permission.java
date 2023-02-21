package Package_Study;

/**
 * @author 竹玄羽
 * @File Package_Study
 * @date 2022/5/23  19:02
 * 权限修饰符学习
 * 权限修饰符：
 *                  同一个类中     同一个包中其他类    不同包下的子类(儿子)    不同包下的无关类
 * 1.private:私有       √
 * 2.缺省：默认          √             √
 * 3.protected:        √             √                 √
 * 4.public：权限最高    √             √                 √                  √
 **/
public class permission {
    public static void main(String[] args) {
        fu f = new fu();
        //f.private();              报错
        //f.protectedMethod();      报错
        //f.Method();               报错
        f.publicMethod();
    }
}
