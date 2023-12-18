import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*Create a JFrame GUI with six buttons.*/
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);


        JButton b1 = new JButton("Red"), b2 = new JButton("Blue"), b3 = new JButton("Green"), b4 = new JButton("Yellow"), b5 = new JButton("Orange"), b6 = new JButton("Pink");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(2,3));
        contentPane.add(b1);
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        contentPane.add(b5);
        contentPane.add(b6);
        frame.setVisible(true);

        b1.addActionListener(e -> {
            System.out.println("1");
        });
        b2.addActionListener(e -> {
            System.out.println("2");
        });
        b3.addActionListener(e -> {
            System.out.println("3");
        });
    }
}