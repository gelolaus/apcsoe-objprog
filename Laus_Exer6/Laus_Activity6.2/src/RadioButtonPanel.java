import javax.swing.*;
import java.awt.*;

public class RadioButtonPanel {

    JPanel RBP;
    JRadioButton celsiusButton;
    JRadioButton fahrenheitButton;

    public RadioButtonPanel() {
        RBP = new JPanel();
        celsiusButton = new JRadioButton("Celsius");
        fahrenheitButton = new JRadioButton("Fahrenheit");
        celsiusButton.doClick();

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(celsiusButton);
        radioGroup.add(fahrenheitButton);

        RBP.setSize(new Dimension(200,60));
        RBP.setLayout(new GridLayout(2, 1));

        RBP.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Convert to"));
        RBP.add(celsiusButton);
        RBP.add(fahrenheitButton);
    }

}
