package ObjectOriented.InnerClass;

/**
 * @author MOYU
 **/
public class Test1 {
    public static void main(String[] args) {
        Outer_static.inner in = new Outer_static.inner();
        in.setName("董佳杰");
        System.out.println(in.getName());

        for (int i = 0; i < 100; i++) {
            System.out.println("大傻蛋是");
            System.out.println(in.getName());
        }


        in.show();
    }

}
