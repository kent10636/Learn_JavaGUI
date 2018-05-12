import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();  //创建JFrame
        JButton button = new JButton("click me");  //创建JButton

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Window关闭时结束程序

        frame.getContentPane().add(button);  //把button加到frame的pane上

        frame.setSize(300, 300);  //设定frame大小

        frame.setVisible(true);  //显示frame
    }
}
