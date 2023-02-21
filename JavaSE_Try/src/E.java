/**
 * @title: E
 * @Author 竹玄羽
 * @Date: 2022/10/13 9:19
 */

class A {
    double f(int x,double y) {
        return x+y;
    }
    int f(int x,int y) {
        return x*y;
    }
}
public class E {
    public static void main(String args[]) {
        A a=new A();
        System.out.println(a.f(10,10)); 	//【代码1】
        System.out.println(a.f(10,10.0));	//【代码2】
    }
}
