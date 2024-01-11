/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 11, 2024
 */

import javax.swing.*;
import java.awt.*;

public class ButtonPanel {

    JPanel button;
    JButton goButton, resetButton, exitButton;

    public ButtonPanel() {

        button = new JPanel();
        button.setLayout(new FlowLayout());

        goButton = new JButton("Go");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");

        button.add(goButton);
        button.add(resetButton);
        button.add(exitButton);

        exitButton.addActionListener(e -> System.exit(0));

    }

}
