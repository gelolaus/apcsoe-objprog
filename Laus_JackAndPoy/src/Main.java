/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 11, 2024
 */

import javax.swing.*;
import java.awt.*;

public class Main {

    JFrame japFrame;
    WinnerBannerPanel winningBanner;
    HandOptionPanel handOption;
    ButtonPanel button;
    ScorePanel score;
    ImagePanel image1, image2;
    Randomizer randy;

    public Main() {

        randy = new Randomizer();
        japFrame = new JFrame("Jack and Poy");
        japFrame.setLayout(null);
        japFrame.setSize(360, 380);
        japFrame.setLocationRelativeTo(null);
        japFrame.setResizable(false);
        japFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        score = new ScorePanel();
        score.score.setBounds(0,0,350,40);
        japFrame.add(score.score);

        handOption = new HandOptionPanel();
        handOption.handOption.setBounds(0,45,350,40);
        japFrame.add(handOption.handOption);

        button = new ButtonPanel();
        button.button.setBounds(0,80,350,40);
        japFrame.add(button.button);

        winningBanner = new WinnerBannerPanel();
        winningBanner.winningBanner.setBounds(0,125,350,40);
        japFrame.add(winningBanner.winningBanner);

        image1 = new ImagePanel();
        image1.image.setBounds(20,170,150,150);
        japFrame.add(image1.image);
        image1.poyLabel.setIcon(image1.none);

        image2 = new ImagePanel();
        image2.image.setBounds(180,170,150,150);
        japFrame.add(image2.image);
        image2.poyLabel.setIcon(image2.none);

        japFrame.setVisible(true);

        // ----------------------------------------------------------------------------------------- //

        handOption.rockButton.addActionListener(e -> {
            image1.poyLabel.setIcon(image1.rock);
            image2.poyLabel.setIcon(image2.none);
        });
        handOption.paperButton.addActionListener(e -> {
            image1.poyLabel.setIcon(image1.paper);
            image2.poyLabel.setIcon(image2.none);
        });
        handOption.scissorsButton.addActionListener(e -> {
            image1.poyLabel.setIcon(image1.scissors);
            image2.poyLabel.setIcon(image2.none);
        });

        button.goButton.setEnabled(false);

        handOption.rockButton.addActionListener(e -> {
            button.goButton.setEnabled(true);
        }); handOption.paperButton.addActionListener(e -> {
            button.goButton.setEnabled(true);
        }); handOption.scissorsButton.addActionListener(e -> {
            button.goButton.setEnabled(true);
        });

        button.goButton.addActionListener(e -> {

            int user;
            if (handOption.rockButton.isSelected()) {
                user = 1;
            } else if (handOption.paperButton.isSelected()) {
                user = 2;
            } else {
                user = 3;
            }

            if (randy.pc == 1 && user == 1) {
                winningBanner.L1.setText("DRAW!");
            } else if (randy.pc == 1 && user == 2) {
                winningBanner.L1.setText("YOU WIN!");
                score.playerScore++;
                score.playerInput.setText(String.valueOf(score.playerScore));
            } else if (randy.pc == 1 && user == 3) {
                winningBanner.L1.setText("YOU LOSE!");
                score.computerScore++;
                score.computerInput.setText(String.valueOf(score.computerScore));
            } else if (randy.pc == 2 && user == 1) {
                winningBanner.L1.setText("YOU LOSE!");
                score.computerScore++;
                score.computerInput.setText(String.valueOf(score.computerScore));
            } else if (randy.pc == 2 && user == 2) {
                winningBanner.L1.setText("DRAW!");
            } else if (randy.pc == 2 && user == 3) {
                winningBanner.L1.setText("YOU WIN!");
                score.playerScore++;
                score.playerInput.setText(String.valueOf(score.playerScore));
            } else if (randy.pc == 3 && user == 1) {
                winningBanner.L1.setText("YOU WIN!");
                score.playerScore++;
                score.playerInput.setText(String.valueOf(score.playerScore));
            } else if (randy.pc == 3 && user == 2) {
                winningBanner.L1.setText("YOU LOSE!");
                score.computerScore++;
                score.computerInput.setText(String.valueOf(score.computerScore));
            } else if (randy.pc == 3 && user == 3) {
                winningBanner.L1.setText("DRAW!");
            }

            if (randy.pc == 1) {
                image2.poyLabel.setIcon(image2.rock);
            } else if (randy.pc == 2) {
                image2.poyLabel.setIcon(image2.paper);
            } else if (randy.pc == 3) {
                image2.poyLabel.setIcon(image2.scissors);
            }

            randy.pc = randy.createRandomNum();

            button.goButton.setEnabled(false);

        });

        button.resetButton.addActionListener(e -> {
            score.playerScore = 0;
            score.computerScore = 0;
            score.playerInput.setText(String.valueOf(score.playerScore));
            score.computerInput.setText(String.valueOf(score.computerScore));
            winningBanner.L1.setText(" ");
            image1.poyLabel.setIcon(image1.none);
            image2.poyLabel.setIcon(image2.none);
        });


    }

    public static void main(String[] args) {
        new Main();

    }
}