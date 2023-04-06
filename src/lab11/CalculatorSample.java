package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorSample implements ActionListener {

    JFrame frame;
    JPanel buttonPanel;
    JTextField textField;
    String operator;
    int result;

    public CalculatorSample() {
        frame = new JFrame("My Calculator");
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        frame.add(this.textField, BorderLayout.NORTH);

        String[] buttonText = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "0", "c", "=", "/"};

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        for (String btnText : buttonText) {
            Button btn = new Button(btnText);
            btn.addActionListener(this);

            buttonPanel.add(btn);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button button = (Button) e.getSource();
        String label = button.getLabel();

        if (label.contains("c")) {
            this.textField.setText("");
            return;
        }

        if ("0123456789".contains(label)) {
            this.textField.setText(this.textField.getText() + label);
            System.out.println(result + " " + operator);
            return;
        } else if ("+-x/".contains(label)) {
            this.operator = label;
            this.result = Integer.parseInt(this.textField.getText());
            this.textField.setText("");
            System.out.println(result + " " + operator);

            return;
        }

        int operand = Integer.parseInt(this.textField.getText());
        System.out.println("Operand: " + operand);

        if (label.equals("=")) {
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            } else if (operator.equals("x")) {
                result *= operand;
            } else if (operator.equals("/")) {
                result /= operand;
            }

            operator = "";
            this.textField.setText(this.result + "");

            System.out.println(result + " " + operator);

            return;
        }
        if (operator == null) {
            return;
        }

        if (label.equals("+")) {
            System.out.println("OK");
            result += operand;
        } else if (label.equals("-") && operand != 0) {
            result -= operand;
        } else if (label.equals("x") && operand != 0) {
            result *= operand;
        } else if (label.equals("/") && operand != 0) {
            result /= operand;
        }
        System.out.println(result + " " + operator);

        operator = "";
        this.textField.setText("");
    }

    public static void main(String[] args) {
        new CalculatorSample();
    }
}
