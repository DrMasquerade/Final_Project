package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class beeper extends JFrame {
    JButton button;
    JLabel label;
    int counter = 0, x = 0;
    String s;

    public beeper() {
        setLayout(new FlowLayout());
        button = new JButton("Click for sound");
        add(button);

        label = new JLabel("");
        add(label);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Toolkit.getDefaultToolkit().beep();
            counter++;
            if (x == 0) {
                s = "time";
            } else if (x == 1) {
                s = "times";
            }
            label.setText("You have clicked " + counter + " " + s);
            x = 1;
        }
    }

    public static void main(String args[]) {
        beeper gui = new beeper();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(320, 150);
        gui.setVisible(true);
        gui.setTitle("Beeper");
    }
}
