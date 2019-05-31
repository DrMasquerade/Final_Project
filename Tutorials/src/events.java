import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class events extends JFrame {
    private JLabel label;
    private JLabel label2;
    private JButton button;
    private JButton button2;


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
            label.setText("You now have the big stupid ٩(^ᴗ^)۶");
        }
    }
    public class event2 implements ActionListener {
        public void actionPerformed(ActionEvent e2) {
            label2.setText("You now have the even bigger stupid ٩(^ᴗ^)۶");
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
