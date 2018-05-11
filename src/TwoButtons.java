import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {  //主要的GUI类不实现ActionListener
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());  //将对应的实例传给监听的注册方法

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());  //将对应的实例传给监听的注册方法

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {  //单一的类中做出不同的ActionListener
        @Override
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch!");  //内部可以存取label
        }
    }

    class ColorListener implements ActionListener {  //单一的类中做出不同的ActionListener
        @Override
        public void actionPerformed(ActionEvent event) {
            frame.repaint();  //直接存取frame，不需要明确指定外部类的引用
        }
    }
}

//Bug：按下labelButton时，不只label文字改变，连drawPanel也repaint了，原因未知
