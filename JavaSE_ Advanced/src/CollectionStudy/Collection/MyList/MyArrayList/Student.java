package CollectionStudy.Collection.MyList.MyArrayList;

/**
 * @author MOYU
 * @File JavaSE_Study-MyCollection
 * @Date 2022/5/31 20:43
 **/
public class Student {
    private String name;
    private String id;
    private int age;
    private char sex;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Student(String name, String id, int age, char sex) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;


    }
}
