package operation;

/**
 * @author 竹玄羽
 * @File operation
 * @date 2022/5/14  10:56
 **/
public class ternary {
    public static void main(String[] args) {
        float a = 168.59f;
        float b = 172.5f;
        float c = 175.6f;

        System.out.println((a>b)?((a>c?a:c)):(b>c)?b:c);
    }
}
