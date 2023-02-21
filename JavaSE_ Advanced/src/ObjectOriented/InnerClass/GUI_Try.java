package ObjectOriented.InnerClass;

import javax.swing.*;

/**
 * @author MOYU
 * @File JavaSE_Study-InnerClass
 * @Date 2022/5/28 17:31
 **/
public class GUI_Try {
    public static void main(String[] args) {
        //1.创建GUI窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);
        //2.创建一个按钮对象
        JButton btn = new JButton("登录");

        //监听事件
        /*btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"点击了我！");
            }
        });*/

        btn.addActionListener(e -> JOptionPane.showMessageDialog(win,"点击了我！"));

        //3.把按钮对象添加到窗口
        panel.add(btn);
        //4.展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setLocation(100,200);
        win.setVisible(true);
    }
}
