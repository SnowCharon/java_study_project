package OOP;

/**
 * @author MOYU
 * @File JavaSE_Study-OOP
 * @Date 2022/6/7 10:34
 **/
public abstract class Coach extends People{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    /**
     * 实现教练教导
     */
    public abstract void teach();
}
