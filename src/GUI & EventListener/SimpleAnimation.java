import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    private int x = 70;
    private int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();  //创建出frame上的widget

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {  //重复130次
            x++;  //递增x坐标值
            y++;  //递增y坐标值

            drawPanel.repaint();  //重新绘制面板

            try {
                Thread.sleep(50);  //加上延迟放慢运行速度
            } catch (Exception ex) {
            }
        }
    }

    class MyDrawPanel extends JPanel {  //内部类
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());  //绘制圆形前将整个矩形区域填满成白色

            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);  //使用外部的坐标值来更新
        }
    }
}
