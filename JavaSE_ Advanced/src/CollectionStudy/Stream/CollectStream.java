package CollectionStudy.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 15:38
 **/
public class CollectStream {
    public static void main(String[] args) {
        //ListAndSet();

        //toMap收集
        ArrayList<String> list = new ArrayList<>();
        list.add("Mike,23");
        list.add("Michael,18");
        list.add("Jhon,22");
        list.add("Marry,19");

        //Collectors.toMap收集数据，添加到一个Map集合中
       /* Map<String, Integer> map = list.stream().filter(
                (String s) -> {
                    String[] split = s.split(",");
                    int age = Integer.parseInt(split[1]);
                    return age <= 20;
                }
        ).collect(Collectors.toMap(
                (String key) -> {
                    return key.split(",")[0];
                },
                (String value) -> {
                    return Integer.parseInt(value.split(",")[1]);
                }
        ));*/

        Map<String, Integer> map = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) <= 20)
                .collect(Collectors.toMap((key -> key.split(",")[0]), value -> Integer.parseInt(value.split(",")[1])));

        System.out.println(map);


        ListAndSet();
    }

    private static void ListAndSet() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //2.
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.addAll(list2);

        //奇数不要，保留偶数
//        list.stream().filter(number -> number % 2 == 0).forEach(i -> System.out.println(i));

        //filter负责过滤数据；collect负责收集数据--获取流中剩余数据，它不负责创建容器，也不负责添加
        //Collectors.toList():在底层会创建一个List集合，并把所有数据添加到List集合中
        List<Integer> L = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(L);

        List<Integer> collect = list.stream().filter(i -> i < 7).toList();
        System.out.println(collect);

        //Collectors.toSet():在底层创建一个Set集合，并把收集到的数据添加到Set集合中去
        Set<Integer> collectSet = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
        System.out.println(collectSet);

        /*
        toList和toSet最大区别是：List集合和Set集合的底层逻辑不同，Set集合会自动去除重复的元素，而List集合不会
         */
    }
}
