package ObjectOriented.Extends;

/**
 * @author 竹玄羽
 * @File Extends
 * @date 2022/5/23  15:10
 **/
public class test1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("李华");
        s.setAge(19);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.queryCourse();
        s.writeInfo();

        Teacher t = new Teacher();
        t.setName("郑梅梅");
        t.setAge(26);
        t.setClassName("计算机学院");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getClassName());
        t.queryCourse();
        t.teach();

    }
}
