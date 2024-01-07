/*
 * Created by Angelo John Benedict Laus - CPE231
 * December 18, 2023
 */

import javax.swing.*;
import java.awt.*;

public class CluePanel {

    JPanel cluePanel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;


    public CluePanel() {

        cluePanel = new JPanel();
        label1 = new JLabel("■");
        label2 = new JLabel("■");
        label3 = new JLabel("■");
        label4 = new JLabel("■");

        label1.setForeground(Color.gray);
        label2.setForeground(Color.gray);
        label3.setForeground(Color.gray);
        label4.setForeground(Color.gray);

        cluePanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        cluePanel.setLayout(null);
        label1.setBounds(9,4,20,20);
        label2.setBounds(19,4,20,20);
        label3.setBounds(9,14,20,20);
        label4.setBounds(19,14,20,20);

        cluePanel.add(label1);
        cluePanel.add(label2);
        cluePanel.add(label3);
        cluePanel.add(label4);


    }

    public void resetAll() {

        this.label1.setForeground(Color.gray);
        this.label2.setForeground(Color.gray);
        this.label3.setForeground(Color.gray);
        this.label4.setForeground(Color.gray);

    }


}
