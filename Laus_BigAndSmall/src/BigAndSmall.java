import javax.swing.*;
import java.awt.*;

public class BigAndSmall {

    JFrame mainFrame;
    ButtonPanel buttonPanel;
    DicePanel dicePanel1, dicePanel2, dicePanel3;
    RadioButtonPanel radioButtonPanel;
    Randomizer randomizer;
    WinningBanner winningBanner;
    YourBetPanel yourBetPanel;
    YourCashPanel yourCashPanel;


    public BigAndSmall() {

        mainFrame = new JFrame("Big and Small");
        mainFrame.setLayout(null);
        mainFrame.setSize(500, 440);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        yourCashPanel = new YourCashPanel();
        yourCashPanel.yourCashPanel.setBounds(20, 20, 450, 40);
        mainFrame.add(yourCashPanel.yourCashPanel);

        radioButtonPanel = new RadioButtonPanel();
        radioButtonPanel.radioButtonPanel.setBounds(10, 70, 100, 100);
        mainFrame.add(radioButtonPanel.radioButtonPanel);

        yourBetPanel = new YourBetPanel();
        yourBetPanel.yourBetPanel.setBounds(130, 70, 340, 60);
        mainFrame.add(yourBetPanel.yourBetPanel);

        winningBanner = new WinningBanner();
        winningBanner.winningBanner.setBounds(10, 130, 480, 40);
        mainFrame.add(winningBanner.winningBanner);

        buttonPanel = new ButtonPanel();
        buttonPanel.buttonPanel.setBounds(0, 160, 500, 40);
        mainFrame.add(buttonPanel.buttonPanel);

        dicePanel1 = new DicePanel();
        dicePanel1.dicePanel.setBounds(10, 200, 150, 150);
        mainFrame.add(dicePanel1.dicePanel);
        dicePanel1.diceLabel.setIcon(dicePanel1.dice1);

        dicePanel2 = new DicePanel();
        dicePanel2.dicePanel.setBounds(170, 200, 150, 150);
        mainFrame.add(dicePanel2.dicePanel);
        dicePanel2.diceLabel.setIcon(dicePanel2.dice1);

        dicePanel3 = new DicePanel();
        dicePanel3.dicePanel.setBounds(330, 200, 150, 150);
        mainFrame.add(dicePanel3.dicePanel);
        dicePanel3.diceLabel.setIcon(dicePanel3.dice1);

        randomizer = new Randomizer();

        JLabel copyrightName;
        JLabel copyrightDate;
        copyrightName = new JLabel("Created by Angelo Laus - CPE231");
        copyrightName.setBounds(150, 360, 200, 20);
        mainFrame.add(copyrightName);
        copyrightDate = new JLabel("Created on 01/04/2024");
        copyrightDate.setBounds(180, 380, 200, 20);
        mainFrame.add(copyrightDate);

        buttonPanel.rollButton.addActionListener(e -> {

            int total1 = randomizer.d1 + randomizer.d2 + randomizer.d3;
            System.out.println(total1);

            int betAmount = Integer.parseInt(yourBetPanel.yourBetField.getText());

            if (total1 >= 11 && radioButtonPanel.highButton.isSelected()) {
                winningBanner.L1.setText("Total roll is: " + total1 + ". GALING MO, You win!");

                yourCashPanel.yourCashLabel.setText(Float.toString(yourCashPanel.yourCash += betAmount));
            } else if (total1 <= 10 && radioButtonPanel.lowButton.isSelected()) {
                winningBanner.L1.setText("Total roll is: " + total1 + ". GALING MO, You win!");
                yourCashPanel.yourCashLabel.setText(Float.toString(yourCashPanel.yourCash += betAmount));

            } else {
                winningBanner.L1.setText("Total roll is: " + total1 + ". HAHAHAHA, You lose!");
                yourCashPanel.yourCashLabel.setText(Float.toString(yourCashPanel.yourCash -= betAmount));

            }

            if (randomizer.d1 == 1) {
                dicePanel1.diceLabel.setIcon(dicePanel1.dice1);
            } else if (randomizer.d1 == 2) {
                dicePanel1.diceLabel.setIcon(dicePanel1.dice2);
            } else if (randomizer.d1 == 3) {
                dicePanel1.diceLabel.setIcon(dicePanel1.dice3);
            } else if (randomizer.d1 == 4) {
                dicePanel1.diceLabel.setIcon(dicePanel1.dice4);
            } else if (randomizer.d1 == 5) {
                dicePanel1.diceLabel.setIcon(dicePanel1.dice5);
            } else if (randomizer.d1 == 6) {
                dicePanel1.diceLabel.setIcon(dicePanel1.dice6);
            }

            if (randomizer.d2 == 1) {
                dicePanel2.diceLabel.setIcon(dicePanel2.dice1);
            } else if (randomizer.d2 == 2) {
                dicePanel2.diceLabel.setIcon(dicePanel2.dice2);
            } else if (randomizer.d2 == 3) {
                dicePanel2.diceLabel.setIcon(dicePanel2.dice3);
            } else if (randomizer.d2 == 4) {
                dicePanel2.diceLabel.setIcon(dicePanel2.dice4);
            } else if (randomizer.d2 == 5) {
                dicePanel2.diceLabel.setIcon(dicePanel2.dice5);
            } else if (randomizer.d2 == 6) {
                dicePanel2.diceLabel.setIcon(dicePanel2.dice6);
            }

            if (randomizer.d3 == 1) {
                dicePanel3.diceLabel.setIcon(dicePanel3.dice1);
            } else if (randomizer.d3 == 2) {
                dicePanel3.diceLabel.setIcon(dicePanel3.dice2);
            } else if (randomizer.d3 == 3) {
                dicePanel3.diceLabel.setIcon(dicePanel3.dice3);
            } else if (randomizer.d3 == 4) {
                dicePanel3.diceLabel.setIcon(dicePanel3.dice4);
            } else if (randomizer.d3 == 5) {
                dicePanel3.diceLabel.setIcon(dicePanel3.dice5);
            } else if (randomizer.d3 == 6) {
                dicePanel3.diceLabel.setIcon(dicePanel3.dice6);
            }

            randomizer = new Randomizer();


        });


        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {

        BigAndSmall game = new BigAndSmall();

    }

}

