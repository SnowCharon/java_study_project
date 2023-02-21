package CollectionStudy.Collection.MySet.HashSet;

import java.util.Objects;

/**
 * @author MOYU
 * @File JavaSE_Study-CollectionStudy.MySet.HashSet
 * @Date 2022/6/5 14:54
 **/
public class Student {
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
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (age != student.age) {
            return false;
        }
        return Objects.equals(name, student.name);
    }

    /**
     * 我们可以对Object中的HashCode方法进行重写，重写后就是根据对象属性值来计算哈希值，跟地址就没关系了
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
