import javax.swing.*;
import java.awt.*;

public class BigAndSmall {

    JFrame mainFrame;
    ButtonPanel buttonPanel;
    DicePanel dicePanel;
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
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {

BigAndSmall game = new BigAndSmall();

    }

}
