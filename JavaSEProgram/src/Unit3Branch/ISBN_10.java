package Unit3Branch;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 17:22
 **/
public class ISBN_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        String s = scanner.next();
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += arr[i] * (i + 1);
        }
        arr[9] = sum % 11;
        if(arr[9] != 10){
            for (int i = 0; i < 10; i++) {
                System.out.print(arr[i]);
            }
        }else{
            for (int i = 0; i < 9; i++) {
                System.out.print(arr[i]);
            }
            System.out.println("X");
        }

    }
}
