package ObjectOriented.Polymorphic.Polymorphic_Program;

/**
 * @author 竹玄羽
 * @File Polymorphic_Program
 * @date 2022/5/25  16:16
 **/
public class Computer {
    /*
    提供安装接口
     */
    public void installUSB(USB u){
        u.Connect();

        //独有功能
        if (u instanceof Mouse){
            Mouse m = (Mouse) u;
            m.click();
        }else if (u instanceof KeyBoard){
            KeyBoard k = (KeyBoard) u;
            k.KeyDown();
        }


        u.unConnect();
    }
}
