package Unit3Branch;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 20:14
 **/
public class EquationPoint {
    /**
     *  AB本身就是两条直线，知道两端点就可以知道其直线方程，B也是一样，两个方程联立，得到一个坐标，再看该坐标是否在B的定义域内就可以啊
     *
     *     A的两点为(x1,y1),(x2,y2),则A的直线方程为l1:y-y1=(y2-y1)(x-x1)/(x2-x1)
     *     B的两点为(x3,y3),(x4,y4),则B的直线方程为l2:y-y3=(y4-y3)(x-x3)/(x4-x3)
     *
     *     联立解出交点坐标为的横坐标为：x=(k2x3-y3-k1x1+y1)/(k2-k1)
     *     其中k1=(y2-y1)/(x2-x1)   k2=(y4-y3)/(x4-x3)
     *     可以推导出来 x = ((x2 - x1) * (x3 - x4) * (y3 - y1) - x3 * (x2 - x1) * (y3 - y4) + x1 * (y2 - y1) * (x3 - x4)) / ((y2 - y1) * (x3 - x4) - (x2 - x1) * (y3 - y4));
     *
     *     同理也可以推导出y的值：y = ((y2 - y1) * (y3 - y4) * (x3 - x1) -y3 * (y2 - y1) * (x3 - x4) + y1 * (x2 - x1) * (y3 - y4)) / ((y2 - y1) * (y3 - y4) - (y2 - y1) * (x3 - x4));
     */
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double x1,y1,x2,y2,x3,y3,x4,y4,x,y;
     x1 = scanner.nextDouble();
     y1 = scanner.nextDouble();
     x2 = scanner.nextDouble();
     y2 = scanner.nextDouble();
     x3 = scanner.nextDouble();
     y3 = scanner.nextDouble();
     x4 = scanner.nextDouble();
     y4 = scanner.nextDouble();

     x = ((x2 - x1) * (x3 - x4) * (y3 - y1) - x3 * (x2 - x1) * (y3 - y4) + x1 * (y2 - y1) * (x3 - x4)) / ((y2 - y1) * (x3 - x4) - (x2 - x1) * (y3 - y4));
     y = ((y2 - y1) * (y3 - y4) * (x3 - x1) -y3 * (y2 - y1) * (x3 - x4) + y1 * (x2 - x1) * (y3 - y4)) / ((x2 - x1) * (y3 - y4) - (y2 - y1) * (x3 - x4));

     //精确位数
     DecimalFormat df = new DecimalFormat("#.00000");

     System.out.println("The instersecting point is at (" + df.format(x) + "," + df.format(y) + ")");
 }
}
