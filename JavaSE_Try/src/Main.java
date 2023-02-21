public class Main {
    //这个方法程序员负责写出来，JVM负责调用。JVM一定会传一个数组过来
    public static void main(String[] args) {
        if (args.length == 2) {
            if ("admin".equals(args[0]) && "123".equals(args[1])) {
                System.out.println("欢迎" + args[0] + "使用本系统.........");
            } else {
                System.out.println("用户名或密码错误");
            }
        } else {
            System.out.println("账号密码格式错误，请输入两个参数，例如：hhh 123");
        }
    }

}