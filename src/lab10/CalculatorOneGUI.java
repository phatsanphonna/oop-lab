package lab10;

import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {
    JFrame fr;
    JButton add, minus, multiply, divide;
    JTextField number1, number2, result;
    JPanel operator;

    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        fr.setLayout(new GridLayout(4, 1));

        number1 = new JTextField();
        number2 = new JTextField();

        fr.add(number1);
        fr.add(number2);

        operator = new JPanel();
        operator.setLayout(new FlowLayout());

        add = new JButton("บวก");
        minus = new JButton("ลบ");
        multiply = new JButton("คูณ");
        divide = new JButton("หาร");

        operator.add(add);
        operator.add(minus);
        operator.add(multiply);
        operator.add(divide);

        fr.add(operator);

        result = new JTextField();

        fr.add(result);

        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
