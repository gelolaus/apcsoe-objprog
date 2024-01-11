/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 11, 2024
 */

import javax.swing.*;
import java.awt.*;

public class ScorePanel {

    JPanel score;
    JLabel playerLabel;
    JLabel computerLabel;
    JTextField playerInput;
    JTextField computerInput;
    int playerScore = 0;
    int computerScore = 0;

    public ScorePanel() {

        score = new JPanel();
        score.setLayout(new GridLayout(2,2));

        playerLabel = new JLabel("Player: ");
        computerLabel = new JLabel("Computer: ");

        playerInput = new JTextField((String.valueOf(playerScore)));
        computerInput = new JTextField((String.valueOf(computerScore)));

        playerInput.setEnabled(false);
        computerInput.setEnabled(false);

        playerInput.setDisabledTextColor(Color.black);
        computerInput.setDisabledTextColor(Color.black);

        score.add(playerLabel);
        score.add(computerLabel);
        score.add(playerInput);
        score.add(computerInput);



    }
}
