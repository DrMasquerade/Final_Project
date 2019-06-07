package com.pcadventure.game.Tutorials;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Menu extends JFrame{
    JMenuBar menubar;
    JMenu file;
    JMenuItem exit;
    public Menu(){
        setLayout(new FlowLayout());

        menubar = new JMenuBar();
        setJMenuBar(menubar);

        file = new JMenu("file");
        menubar.add(file);

        exit = new JMenuItem("exit");
        file.add(exit);

        event e = new event();
        exit.addActionListener(e);
    }
    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
        public static void main (String args[]){
            Menu gui = new Menu();
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setSize(200,200);
            gui.setVisible(true);
        }

    }


