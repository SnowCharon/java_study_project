package ArrayList;

import java.util.ArrayList;

/**
 * @author 竹玄羽
 * @File ArrayList
 * @date 2022/5/20  10:53
 **/
public class init {
    public static void main(String[] args) {
        //1.创建arraylist对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加数据
        list.add("java");
        list.add("NB");
        list.add("!");
        list.add("啦啦啦");
        System.out.println(list);

        //3.给指定索引位置插入元素
        list.add(1,"web");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(26);
        System.out.println(list2);

    }
}
