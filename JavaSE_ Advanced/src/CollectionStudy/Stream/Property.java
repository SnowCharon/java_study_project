package CollectionStudy.Stream;

/**
 * @author MOYU
 * @File JavaSE_Study-Stream
 * @Date 2022/6/6 9:14
 **/
public class Property {
    /*
    1.获取Stream流：创建一条流水线，并把数据放到流水线上准备操作
    2.中间方法：对数据进行中间操作，可以用多次
    3.终结方法：一个Stream流只有一个终结方法，用了流水线就结束

    重点：在Stream流中无法直接修改集合，数组等数据源中的数据，相当于只是获得数据进行操作，而非直接对内存中的数据操作

    Stream流获取方法：
                  1.单列结合：使用Collection接口中的默认方法stream()生成流
                            default Stream<E> stream()
                  2.双列集合：间接的生成流---可以先通过KeySet或者entrySet获取一个Set集合，在获取Stream集合
                  3.数组：Arrays中的静态方法stream生成流
                  4.同种数据类型的多个数据：如：1,2,3,4,5....使用Stream.of(T...values)生成流
     */
}
