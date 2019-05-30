package src;

import javax.swing.*;
import java.awt.*;

public class FirstGUI extends JFrame {

    private JLabel label;
    private JButton button;
    private JTextField textfield;

    public FirstGUI(){
        setLayout(new FlowLayout());

        label = new JLabel("This is a Label");
        add(label);

        textfield = new JTextField(15);
        add(textfield);

        button = new JButton("Click me!");
        add(button);

    }

    public static void main (String args[]){
        FirstGUI gui = new FirstGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(640, 480);
        gui.setVisible(true);
        gui.setTitle("First GUI");
    }
}

// Tutorial I watched: https://www.youtube.com/watch?v=mjOicuXEvwg&list=PLA11B442106673455&index=1