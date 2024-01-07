import javax.swing.*;
import java.awt.*;

public class YourBetPanel {
    JPanel yourBetPanel;
    JTextField yourBetField;
    Float yourBet = 0.00f;

    public YourBetPanel() {

        yourBetPanel = new JPanel();
        yourBetPanel.setLayout(new GridLayout(1,1));
        yourBetPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Your Bet"));

        yourBetField = new JTextField();
        yourBetField.setText(Float.toString(yourBet));
        yourBetPanel.add(yourBetField);


    }

}
