/* Created By:
 * Angelo John Benedict Laus - CPE231
 * December 14, 2023
 */

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        JFrame MainFrame = new JFrame("Meter to Inches Converter");

        JPanel SelectorPanel = new JPanel();

            ButtonGroup SelectorGroup = new ButtonGroup();
                JRadioButton meterButton = new JRadioButton("Meter");
                JRadioButton inchesButton = new JRadioButton("Inches");
                meterButton.doClick();
                SelectorGroup.add(meterButton);
                SelectorGroup.add(inchesButton);

            SelectorPanel.add(meterButton);
            SelectorPanel.add(inchesButton);
            SelectorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Convert to"));

        JPanel TextAreaPanel = new JPanel();


            JTextArea meterTextArea = new JTextArea(1, 10);
            JTextArea inchesTextArea = new JTextArea(1, 10);
            meterTextArea.setLineWrap(true);
            inchesTextArea.setLineWrap(true);
            meterTextArea.setWrapStyleWord(true);
            inchesTextArea.setWrapStyleWord(true);
            meterTextArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Meter"));
            inchesTextArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Inches"));

            TextAreaPanel.add(meterTextArea);
            TextAreaPanel.add(inchesTextArea);

        JPanel ButtonPanel = new JPanel();

            JButton convertButton = new JButton("Convert");
            JButton clearButton = new JButton("Clear");
            JButton exitButton = new JButton("Exit");

            ButtonPanel.add(convertButton);
            ButtonPanel.add(clearButton);
            ButtonPanel.add(exitButton);

        JLabel copyright = new JLabel("Created by Angelo Laus of CPE231");
        JLabel copyrightDate = new JLabel("Created on December 14, 2023");

        MainFrame.add(TextAreaPanel);
        MainFrame.add(SelectorPanel);
        MainFrame.add(ButtonPanel);
        MainFrame.add(copyright);
        MainFrame.add(copyrightDate);

        MainFrame.setVisible(true);
        MainFrame.setLayout(new FlowLayout());
        MainFrame.setSize(310,250);
        MainFrame.setResizable(false);
        MainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DecimalFormat df = new DecimalFormat("0.00");

        convertButton.addActionListener(e -> {
            if (inchesButton.isSelected()) {
                double meter = Double.parseDouble(meterTextArea.getText());
                double inches = meter * 39.37;
                inchesTextArea.setText(df.format(inches));
            }
            else {
                double inches = Double.parseDouble(inchesTextArea.getText());
                double meter = inches / 39.37;
                meterTextArea.setText(df.format(meter));
            }
        });

        clearButton.addActionListener(e -> {
            meterTextArea.setText("");
            inchesTextArea.setText("");
        });

        exitButton.addActionListener(e -> {
            System.exit(0);
        });

    }
}