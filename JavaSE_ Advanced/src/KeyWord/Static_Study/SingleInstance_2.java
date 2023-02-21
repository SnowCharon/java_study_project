package KeyWord.Static_Study;

/**
 * @author 竹玄羽
 * @File Static_Study
 * @date 2022/5/22  20:33
 * 懒汉单例
 **/
public class SingleInstance_2 {
    /*
    2.定义一个静态成员变量
     */
    private static SingleInstance_2 instance;

    /*
    提供方法，对外返回单例对象
     */
    public static SingleInstance_2 getInstance(){
        if (instance == null){
            instance = new SingleInstance_2();
        }
        return instance;
    }



    //1.私有化
    private SingleInstance_2(){

    }
}
