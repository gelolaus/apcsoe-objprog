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

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(highButton);
        buttonGroup.add(lowButton);

        radioButtonPanel.add(highButton);
        radioButtonPanel.add(lowButton);




    }

}
