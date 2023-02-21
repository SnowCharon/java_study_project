package ObjectOriented.LambDa_Expression;

import javax.swing.*;
import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-LambDa_Expression
 * @Date 2022/5/30 18:34
 **/
/*
1.参数类型可以不写
2.如果只有一个参数，参数类型和（）都可以省略
3.如果方法体代码只有一行，可以省略大括号，同时要省略分号
4.如果方法体只有一行代码，可以省略大括号不写，同时如果是return语句，return不写，同时必须省去分号
 */

public class Int_Project {
    public static void main(String[] args) {
        Integer[] arr = {15, 26, 14, 9, 6, 48, 59, 26};

        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });*/

        /*Arrays.sort(arr, (o1, o2) -> {
             return o2 - o1;
        });*/

        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(arr));

        System.out.println("=================================");
        JFrame win = new JFrame("登录界面");

        JButton btn = new JButton("按钮！");
        /*btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点我！");
            }
        });*/

        btn.addActionListener(e -> System.out.println("点我！"));
        win.add(btn);
        win.setSize(400, 300);
        win.setVisible(true);
    }
}
