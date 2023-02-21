package CollectionStudy.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 15:12
 **/
public class MidStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "邢彦龙", "张蕊可", "邢彦龙", "张蕊可", "好耶", "张良", "阿巴巴"));

        //1.limit:截取指定参数个数的数据
        System.out.println("===========截取数据===========");
        list.stream().limit(6).forEach(System.out::println);

        //2.skip:跳过指定参数个数的数据
        System.out.println("===========跳过数据===========");
        list.stream().skip(3).forEach(System.out::println);

        //3.concat:合并a和b两个流为一个流
        System.out.println("===========合并流===========");
        ArrayList<String> list2 = new ArrayList<>(List.of("代静酉", "季宇晗", "王佳怡"));
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = list2.stream();
        Stream.concat(stream1, stream2).forEach(System.out::println);

        //简化
        Stream.concat(list.stream(), list2.stream()).forEach(System.out::println);

        //4.distinct:去除流中重复的元素（依赖HashCode和equals方法）
        System.out.println("===========除去数据===========");
        list.stream().distinct().forEach(System.out::println);

    }
}
