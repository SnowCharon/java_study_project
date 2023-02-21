package CollectionStudy.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 14:46
 **/
public class FilterStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","邢彦龙","好耶","张良","阿巴巴"));

        //filter方法获取流中的每一个数据，即过滤数据
        //而test方法中的s,就以此表示流中的每一个数据
        //只要对s进行判断就可以，结果为true则数据保留，为false则丢弃
       /* list.stream().filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        boolean result = s.startsWith("张") && s.length() == 3;
                        return result;
                    }
                }
        ).forEach(System.out::println);*/

        //Lambda表达式简化
        list.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(System.out::println);
    }
}
