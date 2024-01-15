import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingObject implements ActionListener {

    JPanel movingObjectPanel;
    JLabel movingArea;
    JLabel peg;
    ImageIcon black;
    JButton moveR, moveL, moveU, moveD, stop;
    int x = 0, y = 0;
    Timer timer;
    char direction;
    Boolean initial = false;

    public MovingObject() {

        movingObjectPanel = new JPanel();
        movingArea = new JLabel();

        movingObjectPanel.setLayout(null);
        movingArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        movingArea.setBounds(0,0,800,450);
        movingObjectPanel.setBounds(0,0,800,450);


        moveR = new JButton("Right");
        moveL = new JButton("Left");
        moveU = new JButton("Up");
        moveD = new JButton("Down");
        stop = new JButton("Stop");

        moveL.setBounds(10,520,100,30);
        moveR.setBounds(120,520,100,30);
        moveU.setBounds(60,480,100,30);
        moveD.setBounds(60,560,100,30);
        stop.setBounds(600,520,100,30);

        peg = new JLabel();
        black = new ImageIcon("Laus_TimerSample/images/peg.png");
        peg.setIcon(black);

        peg.setBounds(x,y,40,40);

        movingObjectPanel.add(moveR);
        movingObjectPanel.add(moveL);
        movingObjectPanel.add(moveU);
        movingObjectPanel.add(moveD);
        movingObjectPanel.add(stop);
        movingObjectPanel.add(peg);
        movingObjectPanel.add(movingArea);


    }

    public void move(char direction) {

        if (!this.initial) {
            timer = new Timer(5,this);

        }

        this.initial = true;
        timer.start();
        this.direction = direction;

    }

    @Override
    public void actionPerformed (ActionEvent e) {
        if ((x>760) || (x<0) || (y>410) || (y<0)) {

            timer.stop();

            if (x < 0) {
                x = 1;
            } else if (x > 760) {
                x = 759;
            } else if (y < 0) {
                y = 1;
            } else if (y > 410) {
                y = 409;
            }

        }

        if (this.direction == 'R') {

            moveR.setEnabled(false);
            moveL.setEnabled(true);
            moveU.setEnabled(true);
            moveD.setEnabled(true);

            x++;

        } else if (this.direction == 'L') {

            moveR.setEnabled(true);
            moveL.setEnabled(false);
            moveU.setEnabled(true);
            moveD.setEnabled(true);

            x--;

        } else if (this.direction == 'U') {

            moveR.setEnabled(true);
            moveL.setEnabled(true);
            moveU.setEnabled(false);
            moveD.setEnabled(true);

            y--;

        } else if (this.direction == 'D') {

            moveR.setEnabled(true);
            moveL.setEnabled(true);
            moveU.setEnabled(true);
            moveD.setEnabled(false);

            y++;

        }  else if (this.direction == 'S'){

            moveR.setEnabled(true);
            moveL.setEnabled(true);
            moveU.setEnabled(true);
            moveD.setEnabled(true);

            timer.stop();

        }

        peg.setBounds(x,y,40,40);



    }



}
