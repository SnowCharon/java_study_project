package CollectionStudy.Collection.MySet.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet
 * @Date 2022/6/3 22:07
 **/
public class SetTry {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        s.add("ccc");
        s.add("aaa");
        s.add("aaa");
        s.add("bbb");

        System.out.println(s); //自动去除重复元素

       /*
       不能使用索引遍历获取元素
       for (int i = 0; i < s.size(); i++) {
            s.get();
        }*/

        //增强for没问题
        for (String s1 : s) {
            System.out.println(s1);
        }

        System.out.println("=======================");

        //所有单列集合都可以用迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String ch = it.next();
            System.out.println(ch);
        }
    }
}
