package lab10;

import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    JFrame frame;
    JPanel balancePanel, amountPanel, operationPanel;
    JButton depositButton, withdrawButton, exitButton;
    JTextField balanceTextField, amountTextField;
    JLabel balanceLabel, amountLabel;

    public TellerGUI() {
        frame = new JFrame("Teller GUI");
        frame.setLayout(new GridLayout(4, 1));

        balancePanel = new JPanel();
        balancePanel.setLayout(new GridLayout(1, 2));

        balanceLabel = new JLabel("Balance");
        balanceTextField = new JTextField();

        balancePanel.add(balanceLabel);
        balancePanel.add(balanceTextField);

        frame.add(balancePanel);

        amountPanel = new JPanel();
        amountPanel.setLayout(new GridLayout(1, 2));

        amountLabel = new JLabel("Amount");
        amountTextField = new JTextField();

        amountPanel.add(amountLabel);
        amountPanel.add(amountTextField);

        frame.add(amountPanel);

        operationPanel = new JPanel();
        operationPanel.setLayout(new GridLayout(1, 3));

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        exitButton = new JButton("Exit");

        operationPanel.add(depositButton);
        operationPanel.add(withdrawButton);
        operationPanel.add(exitButton);

        frame.add(operationPanel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}
