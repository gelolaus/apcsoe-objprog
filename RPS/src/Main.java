import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame MainFrame = new JFrame("Rock, Paper, Scissors!");
        PlayerInfo playerInfoPanel = new PlayerInfo();
        Selection selectionPanel = new Selection();

        MainFrame.setLayout(new FlowLayout());
        MainFrame.setSize(310,210);
        MainFrame.setResizable(false);
        MainFrame.add(playerInfoPanel.playerInfoPanel);
        MainFrame.add(selectionPanel.selectionPanel);

        MainFrame.setVisible(true);
        MainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}