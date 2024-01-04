import javax.swing.*;
import java.awt.*;

public class YourBetPanel {
    JPanel yourBetPanel;

    public YourBetPanel() {

        yourBetPanel = new JPanel();
        yourBetPanel.setLayout(new GridLayout(1,1));
        yourBetPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Your Bet"));

    }

}
