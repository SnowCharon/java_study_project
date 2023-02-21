package ObjectOriented.InnerClass;

/**
 * @author MOYU
 * @File JavaSE_Study-InnerClass
 * @Date 2022/5/26 20:50
 **/
public class Test3 {
    public static void main(String[] args) {
        People.Heart h = new People().new Heart();
        h.show();
    }
}

class People{
    private int heatbeat = 150;
    public  class Heart{
        int heartbeat = 110;
        public void show(){
            int heartbeat = 78;
            System.out.println(heartbeat);   //78
            System.out.println(this.heartbeat);   //110
            System.out.println(People.this.heatbeat);   //150
        }
    }
}