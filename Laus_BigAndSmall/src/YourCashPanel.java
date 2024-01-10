/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 4, 2024
 */

import javax.swing.*;
import java.awt.*;

public class YourCashPanel {

    JPanel yourCashPanel;
    JLabel yourCashLabel;
    Float yourCash = 5000.00f;

    public YourCashPanel() {

        yourCashPanel = new JPanel();
        yourCashPanel.setLayout(new GridLayout(1,1));
        yourCashPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Your Cash"));

        yourCashLabel = new JLabel();
        yourCashLabel.setText(Float.toString(yourCash));
        yourCashPanel.add(yourCashLabel);

    }

}
