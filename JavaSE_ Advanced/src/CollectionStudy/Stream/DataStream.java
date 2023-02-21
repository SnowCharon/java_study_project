package CollectionStudy.Stream;

import java.util.stream.Stream;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 9:32
 **/
public class DataStream {
    /**
     *  同种数据类型
     */
    public static void main(String[] args) {
        Stream.of(1,2,6,9,25,8,56).forEach(System.out::println);
    }
}
