package KeyWord.permissionStudy;

/**
 * @author 竹玄羽
 * @File package_utli
 * @date 2022/5/23  19:12
 **/
public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
        //f.private();    报错
        f.protectedMethod();
        f.Method();
        f.publicMethod();
    }
}
