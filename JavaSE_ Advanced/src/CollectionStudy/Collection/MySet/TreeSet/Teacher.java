package CollectionStudy.Collection.MySet.TreeSet;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet
 * @Date 2022/6/4 0:48
 **/
public class Teacher {
    private String name;
    private int age;

    public Teacher(){
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
