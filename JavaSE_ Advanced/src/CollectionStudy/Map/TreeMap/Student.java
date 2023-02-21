package CollectionStudy.Map.TreeMap;

/**
 * @author MOYU
 * @File JavaSE_Study-Map.HashMap
 * @Date 2022/6/5 17:38
 **/
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        //主要年龄，次要姓名
        int result = o.getAge() - this.getAge();
        result = result == 0 ? o.name.compareTo(this.getName()) : result;
        return result;
    }
}
