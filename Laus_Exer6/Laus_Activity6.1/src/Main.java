import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame Frame = new JFrame("GridLayout Test");
        Frame.setLayout(new GridLayout(2,2));
        Frame.setSize(300,200);
        Frame.setResizable(false);
        JButton Red = new JButton("Red");
        Red.setBackground(Color.red);
        JButton Green = new JButton("Green");
        Green.setBackground(Color.green);
        JButton Blue = new JButton("Blue");
        Blue.setBackground(Color.blue);
        JButton Yellow = new JButton("Yellow");
        Yellow.setBackground(Color.yellow);
        JButton Pink = new JButton("Pink");
        Pink.setBackground(Color.pink);
        JButton Orange = new JButton("Orange");
        Orange.setBackground(Color.orange);

        Frame.add(Red);
        Frame.add(Green);
        Frame.add(Blue);
        Frame.add(Yellow);
        Frame.add(Pink);
        Frame.add(Orange);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Frame.setVisible(true);

    }
}