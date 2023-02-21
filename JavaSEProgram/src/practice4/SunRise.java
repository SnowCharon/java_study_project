package practice4;

import practice4.tom.jiafei.SquareEquation;

/**
 * @title: SunRise
 * @Author 竹玄羽
 * @Date: 2022/10/13 8:51
 */

public class SunRise {
    public static void main(String[] args) {
        SquareEquation equation = new SquareEquation(4, 5, 1);
        equation.getRoots();
        equation.setCoefficient(-3, 4, 5);
        equation.getRoots();
    }
}
