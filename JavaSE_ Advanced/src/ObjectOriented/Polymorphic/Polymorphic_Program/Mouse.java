package ObjectOriented.Polymorphic.Polymorphic_Program;

/**
 * @author 竹玄羽
 * @File Polymorphic_Program
 * @date 2022/5/25  16:09
 **/
public class Mouse implements USB {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void Connect() {
        System.out.println(name + "成功接入设备！");
    }

    @Override
    public void unConnect() {
        System.out.println(name + "成功从设备弹出！");
    }

    //独有功能
    public void click() {
        System.out.println(name + "双击666！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
