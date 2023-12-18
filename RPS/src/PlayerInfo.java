/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 15, 2023
 * FOR PERSONAL LEARNING
 */

import javax.swing.*;
import java.awt.*;


public class PlayerInfo {

    JPanel playerInfoPanel;
    JLabel player1Label;
    JLabel player2Label;
    JTextField player1TextField;
    JTextField player2TextField;

    public PlayerInfo() {

        playerInfoPanel = new JPanel();
        player1Label = new JLabel("Player 1: ");
        player2Label = new JLabel("Player 2: ");
        player1TextField = new JTextField("");
        player2TextField = new JTextField("");

        playerInfoPanel.setLayout(new GridLayout(2, 2));
        playerInfoPanel.add(player1Label);
        playerInfoPanel.add(player1TextField);
        playerInfoPanel.add(player2Label);
        playerInfoPanel.add(player2TextField);

    }

}
