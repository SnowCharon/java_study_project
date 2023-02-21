package CollectionStudy.Collection.MyList.MyLinkedList;

import java.util.LinkedList;

/**
 * @author MOYU
 * @File JavaSE_Study-List.MyLinkedList
 * @Date 2022/6/2 16:01
 **/
public class FunctionRealize {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Fun1(list);
        System.out.println("===========================");
        Fun2(list);
        System.out.println("===========================");
        Fun3(list);
        System.out.println("===========================");
        Fun4(list);

    }

    private static void Fun4(LinkedList<String> list) {
        //4.从列表中删除并返回第一个元素
        String rf = list.removeFirst();
        //从列表中删除并返回最后一个元素
        String rl = list.removeLast();

        System.out.println(rf);
        System.out.println(rl);
        System.out.println(list);
    }

    private static void Fun3(LinkedList<String> list) {
        //3.返回此列表第一个元素
        String first = list.getFirst();
        //返回此列表最后一个元素
        String last = list.getLast();

        System.out.println(first);
        System.out.println(last);
    }

    private static void Fun2(LinkedList<String> list) {
        //2.尾插法
        list.addLast("yyy");
        System.out.println(list);
    }

    private static void Fun1(LinkedList<String> list) {
        //1.头插法
        list.addFirst("hhh");
        System.out.println(list);
    }
}
