package Unit3Branch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 19:42
 **/
public class ChosePoker {
    /**
     *制作一副牌，并且随机选择一张
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //HashMap 集合存储牌，Integer 存储牌的索引，String 存储牌
        HashMap<Integer,String> hm = new HashMap<>();
        //创建颜色以及牌数的集合
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] colors = {"♠","♥","♦","♣"};

        ArrayList<Integer> array = new ArrayList<>();
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                array.add(index);
                hm.put(index++,color + number);
            }
        }
        hm.put(index++,"小王");
        array.add(index);
        hm.put(index++,"大王");
        array.add(index);

     /*   Set<Integer> keys = hm.keySet();
        for (Integer key : keys) {
            System.out.println(key +"," + hm.get(key));
        }*/

        Random random = new Random();
        System.out.println(hm.get(random.nextInt(53)));
    }
}
