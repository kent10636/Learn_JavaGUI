import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }
    /*
    private void go() {  //BorderLayout
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("Shock me");
        JButton buttonTwo = new JButton("bliss");

        panel.add(button);
        panel.add(buttonTwo);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
    */
    /*
    private void go() {  //框架默认为BoxLayout，面板默认为FlowLayout
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("Shock me");
        JButton buttonTwo = new JButton("bliss");

        panel.add(button);
        panel.add(buttonTwo);

        frame.getContentPane().add(panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
    */

    private void go() {  //BoxLayout
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Shock me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }

}
