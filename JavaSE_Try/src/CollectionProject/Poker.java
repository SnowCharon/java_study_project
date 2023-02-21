package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author MOYU
 * @File JavaSE_Study-CollectionProject
 * @Date 2022/6/7 9:01
 **/
public class Poker {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> array = new ArrayList<>();
        //往牌盒装牌
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");

        //将牌打乱顺序
        Collections.shuffle(array);

        //创建玩家，还有底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }
        }

        //看牌，即遍历循环
        LookPoker("player1", player1);
        LookPoker("player2", player2);
        LookPoker("player3", player3);
        LookPoker("底牌", dpArray);

    }

    public static void LookPoker(String name, ArrayList<String> list) {
        System.out.println(name + "的牌是：");
        for (String poker : list) {
            System.out.print(poker);
        }
        System.out.println();
    }
}
