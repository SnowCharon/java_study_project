package CollectionStudy.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 8:59
 **/
public class Traditional {
    public static void main(String[] args) {
        //集合批量添加
        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","邢彦龙","好耶","张良","阿巴巴"));
        //创建存储集合
        ArrayList<String> listZhang = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        for (String s : list) {
            if(s.length() == 3){
                list3.add(s);
            }
            if(s.startsWith("张")){
                listZhang.add(s);
            }
        }

        System.out.println(list);
        System.out.println(listZhang);
        System.out.println(list3);

        System.out.println("==========传统方法==============");
        //Stream流
        list.stream().filter(s->s.startsWith("张")).forEach(System.out::println);
        System.out.println("----------------------------------");
        list.stream().filter(s->s.length() == 3).forEach(System.out::println);


    }
}
