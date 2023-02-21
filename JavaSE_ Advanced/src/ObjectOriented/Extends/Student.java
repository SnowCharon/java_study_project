package ObjectOriented.Extends;

/**
 * @author 竹玄羽
 * @File Extends
 * @date 2022/5/23  15:08
 * 子类
 * 继承：提高代码复用性，减少代码冗余，增强类的功能扩展性
 **/
public class Student extends People {
    /*
    独有行为   反馈
     */
    public void writeInfo(){
        System.out.println("学生" + getName() + "写下反馈。");
    }

}
