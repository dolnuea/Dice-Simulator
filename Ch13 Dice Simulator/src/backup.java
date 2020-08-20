//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//public class DD_DiceRoller extends JFrame {
//
//    private JLabel diceLabel1, diceLabel2;
//    private JPanel rollPanel, dicePanel;
//    private JButton roll;
//    private int rolledNum;
//    private ImageIcon diceImage;
//
//    public DD_DiceRoller() {
//        setTitle("Dice Roller Simulator");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//        setSize(300,80);
//        //build stuff
//        buildRollPanel();
//        buildDicePanel();
//
//        add(rollPanel, BorderLayout.SOUTH); add(dicePanel, BorderLayout.CENTER);
//        setVisible(true);
//    }
//
//    private void buildRollPanel() {
//        rollPanel = new JPanel();
//        roll = new JButton("Roll the Dice");
//        roll.addActionListener(new RollListener());
//        rollPanel.add(roll);
//    }
//    private void buildDicePanel() {
//        dicePanel = new JPanel();
//        diceLabel1 = new JLabel();
//        diceLabel2 = new JLabel();
//        dicePanel.add(diceLabel1); dicePanel.add(diceLabel2);
//    }
//
//    private class RollListener implements ActionListener {
//        private int rollRandomly(int min, int max) {
//            Random random = new Random();
//            return random.nextInt((max-min)+1)+min;
//        }
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//            ImageIcon die1 = new ImageIcon("die1.png");
//            ImageIcon die2 = new ImageIcon("die2.png");
//            ImageIcon die3 = new ImageIcon("die3.png");
//            ImageIcon die4 = new ImageIcon("die4.png");
//            ImageIcon die5 = new ImageIcon("die5.png");
//            ImageIcon die6 = new ImageIcon("die6.png");
//
//            for (int i = 0; i < 2; i++) {
//                rolledNum = rollRandomly(1,6);
//                if (i==0) {
//                    if (rolledNum == 1) diceLabel1.setIcon(die1);
//                    if (rolledNum == 2) diceLabel1.setIcon(die2);
//                    if (rolledNum == 3) diceLabel1.setIcon(die3);
//                    if (rolledNum == 4) diceLabel1.setIcon(die4);
//                    if (rolledNum == 5) diceLabel1.setIcon(die5);
//                    if (rolledNum == 6) diceLabel1.setIcon(die6);}
//                else if (i==1) {
//                    if (rolledNum == 1) diceLabel2.setIcon(die1);
//                    if (rolledNum == 2) diceLabel2.setIcon(die2);
//                    if (rolledNum == 3) diceLabel2.setIcon(die3);
//                    if (rolledNum == 4) diceLabel2.setIcon(die4);
//                    if (rolledNum == 5) diceLabel2.setIcon(die5);
//                    if (rolledNum == 6) diceLabel2.setIcon(die6);
//                }
//            }
//            pack();
//        }
//    }
//
//    public static void main(String[] args) {
//        new DD_DiceRoller();
//    }
//}
