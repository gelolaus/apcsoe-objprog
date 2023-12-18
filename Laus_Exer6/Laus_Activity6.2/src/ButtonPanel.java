    import javax.swing.*;
    import java.awt.*;

    public class ButtonPanel {

        JPanel BP;
        JButton convertButton;
        JButton clearButton;
        JButton exitButton;

        public ButtonPanel() {

            BP = new JPanel();
            convertButton = new JButton("Convert");
            clearButton = new JButton("Clear");
            exitButton = new JButton("Exit");

            BP.setLayout(new FlowLayout());
            BP.add(convertButton);
            BP.add(clearButton);
            BP.add(exitButton);

        }

    }
