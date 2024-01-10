/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 8, 2024
 */

import javax.swing.*;

public class DiceLabel {

    JLabel Dice;
    ImageIcon dice1;
    ImageIcon dice2;
    ImageIcon dice3;
    ImageIcon dice4;
    ImageIcon dice5;
    ImageIcon dice6;

    public DiceLabel(int diceNum) {

        Dice = new JLabel();
        dice1 = new ImageIcon("Laus_LabelButton/images/dice1.png");
        dice2 = new ImageIcon("Laus_LabelButton/images/dice2.png");
        dice3 = new ImageIcon("Laus_LabelButton/images/dice3.png");
        dice4 = new ImageIcon("Laus_LabelButton/images/dice4.png");
        dice5 = new ImageIcon("Laus_LabelButton/images/dice5.png");
        dice6 = new ImageIcon("Laus_LabelButton/images/dice6.png");

        switch(diceNum) {
            case 1:
                Dice.setIcon(dice1);
                break;
            case 2:
                Dice.setIcon(dice2);
                break;
            case 3:
                Dice.setIcon(dice3);
                break;
            case 4:
                Dice.setIcon(dice4);
                break;
            case 5:
                Dice.setIcon(dice5);
                break;
            case 6:
                Dice.setIcon(dice6);
                break;
            default:
                Dice.setIcon(dice1);
                break;

        }


    }

}
