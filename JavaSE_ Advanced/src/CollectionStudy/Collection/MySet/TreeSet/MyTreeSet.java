package CollectionStudy.Collection.MySet.TreeSet;

import java.util.TreeSet;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet
 * @Date 2022/6/3 22:16
 **/
public class MyTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> arr = new TreeSet<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(8);

        System.out.println(arr);
    }
}
