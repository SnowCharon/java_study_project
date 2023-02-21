package KeyWord.Static_Study;

/**
 * @author 竹玄羽
 * @File Static_Study
 * @date 2022/5/22  20:33
 **/
public class Single_test_2 {
    public static void main(String[] args) {
        SingleInstance_2 sd = SingleInstance_2.getInstance();
        SingleInstance_2 sb = SingleInstance_2.getInstance();
        System.out.println(sd);
        System.out.println(sb);
    }

}
