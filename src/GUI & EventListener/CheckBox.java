import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox implements ItemListener {
    private JCheckBox check = new JCheckBox("Goes to 11");  //构造函数

    public static void main(String[] args) {
        CheckBox gui = new CheckBox();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        check.addItemListener(this);  //监听item的事件（被选取/非选取）

        panel.add(check);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(350, 300);
        frame.setVisible(true);

        //check.setSelected(true);  //程序控制选取
        //check.setSelected(false);  //程序控制不选取
    }

    public void itemStateChanged(ItemEvent ev) {  //处理事件，判断是否被选取
        String onOrOff = "off";
        if (check.isSelected()) onOrOff = "on";
        System.out.println("Check box is " + onOrOff);
    }
}
