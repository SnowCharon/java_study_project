package OOP;

/**
 * @author MOYU
 * @File JavaSE_Study-OOP
 * @Date 2022/6/7 10:35
 **/
public abstract class Athletes extends People{
    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }

    /**
     * 实现运动员学习
     */
    public abstract void study();
}
