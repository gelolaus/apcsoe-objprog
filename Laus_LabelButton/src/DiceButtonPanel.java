/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 8, 2024
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class DiceMouseListener implements MouseListener {

    private final JComponent diceComponent;
    private final JLabel diceInfo;
    private final int diceNumber;

    public DiceMouseListener(JComponent diceComponent, JLabel diceInfo, int diceNumber) {
        this.diceComponent = diceComponent;
        this.diceInfo = diceInfo;
        this.diceNumber = diceNumber;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getButton() == MouseEvent.BUTTON1) {
            diceInfo.setText("Left mouse button clicked " + diceNumber + "!");
        } else if (e.getButton() == MouseEvent.BUTTON2) {
            diceInfo.setText("Middle mouse button clicked " + diceNumber + "!");
        } else {
            diceInfo.setText("Right mouse button clicked " + diceNumber + "!");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getButton() == MouseEvent.BUTTON1) {
            int newX = diceComponent.getX() + 10;
            int newY = diceComponent.getY();
            int newWidth = diceComponent.getWidth();
            int newHeight = diceComponent.getHeight();
            diceComponent.setBounds(newX, newY, newWidth, newHeight);
        } else if (e.getButton() == MouseEvent.BUTTON2) {
            int newX = diceComponent.getX();
            int newY = diceComponent.getY();
            int newWidth = diceComponent.getWidth() + 10;
            int newHeight = diceComponent.getHeight() + 10;
            diceComponent.setBounds(newX, newY, newWidth, newHeight);
        } else {
            int newX = diceComponent.getX() - 10;
            int newY = diceComponent.getY();
            int newWidth = diceComponent.getWidth();
            int newHeight = diceComponent.getHeight();
            diceComponent.setBounds(newX, newY, newWidth, newHeight);
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        if (e.getButton() == MouseEvent.BUTTON1) {
            int newX = diceComponent.getX() - 10;
            int newY = diceComponent.getY();
            int newWidth = diceComponent.getWidth();
            int newHeight = diceComponent.getHeight();
            diceComponent.setBounds(newX, newY, newWidth, newHeight);
        } else if (e.getButton() == MouseEvent.BUTTON2) {
            int newX = diceComponent.getX();
            int newY = diceComponent.getY();
            int newWidth = diceComponent.getWidth() - 10;
            int newHeight = diceComponent.getHeight() - 10;
            diceComponent.setBounds(newX, newY, newWidth, newHeight);
        } else {
            int newX = diceComponent.getX() + 10;
            int newY = diceComponent.getY();
            int newWidth = diceComponent.getWidth();
            int newHeight = diceComponent.getHeight();
            diceComponent.setBounds(newX, newY, newWidth, newHeight);
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        diceInfo.setText("Mouse is currently inside " + diceNumber + "!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        diceInfo.setText("Mouse ran away from the dice!");
    }
}


public class DiceButtonPanel {

    JPanel mDBP;
    DiceLabel diceOne;
    DiceLabel diceTwo;
    DiceLabel diceThree;
    DiceLabel diceFour;
    DiceLabel diceFive;
    DiceLabel diceSix;
    JLabel diceInfo;

    public DiceButtonPanel() {

        mDBP = new JPanel();
        mDBP.setLayout(null);
        mDBP.setOpaque(false);

        diceOne = new DiceLabel(1);
        diceTwo = new DiceLabel(2);
        diceThree = new DiceLabel(3);
        diceFour = new DiceLabel(4);
        diceFive = new DiceLabel(5);
        diceSix = new DiceLabel(6);

        diceInfo = new JLabel("The button clicked will be displayed here...");

        diceOne.Dice.setBounds(0,0,150,150);
        diceTwo.Dice.setBounds(150,0,150,150);
        diceThree.Dice.setBounds(300,0,150,150);
        diceFour.Dice.setBounds(450,0,150,150);
        diceFive.Dice.setBounds(600,0,150,150);
        diceSix.Dice.setBounds(750,0,150,150);

        diceInfo.setBounds(0,150,920,50);

        mDBP.add(diceOne.Dice);
        mDBP.add(diceTwo.Dice);
        mDBP.add(diceThree.Dice);
        mDBP.add(diceFour.Dice);
        mDBP.add(diceFive.Dice);
        mDBP.add(diceSix.Dice);
        mDBP.add(diceInfo, Component.CENTER_ALIGNMENT);

        DiceMouseListener listener1 = new DiceMouseListener(diceOne.Dice, diceInfo, 1);
        DiceMouseListener listener2 = new DiceMouseListener(diceTwo.Dice, diceInfo, 2);
        DiceMouseListener listener3 = new DiceMouseListener(diceThree.Dice, diceInfo, 3);
        DiceMouseListener listener4 = new DiceMouseListener(diceFour.Dice, diceInfo, 4);
        DiceMouseListener listener5 = new DiceMouseListener(diceFive.Dice, diceInfo, 5);
        DiceMouseListener listener6 = new DiceMouseListener(diceSix.Dice, diceInfo, 6);

        diceOne.Dice.addMouseListener(listener1);
        diceTwo.Dice.addMouseListener(listener2);
        diceThree.Dice.addMouseListener(listener3);
        diceFour.Dice.addMouseListener(listener4);
        diceFive.Dice.addMouseListener(listener5);
        diceSix.Dice.addMouseListener(listener6);

    }

}
