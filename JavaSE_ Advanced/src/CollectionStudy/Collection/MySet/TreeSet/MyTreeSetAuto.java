package CollectionStudy.Collection.MySet.TreeSet;

import java.util.TreeSet;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet
 * @Date 2022/6/4 1:04
 **/
public class MyTreeSetAuto {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>((String o1, String o2) -> o2.length() - o1.length() == 0 ? o2.compareTo(o1) : o2.length() - o1.length());

        s.add("aa");
        s.add("bc");
        s.add("foa");
        s.add("pp");

        System.out.println(s);
    }
}
