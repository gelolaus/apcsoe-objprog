import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerSample {

    JFrame mainFrame;
    MovingObject movingObject;

    public TimerSample() {
        mainFrame = new JFrame("Timer Sample");
        mainFrame.setSize(816, 650);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        movingObject = new MovingObject();
        movingObject.movingObjectPanel.setBounds(100,10,800,600);
        mainFrame.add(movingObject.movingObjectPanel);

        movingObject.moveR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movingObject.move('R');
            }
        });

        movingObject.moveL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movingObject.move('L');
            }
        });

        movingObject.moveU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movingObject.move('U');
            }
        });

        movingObject.moveD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movingObject.move('D');
            }
        });

        movingObject.stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movingObject.move('S');
            }
        });


        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new TimerSample();
    }

}
