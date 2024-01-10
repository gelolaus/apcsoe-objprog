/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 4, 2024
 */

import javax.swing.*;
import java.awt.*;

public class ButtonPanel {

    JPanel buttonPanel;
    JButton rollButton;
    JButton exitButton;

    public ButtonPanel() {

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        rollButton = new JButton("Roll");
        exitButton = new JButton("Exit");

        buttonPanel.add(rollButton);
        buttonPanel.add(exitButton);

        exitButton.addActionListener(e -> System.exit(0));


    }

}
