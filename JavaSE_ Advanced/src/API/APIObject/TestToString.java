package API.APIObject;

/**
 * @author MOYU
 * @File JavaSE_Study-API
 * @Date 2022/5/29 0:58
 **/
public class TestToString {
    public static void main(String[] args) {
        //学习api接口调用---Object中的toString
        Student s = new Student("好耶",18,'男');
        System.out.println(s.toString());
        System.out.println(s);

    }
}
