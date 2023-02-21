package CollectionStudy.Stream;

import java.util.ArrayList;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 9:20
 **/
public class ListStream {
    public static void main(String[] args) {
        //单列集合
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        /*Stream<String> stream = list.stream();
        stream.forEach(System.out::println);*/
        list.stream().forEach(System.out::println);
    }
}
