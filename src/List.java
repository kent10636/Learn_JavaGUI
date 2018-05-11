import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class List implements ListSelectionListener {
    private String[] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
    private JList list = new JList(listEntries);  //构造函数

    public static void main(String[] args) {
        List gui = new List();
        gui.go();
    }

    private void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        //设定显示垂直的滚动条
        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        list.setVisibleRowCount(4);  //设定显示的行数

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  //限制用户只能选取一个项目

        list.addListSelectionListener(this);  //对选择事件注册

        panel.add(scroller);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent lse) {  //处理事件，判断选择了哪个项目
        if (!lse.getValueIsAdjusting()) {
            String selection = (String) list.getSelectedValue();
            System.out.println(selection);
        }
    }
}
