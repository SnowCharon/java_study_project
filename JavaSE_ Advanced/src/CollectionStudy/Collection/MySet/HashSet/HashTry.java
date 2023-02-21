package CollectionStudy.Collection.MySet.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet.HashSet
 * @Date 2022/6/5 14:11
 **/
public class HashTry {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Hello");
        hs.add("World");
        hs.add("Java");
        hs.add("好耶");
        hs.add("Java");
        hs.add("Java");
        hs.add("Java");
        //set集合中。重复的元素不会生效

        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("-------------------------");

        for (String h : hs) {
            System.out.println(h);
        }
    }
}
