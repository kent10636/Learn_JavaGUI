import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {  //实现接口，表示SimpleGui1B是个ActionListener（事件只会通知有实现ActionListener的类）
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);  //向按钮注册

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {  //实现interface上的方法
        button.setText("I've been clicked!");  //按钮会以ActionEvent对象作为参数来调用此方法
    }
}
