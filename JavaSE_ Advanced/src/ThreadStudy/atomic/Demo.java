package ThreadStudy.atomic;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.atomic
 * @Date 2022/6/19 20:48
 **/
public class Demo {
    public static void main(String[] args) {
        MyAtomThread myAtomThread = new MyAtomThread();
        for (int i = 0; i < 100; i++) {
            new Thread(myAtomThread).start();
        }
    }
}
