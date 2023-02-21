package CollectionStudy.Collection.MyList.MyArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author MOYU
 * @File JavaSE_Study-List.MyList
 * @Date 2022/6/1 16:39
 **/
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("================");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
