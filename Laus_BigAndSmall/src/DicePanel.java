/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 4, 2024
 */

import javax.swing.*;
import java.awt.*;

public class DicePanel {

    JPanel dicePanel;
    ImageIcon dice1, dice2, dice3, dice4, dice5, dice6;
    JLabel diceLabel;

    public DicePanel() {

    dicePanel = new JPanel();
    dicePanel.setLayout(null);
    dicePanel.setBorder(BorderFactory.createLineBorder(Color.black));
    dicePanel.setBounds(0, 0, 150, 150);

        dice1 = new ImageIcon("Laus_BigAndSmall/images/dice1.png");
        dice2 = new ImageIcon("Laus_BigAndSmall/images/dice2.png");
        dice3 = new ImageIcon("Laus_BigAndSmall/images/dice3.png");
        dice4 = new ImageIcon("Laus_BigAndSmall/images/dice4.png");
        dice5 = new ImageIcon("Laus_BigAndSmall/images/dice5.png");
        dice6 = new ImageIcon("Laus_BigAndSmall/images/dice6.png");

        diceLabel = new JLabel();
        diceLabel.setIcon(dice1);
        diceLabel.setBounds(0, 0, 150, 150);
        dicePanel.add(diceLabel);


    }

}
