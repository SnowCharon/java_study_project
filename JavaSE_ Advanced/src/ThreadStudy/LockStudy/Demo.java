package ThreadStudy.LockStudy;

/**
 * @author MOYU
 * @File JavaSE_Study-ThreadStudy.Project
 * @Date 2022/6/16 19:39
 **/
public class Demo {
    public static void main(String[] args) {
      /* 错误写法：因为要共享数据
       Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();*/


        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        t1.setName("一号窗口");
        t2.setName("二号窗口");
        t3.setName("三号窗口");

        t1.start();
        t2.start();
        t3.start();

    }
}
