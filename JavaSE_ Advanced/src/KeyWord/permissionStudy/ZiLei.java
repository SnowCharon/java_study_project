package KeyWord.permissionStudy;

/**
 * @author 竹玄羽
 * @File package_util
 * @date 2022/5/23  19:17
 **/
public class ZiLei extends Fu {
    public static void main(String[] args) {
        ZiLei zi = new ZiLei();
        //f.private();              报错
        //f.protectedMethod();      报错
        zi.Method();
        zi.publicMethod();
    }
}
