package practice4;

/**
 * @title: MainClass
 * @Author 竹玄羽
 * @Date: 2022/10/8 8:33
 */

public class MainClass {
    public static void main(String[] args) {
        TV haierTV = new TV();
        haierTV.setChannel(5);

        System.out.println("haierTV的频道是"+haierTV.getChannel());

        Family zhangSanFamily = new Family();
        zhangSanFamily.buyTV(haierTV);

        System.out.println("zhangSanFamily开始看电视");
        zhangSanFamily.seeTV();

        int m=2;
        System.out.println("hangSanFamily将电视更换到" + m + "频道");
        zhangSanFamily.remoteControl(m);
        System.out.println("haierTV的频道是"+haierTV.getChannel());
        System.out.println("hangSanFamily再看电视节目");
        zhangSanFamily.seeTV();
    }
}
