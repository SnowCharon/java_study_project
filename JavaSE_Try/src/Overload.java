/**
 * @author MOYU
 * @File JavaSE_Study-PACKAGE_NAME
 * @Date 2022/5/28 20:45
 **/
public class Overload {
    public static void main(String[] args) {
        /*
        静态方法也可以重载
         */
        over_load();
        System.out.println("=========================");
        over_load(5);
    }

    public static void over_load(){
        System.out.println("好耶！");
    }

    public static void over_load(int a){
        for (int i = 0;i < a;i++) {
            System.out.println("好耶！");
        }
    }
}
