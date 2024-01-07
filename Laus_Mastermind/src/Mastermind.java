/*
 * Created by Angelo John Benedict Laus - CPE231
 * December 18, 2023
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mastermind {

    JFrame mainFrame;
    AnswerPanel[] MAP;
    CluePanel[] CP;
    InputPanel inputPanel;
    ButtonPanel buttonPanel;
    AnswerPanel secretPanel;
    RandomNumber randomColor;



    public Mastermind() {

        mainFrame = new JFrame("Mastermind");
        mainFrame.setLayout(null);
        mainFrame.setLocation(780,180);
        mainFrame.setSize(325,700);

        MAP = new AnswerPanel[10];

        int y_axis = 10;

        for (int i=0; i!=10; i++) {

            MAP[i] = new AnswerPanel();
            MAP[i].ansPanel.setBounds(20, y_axis, 220, 40);
            mainFrame.add(MAP[i].ansPanel);
            y_axis += 45;

        }

        y_axis = 10;

        CP = new CluePanel[10];

        for (int i=0; i!=10; i++) {

            CP[i] = new CluePanel();
            CP[i].cluePanel.setBounds(250, y_axis, 40, 40);
            mainFrame.add(CP[i].cluePanel);
            y_axis += 45;

        }

        JLabel answerLabel = new JLabel("Your Answer:");
        answerLabel.setBounds(20,460,100,20);
        mainFrame.add(answerLabel);

        inputPanel = new InputPanel();
        inputPanel.inputPanel.setBounds(20,480,270,40);
        mainFrame.add(inputPanel.inputPanel);

        buttonPanel = new ButtonPanel();
        buttonPanel.buttonPanel.setBounds(36,520,270,40);
        mainFrame.add(buttonPanel.buttonPanel);


        secretPanel = new AnswerPanel();
        secretPanel.makeSecret();
        secretPanel.ansPanel.setBounds(42,570,220,40);
        mainFrame.add(secretPanel.ansPanel);

        randomColor = new RandomNumber();


        JLabel copyrightName = new JLabel("Created by Angelo Laus - CPE231");
        copyrightName.setBounds(56,615,270,20);
        JLabel copyrightDate = new JLabel("Created on December 18, 2023");
        copyrightDate.setBounds(62,635,270,20);

        mainFrame.add(copyrightName);
        mainFrame.add(copyrightDate);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

        inputPanel.guess1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int xColor = inputPanel.guess1.getSelectedIndex();

                switch (xColor) {
                    case 1:
                        MAP[buttonPanel.tries].label1.setForeground(Color.blue);
                        break;
                    case 2:
                        MAP[buttonPanel.tries].label1.setForeground(Color.green);
                        break;
                    case 3:
                        MAP[buttonPanel.tries].label1.setForeground(Color.red);
                        break;
                    case 4:
                        MAP[buttonPanel.tries].label1.setForeground(Color.yellow);
                        break;
                    case 5:
                        MAP[buttonPanel.tries].label1.setForeground(Color.pink);
                        break;
                    case 6:
                        MAP[buttonPanel.tries].label1.setForeground(Color.orange);
                        break;
                    default:
                        MAP[buttonPanel.tries].label1.setForeground(Color.gray);
                        break;
                }
            }
        });

        inputPanel.guess2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int xColor = inputPanel.guess2.getSelectedIndex();

                switch (xColor) {
                    case 1:
                        MAP[buttonPanel.tries].label2.setForeground(Color.blue);
                        break;
                    case 2:
                        MAP[buttonPanel.tries].label2.setForeground(Color.green);
                        break;
                    case 3:
                        MAP[buttonPanel.tries].label2.setForeground(Color.red);
                        break;
                    case 4:
                        MAP[buttonPanel.tries].label2.setForeground(Color.yellow);
                        break;
                    case 5:
                        MAP[buttonPanel.tries].label2.setForeground(Color.pink);
                        break;
                    case 6:
                        MAP[buttonPanel.tries].label2.setForeground(Color.orange);
                        break;
                    default:
                        MAP[buttonPanel.tries].label2.setForeground(Color.gray);
                        break;
                }
            }
        });

        inputPanel.guess3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int xColor = inputPanel.guess3.getSelectedIndex();

                switch (xColor) {
                    case 1:
                        MAP[buttonPanel.tries].label3.setForeground(Color.blue);
                        break;
                    case 2:
                        MAP[buttonPanel.tries].label3.setForeground(Color.green);
                        break;
                    case 3:
                        MAP[buttonPanel.tries].label3.setForeground(Color.red);
                        break;
                    case 4:
                        MAP[buttonPanel.tries].label3.setForeground(Color.yellow);
                        break;
                    case 5:
                        MAP[buttonPanel.tries].label3.setForeground(Color.pink);
                        break;
                    case 6:
                        MAP[buttonPanel.tries].label3.setForeground(Color.orange);
                        break;
                    default:
                        MAP[buttonPanel.tries].label3.setForeground(Color.gray);
                        break;
                }
            }
        });

        inputPanel.guess4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int xColor = inputPanel.guess4.getSelectedIndex();

                switch (xColor) {
                    case 1:
                        MAP[buttonPanel.tries].label4.setForeground(Color.blue);
                        break;
                    case 2:
                        MAP[buttonPanel.tries].label4.setForeground(Color.green);
                        break;
                    case 3:
                        MAP[buttonPanel.tries].label4.setForeground(Color.red);
                        break;
                    case 4:
                        MAP[buttonPanel.tries].label4.setForeground(Color.yellow);
                        break;
                    case 5:
                        MAP[buttonPanel.tries].label4.setForeground(Color.pink);
                        break;
                    case 6:
                        MAP[buttonPanel.tries].label4.setForeground(Color.orange);
                        break;
                    default:
                        MAP[buttonPanel.tries].label4.setForeground(Color.gray);
                        break;
                }
            }
        });

        buttonPanel.submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int countBlack = 0;
                int countWhite = 0;
                int [] A = {0,0,0,0};
                int [] S = {0,0,0,0};

                A[0] = inputPanel.guess1.getSelectedIndex();
                A[1] = inputPanel.guess2.getSelectedIndex();
                A[2] = inputPanel.guess3.getSelectedIndex();
                A[3] = inputPanel.guess4.getSelectedIndex();

                S[0] = randomColor.p1;
                S[1] = randomColor.p2;
                S[2] = randomColor.p3;
                S[3] = randomColor.p4;

                for (int i=0; i!=4; i++) {
                    if (A[i]==S[i]) {
                        countBlack++;
                        A[i] = 10;
                        S[i] = 10;
                    }
                }

                System.out.println("Black: " + countBlack);



                for (int i=0; i!=4; i++) {
                    for (int j=0; j!=4; j++) {

                        if ((A[i]!=10) && (S[j]!=10)) {
                            if (A[i]==S[j]) {
                                countWhite++;
                                A[i] = 10;
                                S[j] = 10;
                            }
                        }

                    }
                }

                System.out.println("White: " + countWhite);

                if (countBlack==0) {
                    if (countWhite==1) {
                        CP[buttonPanel.tries].label1.setForeground(Color.white);
                    } else if (countWhite==2) {
                        CP[buttonPanel.tries].label1.setForeground(Color.white);
                        CP[buttonPanel.tries].label2.setForeground(Color.white);
                    } else if (countWhite==3) {
                        CP[buttonPanel.tries].label1.setForeground(Color.white);
                        CP[buttonPanel.tries].label2.setForeground(Color.white);
                        CP[buttonPanel.tries].label3.setForeground(Color.white);
                    } else if (countWhite==4) {
                        CP[buttonPanel.tries].label1.setForeground(Color.white);
                        CP[buttonPanel.tries].label2.setForeground(Color.white);
                        CP[buttonPanel.tries].label3.setForeground(Color.white);
                        CP[buttonPanel.tries].label4.setForeground(Color.white);
                    }
                }

                if (countBlack==1) {
                    if (countWhite==1) {
                        CP[buttonPanel.tries].label1.setForeground(Color.black);
                        CP[buttonPanel.tries].label2.setForeground(Color.white);
                    } else if (countWhite==2) {
                        CP[buttonPanel.tries].label1.setForeground(Color.black);
                        CP[buttonPanel.tries].label2.setForeground(Color.white);
                        CP[buttonPanel.tries].label3.setForeground(Color.white);
                    } else if (countWhite==3) {
                        CP[buttonPanel.tries].label1.setForeground(Color.black);
                        CP[buttonPanel.tries].label2.setForeground(Color.white);
                        CP[buttonPanel.tries].label3.setForeground(Color.white);
                        CP[buttonPanel.tries].label4.setForeground(Color.white);
                    }
                }

                if (countBlack==2) {
                    if (countWhite==1) {
                        CP[buttonPanel.tries].label1.setForeground(Color.black);
                        CP[buttonPanel.tries].label2.setForeground(Color.black);
                        CP[buttonPanel.tries].label3.setForeground(Color.white);
                    } else if (countWhite==2) {
                        CP[buttonPanel.tries].label1.setForeground(Color.black);
                        CP[buttonPanel.tries].label2.setForeground(Color.black);
                        CP[buttonPanel.tries].label3.setForeground(Color.white);
                        CP[buttonPanel.tries].label4.setForeground(Color.white);
                    }
                }

                if (countBlack==3) {
                    if (countWhite==1) {
                        CP[buttonPanel.tries].label1.setForeground(Color.black);
                        CP[buttonPanel.tries].label2.setForeground(Color.black);
                        CP[buttonPanel.tries].label3.setForeground(Color.black);
                        CP[buttonPanel.tries].label4.setForeground(Color.white);
                    }
                }

                if (countBlack==4) {

                    CP[buttonPanel.tries].label1.setForeground(Color.black);
                    CP[buttonPanel.tries].label2.setForeground(Color.black);
                    CP[buttonPanel.tries].label3.setForeground(Color.black);
                    CP[buttonPanel.tries].label4.setForeground(Color.black);

                    secretPanel.label1.setText("■");
                    secretPanel.label2.setText("■");
                    secretPanel.label3.setText("■");
                    secretPanel.label4.setText("■");

                    if (randomColor.p1==1) {
                        secretPanel.label1.setForeground(Color.blue);
                    } else if (randomColor.p1==2) {
                        secretPanel.label1.setForeground(Color.green);
                    } else if (randomColor.p1==3) {
                        secretPanel.label1.setForeground(Color.red);
                    } else if (randomColor.p1==4) {
                        secretPanel.label1.setForeground(Color.yellow);
                    } else if (randomColor.p1==5) {
                        secretPanel.label1.setForeground(Color.pink);
                    } else if (randomColor.p1==6) {
                        secretPanel.label1.setForeground(Color.orange);
                    }

                    if (randomColor.p2==1) {
                        secretPanel.label2.setForeground(Color.blue);
                    } else if (randomColor.p2==2) {
                        secretPanel.label2.setForeground(Color.green);
                    } else if (randomColor.p2==3) {
                        secretPanel.label2.setForeground(Color.red);
                    } else if (randomColor.p2==4) {
                        secretPanel.label2.setForeground(Color.yellow);
                    } else if (randomColor.p2==5) {
                        secretPanel.label2.setForeground(Color.pink);
                    } else if (randomColor.p2==6) {
                        secretPanel.label2.setForeground(Color.orange);
                    }

                    if (randomColor.p3==1) {
                        secretPanel.label3.setForeground(Color.blue);
                    } else if (randomColor.p3==2) {
                        secretPanel.label3.setForeground(Color.green);
                    } else if (randomColor.p3==3) {
                        secretPanel.label3.setForeground(Color.red);
                    } else if (randomColor.p3==4) {
                        secretPanel.label3.setForeground(Color.yellow);
                    } else if (randomColor.p3==5) {
                        secretPanel.label3.setForeground(Color.pink);
                    } else if (randomColor.p3==6) {
                        secretPanel.label3.setForeground(Color.orange);
                    }

                    if (randomColor.p4==1) {
                        secretPanel.label4.setForeground(Color.blue);
                    } else if (randomColor.p4==2) {
                        secretPanel.label4.setForeground(Color.green);
                    } else if (randomColor.p4==3) {
                        secretPanel.label4.setForeground(Color.red);
                    } else if (randomColor.p4==4) {
                        secretPanel.label4.setForeground(Color.yellow);
                    } else if (randomColor.p4==5) {
                        secretPanel.label4.setForeground(Color.pink);
                    } else if (randomColor.p4==6) {
                        secretPanel.label4.setForeground(Color.orange);
                    }


                    JOptionPane.showMessageDialog(null, "You Win!");

                    buttonPanel.tries = -1;
                    for (int i=0; i!=10; i++) {
                        MAP[i].resetAll();
                        CP[i].resetAll();
                    }
                    secretPanel.makeSecret();
                    secretPanel.resetAll();
                    randomColor.resetAll();

                }



                if (buttonPanel.tries<9) {
                    buttonPanel.tries++;
                    inputPanel.reset();
                } else {
                    secretPanel.label1.setText("■");
                    secretPanel.label2.setText("■");
                    secretPanel.label3.setText("■");
                    secretPanel.label4.setText("■");

                    if (randomColor.p1==1) {
                        secretPanel.label1.setForeground(Color.blue);
                    } else if (randomColor.p1==2) {
                        secretPanel.label1.setForeground(Color.green);
                    } else if (randomColor.p1==3) {
                        secretPanel.label1.setForeground(Color.red);
                    } else if (randomColor.p1==4) {
                        secretPanel.label1.setForeground(Color.yellow);
                    } else if (randomColor.p1==5) {
                        secretPanel.label1.setForeground(Color.pink);
                    } else if (randomColor.p1==6) {
                        secretPanel.label1.setForeground(Color.orange);
                    }

                    if (randomColor.p2==1) {
                        secretPanel.label2.setForeground(Color.blue);
                    } else if (randomColor.p2==2) {
                        secretPanel.label2.setForeground(Color.green);
                    } else if (randomColor.p2==3) {
                        secretPanel.label2.setForeground(Color.red);
                    } else if (randomColor.p2==4) {
                        secretPanel.label2.setForeground(Color.yellow);
                    } else if (randomColor.p2==5) {
                        secretPanel.label2.setForeground(Color.pink);
                    } else if (randomColor.p2==6) {
                        secretPanel.label2.setForeground(Color.orange);
                    }

                    if (randomColor.p3==1) {
                        secretPanel.label3.setForeground(Color.blue);
                    } else if (randomColor.p3==2) {
                        secretPanel.label3.setForeground(Color.green);
                    } else if (randomColor.p3==3) {
                        secretPanel.label3.setForeground(Color.red);
                    } else if (randomColor.p3==4) {
                        secretPanel.label3.setForeground(Color.yellow);
                    } else if (randomColor.p3==5) {
                        secretPanel.label3.setForeground(Color.pink);
                    } else if (randomColor.p3==6) {
                        secretPanel.label3.setForeground(Color.orange);
                    }

                    if (randomColor.p4==1) {
                        secretPanel.label4.setForeground(Color.blue);
                    } else if (randomColor.p4==2) {
                        secretPanel.label4.setForeground(Color.green);
                    } else if (randomColor.p4==3) {
                        secretPanel.label4.setForeground(Color.red);
                    } else if (randomColor.p4==4) {
                        secretPanel.label4.setForeground(Color.yellow);
                    } else if (randomColor.p4==5) {
                        secretPanel.label4.setForeground(Color.pink);
                    } else if (randomColor.p4==6) {
                        secretPanel.label4.setForeground(Color.orange);
                    }

                    JOptionPane.showMessageDialog(null, "You Lose!");

                    buttonPanel.tries = -1;
                    for (int i=0; i!=10; i++) {
                        MAP[i].resetAll();
                        CP[i].resetAll();
                    }
                    secretPanel.makeSecret();
                    secretPanel.resetAll();
                    randomColor.resetAll();

                }

            }
        });

        buttonPanel.exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }


    public static void main(String[] args) {

        Mastermind mainFrame = new Mastermind();

    }

}
