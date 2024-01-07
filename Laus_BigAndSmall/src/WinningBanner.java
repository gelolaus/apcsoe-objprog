import javax.swing.*;
import java.awt.*;

public class WinningBanner {

    JPanel winningBanner;
    JLabel L1;

    public WinningBanner() {

        winningBanner = new JPanel();
        winningBanner.setLayout(new FlowLayout());

        L1 = new JLabel("Place Your Bet!");

        winningBanner.add(L1);

    }
}
