import javax.swing.*;
import java.awt.*;

public class DicePanel {

    JPanel dicePanel;
    Image dice1, dice2, dice3, dice4, dice5, dice6;
    JLabel diceLabel;

    public DicePanel() {

    dicePanel = new JPanel();
    dicePanel.setLayout(null);
    dicePanel.setBounds(0, 0, 150, 150);

    dice1 = new ImageIcon("src/Images/rsz_dice_one.png").getImage();
    dice2 = new ImageIcon("src/Images/rsz_dice_two.png").getImage();
    dice3 = new ImageIcon("src/Images/rsz_dice_three.png").getImage();
    dice4 = new ImageIcon("src/Images/rsz_dice_four.png").getImage();
    dice5 = new ImageIcon("src/Images/rsz_dice_five.png").getImage();
    dice6 = new ImageIcon("src/Images/rsz_dice_six.png").getImage();

    dicePanel.setBorder(BorderFactory.createEtchedBorder());

    diceLabel = new JLabel();
    diceLabel.setIcon(new ImageIcon("src/Images/rsz_dice_one.png"));

    dicePanel.add(diceLabel);



    }

}
