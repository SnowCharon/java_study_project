package KeyWord.Static_Study;

/**
 * @author 竹玄羽
 * @File Static_Study
 * @date 2022/5/22  19:59
 **/
public class Staticnone {
    private String name;   //实例资源

    public  Staticnone(){
        System.out.println("无参构造器被触发！");
    }

    //无static修饰，属于对象，每次对象被创建时触发    初始化实例资源.->废物
    {
        System.out.println("实例代码块被触发！");
        name = "凤舞云裳";
    }


    public static void main(String[] args) {
        Staticnone sd = new Staticnone();
        Staticnone sb = new Staticnone();
        System.out.println(sb.name);
    }
}
