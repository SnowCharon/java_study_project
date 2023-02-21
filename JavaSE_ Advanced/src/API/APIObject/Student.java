package API.APIObject;

import java.util.Objects;

/**
 * @author MOYU
 * @File JavaSE_Study-API
 * @Date 2022/5/29 0:59
 **/
public class Student { //extends Object
    private String name;
    private int age;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /*
    方法重写
    s1 -> this
    s2 -> o
     */
    /*@Override
    public boolean equals(Object o){
        //1.判断是否是同一个类
        if(o instanceof Student){
            Student s = (Student) o;
            //2.判断两个对象的内容
            /*if (this.name.equals(s.name) && this.age == s.age && this.sex == s.sex){
                return true;
            }
            return this.name.equals(s.name) && this.age == s.age && this.sex == s.sex;
        }else{
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        //1.判断是否是同一个对象
        if (this == o) return true;
        //2.如果o是null，则返回false,或者this类型与o的类型不同，也返回false
        if (o == null || getClass() != o.getClass()) return false;
        //3.进行排查后进行比较
        Student student = (Student) o;
        return age == student.age && sex == student.sex && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
