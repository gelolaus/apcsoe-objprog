/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 15, 2023
 * FOR PERSONAL LEARNING
 */

import javax.swing.*;
import java.awt.*;

public class Selection {

    JPanel selectionPanel;
    JRadioButton rockButton;
    JRadioButton paperButton;
    JRadioButton scissorsButton;

    public Selection() {

        selectionPanel = new JPanel();
        rockButton = new JRadioButton("Rock");
        paperButton = new JRadioButton("Paper");
        scissorsButton = new JRadioButton("Scissors");

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(rockButton);
        radioGroup.add(paperButton);
        radioGroup.add(scissorsButton);

        selectionPanel.setSize(new Dimension(200, 60));
        selectionPanel.setLayout(new GridLayout(3, 1));

        selectionPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Select a move"));
        selectionPanel.add(rockButton);
        selectionPanel.add(paperButton);
        selectionPanel.add(scissorsButton);

    }

}
