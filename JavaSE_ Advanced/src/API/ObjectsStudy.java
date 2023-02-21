package API;

import java.util.Objects;

/**
 * @author MOYU
 * @File JavaSE_Study-API_Objects
 * @Date 2022/5/29 1:34
 **/
public class ObjectsStudy {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("好耶！");

        //隐患，可能空指针异常
        //System.out.println(s1.equals(s2));

        //安全，结果也对！
        System.out.println(Objects.equals(s1, s2));

        /*public static boolean equals (Object a, Object b){
            return (a == b) || (a != null && a.equals(b));
        }*/

        System.out.println(Objects.isNull(s1));
        System.out.println(s1 == null);


    }
}
