/*
 * Created by Angelo John Benedict Laus - CPE231
 * December 18, 2023
 */

import javax.swing.*;
import java.awt.*;

public class InputPanel {

    JPanel inputPanel;
    JComboBox<String> guess1;
    JComboBox<String> guess2;
    JComboBox<String> guess3;
    JComboBox<String> guess4;
    JButton submitButton;
    JButton exitButton;

    public InputPanel() {

        inputPanel = new JPanel();
        guess1 = new JComboBox<>();
        guess2 = new JComboBox<>();
        guess3 = new JComboBox<>();
        guess4 = new JComboBox<>();
        submitButton = new JButton("Submit");
        exitButton = new JButton("Exit");

        inputPanel.setLayout(null);
        guess1.setBounds(10,10,60,30);
        guess2.setBounds(72,10,60,30);
        guess3.setBounds(134,10,60,30);
        guess4.setBounds(196,10,60,30);

        inputPanel.add(guess1);
        inputPanel.add(guess2);
        inputPanel.add(guess3);
        inputPanel.add(guess4);

        guess1.addItem("?");
        guess1.addItem("Blue");
        guess1.addItem("Green");
        guess1.addItem("Red");
        guess1.addItem("Yellow");
        guess1.addItem("Pink");
        guess1.addItem("Orange");

        guess2.addItem("?");
        guess2.addItem("Blue");
        guess2.addItem("Green");
        guess2.addItem("Red");
        guess2.addItem("Yellow");
        guess2.addItem("Pink");
        guess2.addItem("Orange");

        guess3.addItem("?");
        guess3.addItem("Blue");
        guess3.addItem("Green");
        guess3.addItem("Red");
        guess3.addItem("Yellow");
        guess3.addItem("Pink");
        guess3.addItem("Orange");

        guess4.addItem("?");
        guess4.addItem("Blue");
        guess4.addItem("Green");
        guess4.addItem("Red");
        guess4.addItem("Yellow");
        guess4.addItem("Pink");
        guess4.addItem("Orange");

    }

}
