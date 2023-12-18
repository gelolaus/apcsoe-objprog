/*
 * Created by Angelo John Benedict Laus - CPE231
 * December 18, 2023
 */

import javax.swing.*;
import java.awt.*;

public class Mastermind {

    JFrame mainFrame;
    AnswerPanel[] MAP;
    CluePanel[] CP;
    InputPanel inputPanel;
    ButtonPanel buttonPanel;
    AnswerPanel secretPanel;



    public Mastermind() {

        // Create the main frame
        mainFrame = new JFrame("Mastermind");
        mainFrame.setLayout(null);
        mainFrame.setLocation(780,180);
        mainFrame.setSize(325,700);

        MAP = new AnswerPanel[10];

        int y_axis = 10;

        for (int i=0; i!=10; i++) {

            MAP[i] = new AnswerPanel();
            MAP[i].ansPanel.setBounds(20, y_axis, 220, 40);
            mainFrame.add(MAP[i].ansPanel);
            y_axis += 45;

        }

        y_axis = 10;

        CP = new CluePanel[10];

        for (int i=0; i!=10; i++) {

            CP[i] = new CluePanel();
            CP[i].cluePanel.setBounds(250, y_axis, 40, 40);
            mainFrame.add(CP[i].cluePanel);
            y_axis += 45;

        }

        JLabel answerLabel = new JLabel("Your Answer:");
        answerLabel.setBounds(20,460,100,20);
        mainFrame.add(answerLabel);

        inputPanel = new InputPanel();
        inputPanel.inputPanel.setBounds(20,480,270,40);
        mainFrame.add(inputPanel.inputPanel);

        buttonPanel = new ButtonPanel();
        buttonPanel.buttonPanel.setBounds(36,520,270,40);
        mainFrame.add(buttonPanel.buttonPanel);


        secretPanel = new AnswerPanel();
        secretPanel.makeSecret();
        secretPanel.ansPanel.setBounds(42,570,220,40);
        mainFrame.add(secretPanel.ansPanel);

        JLabel copyrightName = new JLabel("Created by Angelo Laus - CPE231");
        copyrightName.setBounds(56,615,270,20);
        JLabel copyrightDate = new JLabel("Created on December 18, 2023");
        copyrightDate.setBounds(62,635,270,20);

        mainFrame.add(copyrightName);
        mainFrame.add(copyrightDate);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {

        Mastermind mainFrame = new Mastermind();

    }

}
