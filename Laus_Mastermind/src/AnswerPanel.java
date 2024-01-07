/*
 * Created by Angelo John Benedict Laus - CPE231
 * December 18, 2023
 */

import javax.swing.*;
import java.awt.*;

public class AnswerPanel {

    JPanel ansPanel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;

    public AnswerPanel() {

        ansPanel = new JPanel();
        label1 = new JLabel("■");
        label2 = new JLabel("■");
        label3 = new JLabel("■");
        label4 = new JLabel("■");

        label1.setForeground(Color.gray);
        label2.setForeground(Color.gray);
        label3.setForeground(Color.gray);
        label4.setForeground(Color.gray);

        ansPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        ansPanel.setLayout(null);
        label1.setBounds(25,10,20,20);
        label2.setBounds(80,10,20,20);
        label3.setBounds(135,10,20,20);
        label4.setBounds(190,10,20,20);

        ansPanel.add(label1);
        ansPanel.add(label2);
        ansPanel.add(label3);
        ansPanel.add(label4);

    }

    public void makeSecret() {

        this.label1.setText("?");
        this.label2.setText("?");
        this.label3.setText("?");
        this.label4.setText("?");

    }

    public void resetAll() {

        this.label1.setForeground(Color.gray);
        this.label2.setForeground(Color.gray);
        this.label3.setForeground(Color.gray);
        this.label4.setForeground(Color.gray);

    }

}
