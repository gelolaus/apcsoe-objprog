/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 11, 2024
 */

import javax.swing.*;
import java.awt.*;

public class HandOptionPanel {

    JPanel handOption;
    JRadioButton rockButton, paperButton, scissorsButton;

    public HandOptionPanel() {

        handOption = new JPanel();
        handOption.setLayout(new FlowLayout());

        rockButton = new JRadioButton("Rock");
        paperButton = new JRadioButton("Paper");
        scissorsButton = new JRadioButton("Scissors");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rockButton);
        buttonGroup.add(paperButton);
        buttonGroup.add(scissorsButton);

        handOption.add(rockButton);
        handOption.add(paperButton);
        handOption.add(scissorsButton);

    }

}
