package lab10;

import javax.swing.*;
import java.awt.*;

public class CalculatorTwoGUI {

    JFrame frame;
    JPanel buttonPanel;

    public CalculatorTwoGUI() {
        frame = new JFrame("My Calculator");
        frame.setLayout(new BorderLayout());

        frame.add(new JTextField(), BorderLayout.NORTH);

        String[] buttonText = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "x",
                "0", "c", "=", "/"
        };

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        for (String btnText : buttonText) {
            buttonPanel.add(new Button(btnText));
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
