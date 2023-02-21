package ObjectOriented.Polymorphic.Polymorphic_Program;

/**
 * @author 竹玄羽
 * @File Polymorphic_Program
 * @date 2022/5/25  16:07
 * USB设备
 * 1.定义接口：接入，拔出
 * 2.定义2个USB的实现类：鼠标，键盘
 * 3.创建电脑对象，USB对象
 **/
public class Test {
    public static void main(String[] args) {
        //a.创建电脑对象
        Computer c = new Computer();
        //b.创建USB设备
        USB m = new Mouse("小新");
        USB k = new KeyBoard("小白");

        c.installUSB(m);
        c.installUSB(k);
    }


}
