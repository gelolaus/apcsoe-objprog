/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 8, 2024
 */

import javax.swing.*;

public class Main {
    JFrame mMF;
    JLabel mBackground;
    ImageIcon mBackgroundImage;

    public Main() {
        mMF = new JFrame("Label Button");
        mMF.setLayout(null);
        mMF.setLocation(200,0);
        mMF.setSize(920,400);
        mMF.setResizable(false);

        mBackground = new JLabel();
        mBackgroundImage = new ImageIcon("Laus_LabelButton/images/bg.jpg");
        mBackground.setIcon(mBackgroundImage);

        mMF.setContentPane(mBackground);

        DiceButtonPanel mDBP = new DiceButtonPanel();
        mDBP.mDBP.setBounds(0,0,920,250);
        mMF.add(mDBP.mDBP);


        mMF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mMF.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();

    }
}