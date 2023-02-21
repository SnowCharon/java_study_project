package ObjectOriented.Polymorphic.Polymorphic_Program;

/**
 * @author 竹玄羽
 * @File Polymorphic_Program
 * @date 2022/5/25  16:13
 **/
public class KeyBoard implements USB {
    public String name;

    public KeyBoard(String name) {
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

    //独有方法
    public void KeyDown(){
        System.out.println(name + "老铁666！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
