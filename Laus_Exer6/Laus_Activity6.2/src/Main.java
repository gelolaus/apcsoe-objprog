import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        JFrame MainFrame = new JFrame("Temperature Converter");
        RadioButtonPanel MRBP = new RadioButtonPanel();
        TextPanel MTP = new TextPanel();
        ButtonPanel MBP = new ButtonPanel();

        MainFrame.setLayout(new FlowLayout());
        MainFrame.setSize(310,210);
        MainFrame.setResizable(false);
        MainFrame.add(MTP.TP);
        MainFrame.add(MRBP.RBP);
        MainFrame.add(MBP.BP);
        MainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel copyright = new JLabel("Created by Angelo Laus of CPE231");
        JLabel copyrightDate = new JLabel("Created on December 14, 2023");
        MainFrame.add(copyright);
        MainFrame.add(copyrightDate);

        MainFrame.setVisible(true);

        MRBP.celsiusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MTP.TextEnableCelsius();
            }
        });

        MRBP.fahrenheitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MTP.TextEnableFarenheit();
            }
        });

        DecimalFormat df = new DecimalFormat("0.00");

        MBP.convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (MRBP.fahrenheitButton.isSelected()) {

                    double Celsius = Double.parseDouble(MTP.celsiusTextField.getText());
                    double Farenheit = Celsius * 1.8 + 32;
                    MTP.fahrenheitTextField.setText(df.format(Farenheit));

                }

                else {

                    double Farenheit = Double.parseDouble(MTP.fahrenheitTextField.getText());
                    double Celsius = (Farenheit - 32) / 1.8;
                    MTP.celsiusTextField.setText(df.format(Celsius));

                }
            }
        });

        MBP.clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MTP.TextClear();

            }
        });

        MBP.exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}