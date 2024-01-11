/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 11, 2024
 */

import javax.swing.*;

public class ImagePanel {

    JPanel image;
    ImageIcon rock, paper, scissors, none;
    JLabel poyLabel;

    public ImagePanel() {

        image = new JPanel();
        image.setLayout(null);
        image.setBounds(0,0,150,150);

        rock = new ImageIcon("Laus_JackAndPoy/images/rock.png");
        paper = new ImageIcon("Laus_JackAndPoy/images/paper.png");
        scissors = new ImageIcon("Laus_JackAndPoy/images/scissors.png");
        none = new ImageIcon("Laus_JackAndPoy/images/none.png");

        poyLabel = new JLabel();
        poyLabel.setIcon(none);
        poyLabel.setBounds(0,0,150,150);
        image.add(poyLabel);


    }
}
