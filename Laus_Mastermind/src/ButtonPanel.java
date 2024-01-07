    /*
     * Created by Angelo John Benedict Laus - CPE231
     * December 18, 2023
     */

    import javax.swing.*;

    public class ButtonPanel {

        JPanel buttonPanel;
        JButton submitButton;
        JButton exitButton;
        int tries = 0;

        public ButtonPanel() {

            buttonPanel = new JPanel();
            submitButton = new JButton("Submit");
            exitButton = new JButton("Exit");

            buttonPanel.setLayout(null);
            submitButton.setBounds(10,10,100,30);
            exitButton.setBounds(120,10,100,30);

            buttonPanel.add(submitButton);
            buttonPanel.add(exitButton);

        }

    }
