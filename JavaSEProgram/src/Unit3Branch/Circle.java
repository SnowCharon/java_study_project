package Unit3Branch;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 19:34
 **/
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Calculate(x, y);
    }

    private static void Calculate(int x, int y) {
        double distance = Math.sqrt(x * x + y * y);
        if(distance > 10){
            System.out.println("Point (" + x + "," + y + ") is not in the circle!");
        }else{
            System.out.println("Point (" + x + "," + y + ") is in the circle!");

        }
    }
}
