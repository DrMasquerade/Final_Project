package src;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MenuTutorial extends JFrame {
    JMenuBar menubar;
    JMenu file;
    JMenuItem exit;

    public MenuTutorial() {
        setLayout(new FlowLayout());

        menubar = new JMenuBar();
        setJMenuBar(menubar);

        file = new JMenu("File");
        menubar.add(file);

        exit = new JMenuItem("Exit");
        file.add(exit);

        event e = new event();
        exit.addActionListener(e);
    }
    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    public static void main (String args[]) {
        MenuTutorial gui = new MenuTutorial();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(320, 150);
        gui.setVisible(true);
        gui.setTitle("Menu Tutorial");
    }
}
