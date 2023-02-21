package OOP;

/**
 * @author MOYU
 * @File JavaSE_Study-OOP
 * @Date 2022/6/7 10:36
 **/
public abstract class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人要吃饭！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
