package KeyWord.Static_Study;

/**
 * @author 竹玄羽
 * @File Static_Study
 * @date 2022/5/22  19:51
 **/
public class StaticCode {

    public static String schoolName;

    /**
     static修饰，与方法的加载同步，优先于main方法，自动触发执行
     作用：初始化静态资源
     */
    static {
        System.out.println("=======static方法被触发==========");
        schoolName = "宝鸡文理学院";
    }




    public static void main(String[] args) {
        System.out.println("=============main方法被触发=============");
        System.out.println(schoolName);
    }


}
