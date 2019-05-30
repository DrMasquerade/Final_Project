package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class events extends JFrame {
    private JLabel label;
    private JLabel label2;
    private JButton button;
    private JButton button2;
    private int x = 0, y = 0;


    public events() {
        setLayout(new FlowLayout());

        button = new JButton("Click for text");
        add(button);

        label = new JLabel("");
        add(label);

        button2 = new JButton("Click for more text!");
        add(button2);

        label2 = new JLabel("");
        add(label2);

        event e = new event();
        button.addActionListener(e);

        event2 e2 = new event2();
        button2.addActionListener(e2);

    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (x == 0){
                label.setText("You now have the big stupid ٩(^ᴗ^)۶");
                x = 1;
            }
             else if (x == 1){
                label.setText("");
                x = 0;
            }
        }
    }
    public class event2 implements ActionListener {
        public void actionPerformed(ActionEvent e2) {
            if (y == 0) {
                label2.setText("You now have the big stupid ٩(^ᴗ^)۶");
                 y = 1;
            } else if (y == 1) {
                label2.setText("");
                y = 0;
            }
        }
    }

    public static void main(String ars[]) {
        events gui = new events();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Events Program");
        gui.setSize(640, 480);
        gui.setVisible(true);

    }
}
