package Package;

/**
 * @author MOYU
 * @File JavaSE_Study-pack
 * @Date 2022/5/29 19:35
 * 集合类型和泛型都不支持基本数据类型
 **/
public class Package {
    //自动装箱：基本类型的数据和变量可以赋值给包装类型的变量
    //自动拆箱：包装类型的数据和变量可以赋值给基本类型的变量
    public static void main(String[] args) {
        int a = 10;
        Integer b = 11;
        Integer c = a;//自动装箱
        int d = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //double ch = null;  报错
        Double ch = null;

        System.out.println("===============");
        //1.包装类可以将基本类型变成字符串类型
        Integer e = 25;
        String s = e.toString();
        System.out.println(s + 5);

        String s2 = Integer.toString(e);
        System.out.println(s + 6);

        /*
        包装类型可以转化数据类型
         */
        String num = "23";
        //int a2 = Integer.parseInt(num);
        int a2 = Integer.valueOf(num);
        System.out.println(a2 + 1);
    }
}
