import javax.swing.*;
import java.awt.*;

public class ButtonPanel {

    JPanel buttonPanel;

    public ButtonPanel() {

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        //rollButton, exitButton
        JButton rollButton = new JButton("Roll");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(rollButton);
        buttonPanel.add(exitButton);

        exitButton.addActionListener(e -> System.exit(0));


    }

}
