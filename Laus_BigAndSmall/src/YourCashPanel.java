import javax.swing.*;
import java.awt.*;

public class YourCashPanel {

    JPanel yourCashPanel;
    JLabel yourCashLabel;
    float yourCash = 5000.00f;

    public YourCashPanel() {

        yourCashPanel = new JPanel();
        yourCashPanel.setLayout(new GridLayout(1,1));
        yourCashPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Your Cash"));

        yourCashLabel = new JLabel("" + yourCash);
        yourCashPanel.add(yourCashLabel);

    }

}
