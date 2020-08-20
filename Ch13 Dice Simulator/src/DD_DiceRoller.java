import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @author Dolunay Dagci
 * CISS111-360
 * Due Date: 3.3.19
 * Assignment: Ch13 Dice Simulator
 * This program randomly rolls the dice with graphical user interface
 */
public class DD_DiceRoller extends JFrame {

    private JLabel diceLabel1, diceLabel2;
    private JPanel rollPanel, dicePanel;
    private JButton roll;
    private int rolledNum;

    /**
     * no-argument constructor
     */
    public DD_DiceRoller() {
        setTitle("Dice Roller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(300,80);

        //build panels
        buildRollPanel();
        buildDicePanel();

        add(rollPanel, BorderLayout.SOUTH); add(dicePanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void buildRollPanel() {
        rollPanel = new JPanel();
        roll = new JButton("Roll the Dice");
        roll.addActionListener(new RollListener());
        rollPanel.add(roll);
    }
    private void buildDicePanel() {

        dicePanel = new JPanel();
        diceLabel1 = new JLabel();
        diceLabel2 = new JLabel();
        dicePanel.add(diceLabel1); dicePanel.add(diceLabel2);
    }

    private class RollListener implements ActionListener {

        /**
         *
         * @param min minimum value in the range
         * @param max maximum value in the range
         * @return random number in the range between min and max values
         */
        private int rollRandomly(int min, int max) { //dice roller
            Random random = new Random();
            return random.nextInt((max-min)+1)+min;
        }
        @Override
        public void actionPerformed(ActionEvent e) {

                    ImageIcon die1 = new ImageIcon("die1.png");
                    ImageIcon die2 = new ImageIcon("die2.png");
                    ImageIcon die3 = new ImageIcon("die3.png");
                    ImageIcon die4 = new ImageIcon("die4.png");
                    ImageIcon die5 = new ImageIcon("die5.png");
                    ImageIcon die6 = new ImageIcon("die6.png");
                    ImageIcon[] die = {null,die1,die2,die3,die4,die5,die6}; //get image icons into array to avoid duplicate codes and long if statements/switch cases

            for (int i = 0; i < 2; i++) { //roll two dices
                rolledNum = rollRandomly(1,6); //roll the dice in the number range between 1 and 6
                for(int j= 1; j<=6; j++){
                    if (i==0 && rolledNum == j) diceLabel1.setIcon(die[j]);
                    else if (i==1 && rolledNum == j) diceLabel2.setIcon(die[j]);
                }
            }
            pack();
        }
    }

    public static void main(String[] args) {
       new DD_DiceRoller();
    }
}
