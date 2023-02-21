package ObjectOriented.Interface_Study;

/**
 * @author 竹玄羽
 * @File API_interface
 * @date 2022/5/24  19:39
 **/
public interface InterfaceDemo1 {
    /*
    接口中的成分，jdk8以前只有常量和抽象方法方法
     */
    //1.常量
    String SchoolName = "华清中学";
   // public static final String SchoolName = "华清中学";

    //2.抽象方法
    void run();
    // public abstract void run();
}
