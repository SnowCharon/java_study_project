package Package_Study;

/**
 * @author 竹玄羽
 * @File package_utli
 * @date 2022/5/23  19:09
 **/
public class fu {
    //1.私有
    private void privateMethod(){
        System.out.println("===private===");
    }

    //2.缺省
    void Method(){
        System.out.println("===缺省===");
    }

    //3.protected
    protected void protectedMethod(){
        System.out.println("===protected===");
    }

    //4.public
    public void publicMethod(){
        System.out.println("===public===");
    }

    public static void main(String[] args) {
        fu f = new fu();
        f.privateMethod();
        f.Method();
        f.protectedMethod();
        f.publicMethod();
    }

}
