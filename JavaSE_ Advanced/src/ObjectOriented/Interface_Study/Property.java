package ObjectOriented.Interface_Study;

/**
 * @author MOYU
 * @File JavaSE_Study-ObjectOriented.Interface_Study
 * @Date 2022/6/5 18:01
 **/
public class Property {
    /*
        1.接口不能创建对象
        2.一个类实现多个接口，多个接口静态方法不冲突（静态方法是接口名.方法名调用）
        3.一个类继承了父类，又实现了接口，父类和接口同名方法，默认用父类    父类：亲爹    接口：干爹
        4.一个类实现多个接口，多个接口的默认方法重名，不冲突，这个类重写方法即可；
        5.一个类继承多个接口没问题，如果接口相互规则冲突则不行

        接口中的方法：
                1.必须default 修饰，默认public修饰   默认方法等于实例方法
                 ---默认方法，接口不能创建对象，只能过继给实现类，有实现类的对象调用
                2.静态方法，static修饰，默认还是public
                  ----必须静态接口名才能调用
                3.----1.9之后才行的私有方法：private 修饰
                  ---接口内才能访问
     */
}
