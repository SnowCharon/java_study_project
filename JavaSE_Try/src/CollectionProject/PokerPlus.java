package CollectionProject;

import javax.xml.transform.Source;
import java.util.*;

/**
 * @author MOYU
 * @File JavaSE_Study-CollectionProject
 * @Date 2022/6/7 9:42
 **/
public class PokerPlus {
    public static void main(String[] args) {
        //创建牌盒
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        //创建玩家和底牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dpArray = new TreeSet<>();

        //创建牌，存储在HashMap
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                array.add(index);
                hm.put(index++,color + number);
            }
        }
        hm.put(index++, "小王");
        array.add(index);
        hm.put(index++, "大王");
        array.add(index);

        //打乱排序
        Collections.shuffle(array);

        for (int i = 0;i < array.size();i++){
            int x = array.get(i);
            if (i >= array.size() - 3) {
                dpArray.add(x);
            } else if (i % 3 == 0) {
                player1.add(x);
            } else if (i % 3 == 1) {
                player2.add(x);
            } else if (i % 3 == 2) {
                player3.add(x);
            }
        }

        //输出每个人分到的牌
        lookPoker("player1",player1,hm);
        lookPoker("player2",player2,hm);
        lookPoker("player3",player3,hm);
        lookPoker("底牌",dpArray,hm);
    }

    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name + "有：");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
