package Unit3Branch;

import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 15:37
 **/
public class LinearSystemOfEquation {
    //2*2线性方程组
    //a*x + b*y = e
    //c*x + d*y = f

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        while (scanner.hasNext()){
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            d = scanner.nextDouble();
            e = scanner.nextDouble();
            f = scanner.nextDouble();
            if ((a * d - b * c) == 0){
                System.out.println("The equation has no solution!");
            }else{
                x = (e * d - b * f) / (a * d - b * c);
                y = (a * f - e * c) / (a * d - b * c);
                System.out.println("x is " + x + " and y is " + y);
            }
        }
    }
}
