import javax.swing.*;
import java.awt.*;

public class TextPanel {

    JPanel TP;
    JLabel celsiusLabel;
    JLabel fahrenheitLabel;
    JTextField celsiusTextField;
    JTextField fahrenheitTextField;

    public TextPanel() {

        TP = new JPanel();
        celsiusLabel = new JLabel("Celsius: ");
        fahrenheitLabel = new JLabel("Fahrenheit: ");
        celsiusTextField = new JTextField("");
        fahrenheitTextField = new JTextField("");

        this.TextEnableCelsius();

        TP.setLayout(new GridLayout(2,2));
        TP.add(celsiusLabel);
        TP.add(celsiusTextField);
        TP.add(fahrenheitLabel);
        TP.add(fahrenheitTextField);

    }

    public void TextEnableCelsius() {

        celsiusTextField.setEnabled(false);
        fahrenheitTextField.setEnabled(true);
        celsiusTextField.setDisabledTextColor(Color.black);
        celsiusTextField.setBackground(Color.green);
        fahrenheitTextField.setBackground(null);

    }

    public void TextEnableFarenheit() {

        celsiusTextField.setEnabled(true);
        fahrenheitTextField.setEnabled(false);
        fahrenheitTextField.setDisabledTextColor(Color.black);
        fahrenheitTextField.setBackground(Color.green);
        celsiusTextField.setBackground(null);

    }

    public void TextClear() {

        celsiusTextField.setText("");
        fahrenheitTextField.setText("");


    }

}

