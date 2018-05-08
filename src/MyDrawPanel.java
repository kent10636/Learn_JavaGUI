import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {  //创建JPanel子类
    /*
    public void paintComponent(Graphics g) {  //指定颜色指定区域绘图
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
    */
    /*
    public void paintComponent(Graphics g) {  //在黑色背景画上随机色彩的圆圈
        g.fillRect(0, 0, this.getWidth(), this.getHeight());  //以默认颜色填充

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);  //传入3个参数来代表RGB值
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);  //填满参数指定的椭圆形区域
    }
    */
    public void paintComponent(Graphics g) {  ////在黑色背景画上随机色彩渐变的圆圈
        Graphics2D g2d = (Graphics2D) g;  //类型转换成Graphics2D

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);  //将虚拟的“笔刷”换成渐层
        g2d.fillOval(70, 70, 100, 100);  //用目前的笔刷设定来填满椭圆形区域
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();  //创建JFrame
        MyDrawPanel widget = new MyDrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Window关闭时结束程序

        frame.getContentPane().add(widget);  //把widget加到frame的pane上

        frame.setSize(300, 300);  //设定frame大小

        frame.setVisible(true);  //显示frame
    }
}
