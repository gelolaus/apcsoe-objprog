/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 4, 2024
 */

import javax.swing.*;
import java.awt.*;

public class RadioButtonPanel {

    JPanel radioButtonPanel;
    JRadioButton highButton, lowButton;

    public RadioButtonPanel() {

        radioButtonPanel = new JPanel();
        radioButtonPanel.setLayout(new FlowLayout());

        highButton = new JRadioButton("HIGH");
        lowButton = new JRadioButton("LOW");
        lowButton.setSelected(true);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(highButton);
        buttonGroup.add(lowButton);

        radioButtonPanel.add(highButton);
        radioButtonPanel.add(lowButton);




    }

}
