import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RandomGame extends JFrame {
    int nRandomNum, nGuess;
    private JButton button;
    private JTextField textfield;
    private JLabel promptlabel;
    private JLabel resultlabel;
    private JLabel randomlabel;

    public RandomGame() {
        setLayout(new FlowLayout());

        promptlabel = new JLabel("Enter a random number from 1 - 10");
        add(promptlabel);

        textfield = new JTextField(5);
        add(textfield);

        button = new JButton("Guess!");
        add(button);

        resultlabel = new JLabel("");
        add(resultlabel);

        randomlabel = new JLabel("");
        add(randomlabel);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nRandomNum = (int) (Math.random() * 10 + 1);
            try {
                resultlabel.setText("the number randomly generated was " + nRandomNum);
                nGuess = (int) (Double.parseDouble(textfield.getText()));
                if (nGuess == nRandomNum) {
                    resultlabel.setText("You win!");
                } else if (nGuess != nRandomNum) {
                    resultlabel.setText("You lose!");
                }
            } catch (Exception ex) {
                resultlabel.setText("Enter numbers only you fool!");
            }
        }
    }
    public static void main (String args[]){
        RandomGame gui = new RandomGame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(320, 150);
        gui.setVisible(true);
        gui.setTitle("Random Game");
    }
}
