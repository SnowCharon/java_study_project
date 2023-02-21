package Unit4MathAndString;

/**
 * @title: E
 * @Author 竹玄羽
 * @Date: 2022/11/6 17:42
 */
class A {
    public int getNumber(int a) {
        return a+1;
    }
}
class B extends A {
    public int getNumber (int a) {
        return a+100;
    }
    public static void main (String args[])  {
        A a =new A();
        System.out.println(a.getNumber(10));  //【代码1】
        a = new B();
        System.out.println(a.getNumber(10));  //【代码2】
    }
}

