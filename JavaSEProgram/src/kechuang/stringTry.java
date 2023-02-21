package kechuang;

import java.util.Scanner;

/**
 * @title: Nicolchez
 * @Author 竹玄羽
 * @Date: 2022/10/21 17:49
 */

class Nicolchez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(operation(n));
    }
    public static String operation(int number) {
        StringBuilder result = new StringBuilder(number + "*" + number + "*" + number + "=" + pow(number, 3) + "=");
        int a = number * number - number + 1;
        result.append(a);
        for (int i = 1; i < number; i++) {
            result.append('+');
            result.append(a += 2);
        }
        return result.toString();
    }

    public static int pow(int number,int power){
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}

