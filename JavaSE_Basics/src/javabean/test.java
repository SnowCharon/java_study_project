package javabean;

/**
 * @author 竹玄羽
 * @File javabean
 * @date 2022/5/18  17:41
 **/
public class test {
    public static void main(String[] args) {
        //1.创建对象封装数据，无参数构造器；
        User u1 = new User();
        u1.setName("董佳杰");
        u1.setHeight(165);
        u1.setSex('女');
        u1.setAge(16);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSex());
        System.out.println(u1.getAge());

        //2.创建有参构造器
        User u2 = new User("董佳杰",165,'女',16);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSex());
        System.out.println(u2.getAge());
    }
}
