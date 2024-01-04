import javax.swing.*;
import java.awt.*;

public class BigAndSmall {

    JFrame mainFrame;
    ButtonPanel buttonPanel;
    DicePanel dicePanel1;
    DicePanel dicePanel2;
    DicePanel dicePanel3;
    RadioButtonPanel radioButtonPanel;
    Randomizer randomizer;
    WinningBanner winningBanner;
    YourBetPanel yourBetPanel;
    YourCashPanel yourCashPanel;


    public BigAndSmall() {

        mainFrame = new JFrame("Big and Small");
        mainFrame.setLayout(null);
        mainFrame.setLocation(400,200);
        mainFrame.setSize(500,500);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        yourCashPanel = new YourCashPanel();
        yourCashPanel.yourCashPanel.setBounds(20,20,450, 40);
        mainFrame.add(yourCashPanel.yourCashPanel);

        radioButtonPanel = new RadioButtonPanel();
        radioButtonPanel.radioButtonPanel.setBounds(10,70,100,100);
        mainFrame.add(radioButtonPanel.radioButtonPanel);

        yourBetPanel = new YourBetPanel();
        yourBetPanel.yourBetPanel.setBounds(130,70,340,60);
        mainFrame.add(yourBetPanel.yourBetPanel);

        winningBanner = new WinningBanner();
        winningBanner.winningBanner.setBounds(10,130,480,40);
        mainFrame.add(winningBanner.winningBanner);

        buttonPanel = new ButtonPanel();
        buttonPanel.buttonPanel.setBounds(0,160,500,40);
        mainFrame.add(buttonPanel.buttonPanel);

        dicePanel1 = new DicePanel();
        dicePanel1.dicePanel.setBounds(10,200,150,150);
        mainFrame.add(dicePanel1.dicePanel);

        dicePanel2 = new DicePanel();
        dicePanel2.dicePanel.setBounds(170,200,150,150);
        mainFrame.add(dicePanel2.dicePanel);

        dicePanel3 = new DicePanel();
        dicePanel3.dicePanel.setBounds(330,200,150,150);
        mainFrame.add(dicePanel3.dicePanel);

        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {

BigAndSmall game = new BigAndSmall();

    }

}
