package CollectionStudy.Collection.MySet.TreeSet;

import java.util.Objects;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet
 * @Date 2022/6/3 22:19
 **/
public class StudentTry implements Comparable<StudentTry> {
    private String name;
    private int age;

    public StudentTry() {
    }

    public StudentTry(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name + '\'' +
                ", age=" + age + '}';
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
    public int compareTo(StudentTry o) {
        //自定义排序规则
        /*int result = o.age - this.age;
        result = result == 0 ? this.name.compareTo(o.getName()) : result;*/
        //主要判断为年龄，然后再根据名字排序
        return  o.age - this.age == 0 ? this.name.compareTo(o.getName()) : o.age - this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StudentTry that = (StudentTry) o;

        if (age != that.age) {
            return false;
        }
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
