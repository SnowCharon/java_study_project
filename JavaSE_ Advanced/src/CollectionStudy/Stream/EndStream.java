package CollectionStudy.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 15:23
 **/
public class EndStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","邢彦龙","张蕊可","好耶","张良","阿巴巴"));

        //void forEach(Consumer action):对此流的每个元素执行操作
        //             Consumer接口中的方法 void accept (T t):对给定的参数执行此操作
        //forEach底层会循环调用accept方法，获取每个数据给s
        /*list.stream().forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );*/

        //Lambda简化
        list.stream().forEach(System.out::println);

        //2.count:返回流中元素数
        long count = list.stream().count();
        System.out.println(count);
    }
}
