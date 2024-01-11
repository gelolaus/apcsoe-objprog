/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 11, 2024
 */

import javax.swing.*;
import java.awt.*;

public class WinnerBannerPanel {

    JPanel winningBanner;
    JLabel L1;

    public WinnerBannerPanel() {

        winningBanner = new JPanel();
        winningBanner.setLayout(new FlowLayout());

        L1 = new JLabel("Jack and Poy!");

        winningBanner.add(L1);

    }

}
