package operation;

/**
 * @author 竹玄羽
 * @File operation
 * @date 2022/5/14  9:54
 **/
public class add_character {
    public static void main(String[] args) {
        int a = 10;
        char c = 'A';
        System.out.println(a + c);

        //字符串拼接  从左到右
        System.out.println("I " + "love " + "you" + '!');
        System.out.println("China" + 666);
        //字符串在前，直接进行拼接
        System.out.println("中国" + 6 + 66);
        //字符串在后，先进行运算在拼接
        System.out.println(1 + 99 + "年好合");
    }
}
